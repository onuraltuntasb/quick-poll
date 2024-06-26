package com.quickpoll.quickpoll.exception;

import com.quickpoll.quickpoll.model.payload.response.ApiErrorResponse;
import org.springframework.http.ResponseEntity;

public class ResponseEntityBuilder {

    public static ResponseEntity<Object> build(ApiErrorResponse apiError) {
        return new ResponseEntity<>(apiError, apiError.getStatus());
    }

}
