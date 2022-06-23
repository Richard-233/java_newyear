package com.team.miniprogram.service.impl;

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
        int count = userMapper.updateByPrimaryKeySelective(user);
        if (count == 0) userMapper.insertSelective(user);
    }

    @Override
    public User getUserInfo(User user){
        return userMapper.selectByPrimaryKey(user.getOpenid());
    }
}
