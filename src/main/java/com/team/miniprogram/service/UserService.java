package com.team.miniprogram.service;

import com.team.miniprogram.model.pojo.User;

public interface UserService {
    void setUserInfo(User user);

    User getUserInfo(User user);
}
