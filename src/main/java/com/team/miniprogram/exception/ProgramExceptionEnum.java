package com.team.miniprogram.exception;

/**
 * 描述：异常枚举
 */
public enum ProgramExceptionEnum {
    NEED_USER_NAME(10001, "数据库数据记录错误"),
    NEED_PASSWORD(10002, "密码不能为空"),
    PASSWORD_TOO_SHORT(10003, "密码长度不能小于8位"),
    NAME_EXISTED(10004, "不允许重名"),
    INSERT_FAILED(10005, "插入失败，请重试"),
    WRONG_PASSWORD(10006, "用户名或密码错误"),
    NEED_LOGIN(10007, "用户未登录"),
    UPDATE_FAILED(10008, "更新失败"),
    NEED_ADMIN(10009, "该账户不是管理员"),
    PARA_NOT_NULL(10010, "参数不能为空"),
    CREATE_FAILED(10011, "新增失败"),
    REQUEST_PARAM_ERROR(10012, "参数错误"),
    DELETE_FAILED(10013, "删除失败"),
    NEED_OPEN_SHOP(10014, "该用户未注册店铺"),
    MKDIR_FAILED(10015, "创建文件夹失败"),
    UPLOAD_FAILED(10016, "图片上传失败"),
    SELECT_FAILED(10017, "查询失败或不存在"),
    ADD_FAILED(10018, "添加失败"),
    SET_DEFAULT_ADDRESS_FAILED(10019, "设置默认地址失败"),
    SET_HOME_ADDRESS_FAILED(10020, "设置家地址失败"),
    SET_SCHOOL_ADDRESS_FAILED(10021, "设置学校地址失败"),
    SET_COMPANY_ADDRESS_FAILED(10022, "设置公司地址失败"),
    SYSTEM_ERROR(20000, "系统异常");
    /**
     * 异常码
     */
    Integer code;
    /**
     * 异常信息
     */
    String msg;

    ProgramExceptionEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
