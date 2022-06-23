package com.team.miniprogram.controller;

import com.team.miniprogram.common.ApiRestResponse;
import com.team.miniprogram.exception.ProgramException;
import com.team.miniprogram.exception.ProgramExceptionEnum;
import com.team.miniprogram.model.pojo.User;
import com.team.miniprogram.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

import static com.team.miniprogram.common.Constant.OPENID;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @GetMapping("/setUserInfo")
    @ResponseBody
    public ApiRestResponse setUserInfo(String avatarUrl, String nickName, HttpServletRequest request) {
        User user = new User();
        user.setImage(avatarUrl);
        user.setNickname(nickName);
        user.setOpenid(request.getHeader(OPENID));
        System.out.println(user);
        userService.setUserInfo(user);
        return ApiRestResponse.success();
    }

    @GetMapping("/getUserInfo")
    @ResponseBody
    public ApiRestResponse getUserInfo(HttpServletRequest request) {
        User user = new User();
        user.setOpenid(request.getHeader(OPENID));
        user = userService.getUserInfo(user);
        if(user==null){
            return ApiRestResponse.error(ProgramExceptionEnum.SELECT_FAILED);
        }
        return ApiRestResponse.success(userService.getUserInfo(user));
    }
}
