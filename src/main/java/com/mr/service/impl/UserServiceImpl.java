package com.mr.service.impl;

import com.mr.mapper.UserMapper;
import com.mr.model.User;
import com.mr.model.UserExample;
import com.mr.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by ${zw} on 2018/5/25.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {


    @Autowired
    private UserMapper userMapper;


    public User getUserByUserName(String username) {

        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(username);
        List<User> list = userMapper.selectByExample(example);

        if (list.size() == 0){
            return null;
        }else{
            return list.get(0);
        }


    }



    //通过用户id查询角色
    public List<String> selectRolesById(Integer id) {
        return userMapper.selectRolesById(id);
    }



    //通过用户id查询权限
    public List<String> selectPermissionById(Integer id) {
        return userMapper.selectPermissionById(id);
    }
}
