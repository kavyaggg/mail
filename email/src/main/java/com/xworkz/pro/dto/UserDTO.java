package com.xworkz.pro.dto;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
@Component

public class UserDTO {
	private Logger logger = Logger.getLogger(this.getClass().getSimpleName());
	private String emailId;
	private String subject;
	private String body;
	
	
	public UserDTO() {
		logger.info("inside getMessage()...Invoked :"+this.getClass().getSimpleName());
	}


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


	public String getBody() {
		return body;
	}


	public void setBody(String body) {
		this.body = body;
	}


	@Override
	public String toString() {
		return "UserDTO [emailId=" + emailId + ", subject=" + subject + ", body=" + body + "]";
	}
	
}
