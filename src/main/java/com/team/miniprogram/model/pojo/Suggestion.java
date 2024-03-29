package com.team.miniprogram.model.pojo;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import java.util.Date;

public class Suggestion {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miniprogram_suggestion.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miniprogram_suggestion.user_id
     *
     * @mbg.generated
     */
    private String userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miniprogram_suggestion.image
     *
     * @mbg.generated
     */
    private String image;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miniprogram_suggestion.title
     *
     * @mbg.generated
     */
    private String title;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miniprogram_suggestion.detail
     *
     * @mbg.generated
     */
    private String detail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miniprogram_suggestion.type
     *
     * @mbg.generated
     */
    @Max(4)@Min(1)
    private Integer type;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miniprogram_suggestion.num
     *
     * @mbg.generated
     */
    private Long num;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miniprogram_suggestion.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column miniprogram_suggestion.update_time
     *
     * @mbg.generated
     */
    private Date updateTime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miniprogram_suggestion.id
     *
     * @return the value of miniprogram_suggestion.id
     *
     * @mbg.generated
     */

    private Long approval;

    public Long getApproval() {
        return approval;
    }

    public void setApproval(Long approval) {
        this.approval = approval;
    }

    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miniprogram_suggestion.id
     *
     * @param id the value for miniprogram_suggestion.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miniprogram_suggestion.user_id
     *
     * @return the value of miniprogram_suggestion.user_id
     *
     * @mbg.generated
     */
    public String getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miniprogram_suggestion.user_id
     *
     * @param userId the value for miniprogram_suggestion.user_id
     *
     * @mbg.generated
     */
    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miniprogram_suggestion.image
     *
     * @return the value of miniprogram_suggestion.image
     *
     * @mbg.generated
     */
    public String getImage() {
        return image;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miniprogram_suggestion.image
     *
     * @param image the value for miniprogram_suggestion.image
     *
     * @mbg.generated
     */
    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miniprogram_suggestion.title
     *
     * @return the value of miniprogram_suggestion.title
     *
     * @mbg.generated
     */
    public String getTitle() {
        return title;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miniprogram_suggestion.title
     *
     * @param title the value for miniprogram_suggestion.title
     *
     * @mbg.generated
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miniprogram_suggestion.detail
     *
     * @return the value of miniprogram_suggestion.detail
     *
     * @mbg.generated
     */
    public String getDetail() {
        return detail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miniprogram_suggestion.detail
     *
     * @param detail the value for miniprogram_suggestion.detail
     *
     * @mbg.generated
     */
    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miniprogram_suggestion.type
     *
     * @return the value of miniprogram_suggestion.type
     *
     * @mbg.generated
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miniprogram_suggestion.type
     *
     * @param type the value for miniprogram_suggestion.type
     *
     * @mbg.generated
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miniprogram_suggestion.num
     *
     * @return the value of miniprogram_suggestion.num
     *
     * @mbg.generated
     */
    public Long getNum() {
        return num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miniprogram_suggestion.num
     *
     * @param num the value for miniprogram_suggestion.num
     *
     * @mbg.generated
     */
    public void setNum(Long num) {
        this.num = num;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miniprogram_suggestion.create_time
     *
     * @return the value of miniprogram_suggestion.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miniprogram_suggestion.create_time
     *
     * @param createTime the value for miniprogram_suggestion.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column miniprogram_suggestion.update_time
     *
     * @return the value of miniprogram_suggestion.update_time
     *
     * @mbg.generated
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column miniprogram_suggestion.update_time
     *
     * @param updateTime the value for miniprogram_suggestion.update_time
     *
     * @mbg.generated
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
