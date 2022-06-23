package com.team.miniprogram.service.impl;

import com.github.pagehelper.PageInfo;
import com.team.miniprogram.model.dao.SuggestionMapper;
import com.team.miniprogram.model.pojo.Suggestion;
import com.team.miniprogram.model.request.SuggestionListReq;
import com.team.miniprogram.service.SuggestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * SuggestionService实现类
 * @author Rachard Young
 */
@Service
public class SuggestionServiceImpl implements SuggestionService {
    @Autowired
    SuggestionMapper suggestionMapper;

    @Override
    public PageInfo list(SuggestionListReq suggestionListReq){
        List<Suggestion> suggestionList = suggestionMapper.list(suggestionListReq);
        PageInfo pageInfo = new PageInfo(suggestionList);
        return pageInfo;
    }

    @Override
    public void add(Suggestion suggestion){
        suggestionMapper.insertSelective(suggestion);
    }
}
