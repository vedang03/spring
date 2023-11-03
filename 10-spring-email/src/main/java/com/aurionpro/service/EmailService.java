package com.aurionpro.service;

import com.aurionpro.entity.EmailDetails;

public interface EmailService {

	String sendSimpleMail(EmailDetails details);

	String sendMailWithAttachment(EmailDetails details);

}
