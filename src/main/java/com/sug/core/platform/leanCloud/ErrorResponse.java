package com.sug.core.platform.leanCloud;

/**
 * Created by user on 2016-08-10.
 */
public class ErrorResponse {
    private int code;
    private String error;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
