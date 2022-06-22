package com.team.miniprogram.controller;

import com.team.miniprogram.model.pojo.Suggestion;
import com.team.miniprogram.service.SuggestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

/**
 * 描述：用户控制器
 *
 * @author Richard Young
 */
@Controller
public class SuggestionController {
    @Autowired
    SuggestionService suggestionService;

    @GetMapping("/get")
    @ResponseBody
    public String suggestionList(HttpServletRequest request) {
        return "openid是这个"+request.getHeader("X-WX-OPENID");
    }
}
