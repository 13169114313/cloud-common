package com.yi.cloud.common.reqres.response;

/**
 * 通用返回包装类
 *
 * @author chenguoyi
 */
public class Response {
    public static final String DEF_SUCCESS_MESSAGE = "请求成功";

    public static final String DEF_ERROR_MESSAGE = "网络异常";

    public static final Integer DEF_SUCCESS_CODE = 200;

    public static final Integer DEF_ERROR_CODE = 500;

    /**
     * 请求是否成功
     */
    private Boolean success;

    /**
     * 响应状态码
     */
    private Integer code;

    /**
     * 响应信息
     */
    private String message;

    /**
     * 响应对象
     */
    private Object data;

    public Response() {
    }

    public Response(Boolean success, Integer code, String message, Object data) {
        this.success = success;
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public static SuccessResponse success() {
        return new SuccessResponse();
    }

    public static SuccessResponse success(Object object) {
        return new SuccessResponse(object);
    }

    public static SuccessResponse success(Integer code, String message, Object object) {
        return new SuccessResponse(code, message, object);
    }

    public static ErrorResponse error(String message) {
        return new ErrorResponse(message);
    }

    public static ErrorResponse error(Integer code, String message) {
        return new ErrorResponse(code, message);
    }

    public static ErrorResponse error(Integer code, String message, Object object) {
        return new ErrorResponse(code, message, object);
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
