package com.example.Assign_22.Exception;

public class StudentRequestException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public StudentRequestException(String message, Throwable cause) {
		super(message, cause);
	}

	public StudentRequestException(String message) {
		super(message);
	}

}