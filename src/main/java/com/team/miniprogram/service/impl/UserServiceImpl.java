package com.team.miniprogram.service.impl;

import com.team.miniprogram.exception.ProgramException;
import com.team.miniprogram.exception.ProgramExceptionEnum;
import com.team.miniprogram.model.dao.UserMapper;
import com.team.miniprogram.model.pojo.User;
import com.team.miniprogram.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public void setUserInfo(User user) {
        User user_select = userMapper.selectByPrimaryKey(user.getOpenid());
        if(user_select==null){
            throw new ProgramException(ProgramExceptionEnum.INSERT_FAILED);
        }
        else userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public User getUserInfo(User user){
        User user_select = userMapper.selectByPrimaryKey(user.getOpenid());
        if(user_select!=null){
            return user_select;
        }
        else{
            userMapper.insertSelective(user);
            return user;
        }
    }
}
