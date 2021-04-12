package com.spring.wow.user.model;

import java.util.Date;

/**
 * @author spammy
 *
 */
public class UserVO {

	
	private String account;
	private String password;
	private String name;
	private Date regDate;
	private String sessionId;
	private Date limitTime;
	
	//자동 로그인 여부 
	private boolean autoLogin;
	
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	public String getSessionId() {
		return sessionId;
	}
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
	public Date getLimitTime() {
		return limitTime;
	}
	public void setLimitTime(Date limitTime) {
		this.limitTime = limitTime;
	}
	public boolean isAutoLogin() {
		return autoLogin;
	}
	public void setAutoLogin(boolean autoLogin) {
		this.autoLogin = autoLogin;
	}
	
	
	@Override
	public String toString() {
		return "UserVO [account=" + account + ", password=" + password + ", name=" + name + ", regDate=" + regDate
				+ ", autoLogin=" + autoLogin + "]";
	}

	
	
	
}
