package com.team.miniprogram.service.impl;

import com.github.pagehelper.PageInfo;
import com.team.miniprogram.exception.ProgramException;
import com.team.miniprogram.exception.ProgramExceptionEnum;
import com.team.miniprogram.model.dao.SuggestionMapper;
import com.team.miniprogram.model.dao.ApprovalMapper;
import com.team.miniprogram.model.pojo.Approval;
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

    @Autowired
    ApprovalMapper approvalMapper;

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

    @Override
    public void approval(Approval approval) {
        Approval approval_select = approvalMapper.selectApproval(approval);
        Suggestion suggestion_select = suggestionMapper.selectByPrimaryKey(approval.getSuggestionId());
        if(approval_select==null){
            approvalMapper.insertSelective(approval);
            Suggestion suggestion = new Suggestion();
            suggestion.setId(approval.getSuggestionId());
            suggestion.setNum(suggestion_select.getNum()+1);
            suggestionMapper.updateByPrimaryKeySelective(suggestion);
        }
        else{
            approvalMapper.deleteApproval(approval);
            Suggestion suggestion = new Suggestion();
            suggestion.setId(approval.getSuggestionId());
            suggestion.setNum(suggestion_select.getNum()-1);
            suggestionMapper.updateByPrimaryKeySelective(suggestion);
        }
    }


}
