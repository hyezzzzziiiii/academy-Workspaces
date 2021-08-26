package com.board.dto;

import java.sql.Date;


public class BoardDto {
	private Integer num;
	private String pass;
	private String userid;
	private String email;
	private String title;
	private String content;
	private Integer readcount;
	private Date writedate;
	
	private Integer replycnt;
	
	public Integer getReplycnt() {
		return replycnt;
	}
	public void setReplycnt(Integer replycnt) {
		this.replycnt = replycnt;
	}
	
	
	public Date getWritedate() {
		return writedate;
	}
	public void setWritedate(Date writedate) {
		this.writedate = writedate;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getReadcount() {
		return readcount;
	}
	public void setReadcount(Integer readcount) {
		this.readcount = readcount;
	}
	
}
