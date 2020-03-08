package com.xworkz.pro.util;

import com.xworkz.pro.exceptions.UtilException;

public interface EmailUtil {
	
	public boolean sendEmail(String to, String body, String subject) throws UtilException;

}
