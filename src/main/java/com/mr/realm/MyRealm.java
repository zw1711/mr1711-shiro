package com.mr.realm;

import com.mr.model.User;
import com.mr.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.apache.shiro.web.filter.authz.AuthorizationFilter;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ${zw} on 2018/5/25.
 */
public class MyRealm extends AuthorizingRealm{

    @Autowired
    private UserService userService;

    @Override
    public String getName() {
        return "MyRealm";
    }

    //授权
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        User user = (User)principalCollection.getPrimaryPrincipal();
        //角色
        List<String> roles = userService.selectRolesById(user.getId());
        //定义权限集合
        List<String> permissions = userService.selectPermissionById(user.getId());

        SimpleAuthorizationInfo Info = new SimpleAuthorizationInfo();

        Info.addRoles(roles);

        Info.addStringPermissions(permissions);
        return Info;

    }

    //认证
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        //注意：前台表单的name值必须为 username 和 password
        //1:获取用户名
        String username = token.getUsername();

        User user = userService.getUserByUserName(username);

        if (user == null) {
            return null;
        }

        //创建 SimpleAuthenticationInfo
        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user,user.getPassword(), ByteSource.Util.bytes(username),getName());
        return info;
    }



    //清除缓存，修改角色和权限之后，需要手动清除
    public void clearCached() {
        PrincipalCollection principals = SecurityUtils.getSubject().getPrincipals();
        super.clearCache(principals);
    }

}
