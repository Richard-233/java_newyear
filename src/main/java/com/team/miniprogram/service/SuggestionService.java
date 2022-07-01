package com.team.miniprogram.service;


import com.github.pagehelper.PageInfo;
import com.team.miniprogram.model.pojo.Approval;
import com.team.miniprogram.model.pojo.Suggestion;
import com.team.miniprogram.model.request.SuggestionListReq;

/**
 * @author Rachard Young
 */
public interface SuggestionService {

    PageInfo list(SuggestionListReq suggestionListReq);

    PageInfo myList(SuggestionListReq suggestionListReq);

    void add(Suggestion suggestion);

    void approval(Approval approval);
}
