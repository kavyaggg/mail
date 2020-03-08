package com.xworkz.pro.service;

import com.xworkz.pro.exceptions.ServiceException;

public interface EmailService {
	public boolean sendMailToUser(String toEmailId, String subject, String body) throws ServiceException;
}
