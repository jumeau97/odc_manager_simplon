package com.example.backend.exceptions;

public enum ErrorCodes {
	ADMININSTRATEUR_NOT_FOUND(1000),
	ADMINISTRATEUR_INVALID(1001);
	private int code;
	ErrorCodes(int code) {
		this.code = code;
	}
	public int getCode() {
		return code;
	}
	

}
