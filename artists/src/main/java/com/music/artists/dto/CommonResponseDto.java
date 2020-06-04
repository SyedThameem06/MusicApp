package com.music.artists.dto;

public class CommonResponseDto {

	private int responseCode;
	private String errorCode;
	private String errorDesc;
	
	public int getResponseCode() {
		return responseCode;
	}
	public CommonResponseDto setResponseCode(int responseCode) {
		this.responseCode = responseCode;
		return this;
	}
	public String getErrorCode() {
		return errorCode;
	}
	public CommonResponseDto setErrorCode(String errorCode) {
		this.errorCode = errorCode;
		return this;
	}
	public String getErrorDesc() {
		return errorDesc;
	}
	public CommonResponseDto setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
		return this;
	}
}
