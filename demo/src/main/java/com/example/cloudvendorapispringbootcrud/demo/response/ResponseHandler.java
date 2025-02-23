package com.example.cloudvendorapispringbootcrud.demo.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.HashMap;
import java.util.Map;

public class ResponseHandler {
    public static ResponseEntity<Object> responsebuilder(String message, HttpStatus httpStatus,Object responseObject){
        Map<String,Object> response = new HashMap<>();
        response.put("message",message);
        response.put("httpstatus",httpStatus.value());
        response.put("responseobject",responseObject);

        return new ResponseEntity<>(response,httpStatus);
    }
}
