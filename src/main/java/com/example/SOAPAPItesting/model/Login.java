package com.example.SOAPAPItesting.model;

public class Login {
	private String code;
	private String password;
	private String deviceId;
	
	
	public Login(String code, String password, String deviceId) {
		super();
		this.code = code;
		this.password = password;
		this.deviceId = deviceId;
	}
	public Login() {
		// TODO Auto-generated constructor stub
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	@Override
	public String toString() {
		return "Login [code=" + code + ", password=" + password + ", deviceId=" + deviceId + "]";
	}
	
	

}
