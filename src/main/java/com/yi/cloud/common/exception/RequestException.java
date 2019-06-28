package com.yi.cloud.common.exception;

public class RequestException extends ServiceException {
    public RequestException() {
        super(400, "请求数据不完整或格式错误！");
    }

    public RequestException(String errorMessage) {
        super(400, errorMessage);
    }

    /**
     * 不拷贝栈信息，提高性能
     */
    @Override
    public synchronized Throwable fillInStackTrace() {
        return null;
    }

    public RequestException(Integer code, String errorMessage) {
        super(code, errorMessage);
    }
}
