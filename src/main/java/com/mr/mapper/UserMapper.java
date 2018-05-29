package com.mr.mapper;

import com.mr.model.User;
import com.mr.model.UserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.PathVariable;

public interface UserMapper {
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List <String> selectRolesById(@Param("id") Integer userId);

    List <String> selectPermissionById(@Param("id") Integer userId);

}