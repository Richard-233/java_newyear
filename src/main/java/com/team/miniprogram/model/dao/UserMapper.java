package com.team.miniprogram.model.dao;

import com.team.miniprogram.model.pojo.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miniprogram_user
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String openid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miniprogram_user
     *
     * @mbg.generated
     */
    int insert(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miniprogram_user
     *
     * @mbg.generated
     */
    int insertSelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miniprogram_user
     *
     * @mbg.generated
     */
    User selectByPrimaryKey(String openid);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miniprogram_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(User record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table miniprogram_user
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(User record);
}
