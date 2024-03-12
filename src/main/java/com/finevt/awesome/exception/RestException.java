package com.finevt.awesome.exception;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class RestException extends RuntimeException {
	private String code;
	private String message;
	private Object[] args;
	private HttpStatus status;
}
