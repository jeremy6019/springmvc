package com.kbeom.sprmvc.domain;

import java.util.Date;

public class User {
    //프로퍼티라고 부를 때는 getter 와 setter 가 있는 경우 
	private String id;
	private String pw;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", pw=" + pw + "]";
	}
	
	
}
