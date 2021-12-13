package com.project.mallcommon.exception;


import com.project.mallcommon.api.IErrorCode;

/**
 * 描述：自定义API异常
 *
 * @author pangde
 * @version 1.0
 * @date 2021/12/13 11:11:33
 */
public class ApiException extends RuntimeException {
    private IErrorCode errorCode;

    public ApiException(IErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public ApiException(String message) {
        super(message);
    }

    public ApiException(Throwable cause) {
        super(cause);
    }

    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public IErrorCode getErrorCode() {
        return errorCode;
    }
}
