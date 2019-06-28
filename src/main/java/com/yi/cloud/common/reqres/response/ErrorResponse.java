package com.yi.cloud.common.reqres.response;

/**
 * 请求失败的返回
 *
 * @author chenguoyi
 */
public class ErrorResponse extends Response {

    /**
     * 异常的具体类名称
     */
    private String exceptionClazz;

    public ErrorResponse(String message) {
        super(false, DEF_ERROR_CODE, message, null);
    }

    public ErrorResponse(Integer code, String message) {
        super(false, code, message, null);
    }

    public ErrorResponse(Integer code, String message, Object object) {
        super(false, code, message, object);
    }

    public String getExceptionClazz() {
        return exceptionClazz;
    }

    public void setExceptionClazz(String exceptionClazz) {
        this.exceptionClazz = exceptionClazz;
    }
}
