package com.yi.cloud.common.reqres.response;

/**
 * 请求成功的返回
 *
 * @author chenguoyi
 */
public class SuccessResponse extends Response {

    public SuccessResponse() {
        super(true, DEF_SUCCESS_CODE, DEF_SUCCESS_MESSAGE, null);
    }

    public SuccessResponse(Object object) {
        super(true, DEF_SUCCESS_CODE, DEF_SUCCESS_MESSAGE, object);
    }

    public SuccessResponse(Integer code, String message, Object object) {
        super(true, code, message, object);
    }
}
