package com.yi.cloud.common.exception;

/**
 * 远程调用服务异常
 */
public abstract class ApiServiceException extends Exception {

    /**
     * 错误编码
     */
    private Integer code;

    /**
     * 错误的提示信息
     */
    private String errorMessage;

    public ApiServiceException(IBaseExceptionEnum exception) {
        super(exception.getMessage());
        this.code = exception.getCode();
        this.errorMessage = exception.getMessage();
    }

    /**
     * 获取异常的类的具体名称
     */
    public abstract String getExceptionClassName();

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
}
