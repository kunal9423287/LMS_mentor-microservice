package com.bridgelabz.lms_mentor_service.util;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * purpose: Creating a response class
 * @author Kunal Sonawane
 */
@Data
@AllArgsConstructor
public class Response {
    private String statusMsg;
    private long statusCode;
    private Object object;

    public Response() {

    }
}
