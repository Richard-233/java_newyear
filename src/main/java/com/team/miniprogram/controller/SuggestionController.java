package com.team.miniprogram.controller;

import com.team.miniprogram.common.ApiRestResponse;
import com.team.miniprogram.model.pojo.Approval;
import com.team.miniprogram.model.pojo.Suggestion;
import com.team.miniprogram.model.request.SuggestionListReq;
import com.team.miniprogram.service.SuggestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import static com.team.miniprogram.common.Constant.OPENID;

import com.github.pagehelper.PageInfo;


import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * 描述：用户控制器
 *
 * @author Richard Young
 */
@Controller
@RequestMapping("/suggestion")
public class SuggestionController {
    @Autowired
    SuggestionService suggestionService;

    @GetMapping("/list")
    @ResponseBody
    public ApiRestResponse suggestionList(SuggestionListReq suggestionListReq,HttpServletRequest request) {
        suggestionListReq.setOpenid(request.getHeader(OPENID));
        PageInfo list = suggestionService.list(suggestionListReq);
        return ApiRestResponse.success(list);
    }

    @PostMapping("/add")
    @ResponseBody
    public ApiRestResponse addSuggestion(@Valid @RequestBody Suggestion suggestion, HttpServletRequest request){
        suggestion.setUserId(request.getHeader(OPENID));
        suggestionService.add(suggestion);
        return ApiRestResponse.success();
    }

    @GetMapping("/approval")
    @ResponseBody
    public ApiRestResponse approval(Long id,HttpServletRequest request){
        Approval approval = new Approval();
        approval.setSuggestionId(id);
        approval.setUserId(request.getHeader(OPENID));
        suggestionService.approval(approval);
        return ApiRestResponse.success();
    }
}
