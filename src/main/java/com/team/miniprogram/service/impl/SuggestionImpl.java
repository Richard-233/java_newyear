package com.team.miniprogram.service.impl;

import com.team.miniprogram.model.dao.SuggestionMapper;
import com.team.miniprogram.model.pojo.Suggestion;
import com.team.miniprogram.service.SuggestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * SuggestionService实现类
 * @author Rachard Young
 */
@Service
public class SuggestionImpl implements SuggestionService {
    @Autowired
    SuggestionMapper suggestionMapper;

    @Override
    public Suggestion getSuggestionList() {
        return suggestionMapper.selectByPrimaryKey(1L);
    }
}
