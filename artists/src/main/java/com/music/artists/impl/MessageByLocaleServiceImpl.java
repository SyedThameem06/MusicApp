package com.music.artists.impl;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Component;

import com.music.artists.service.MessageByLocaleService;


@Component
public class MessageByLocaleServiceImpl implements MessageByLocaleService {

	@Autowired
    private MessageSource errorMessage;
	
	@Override
	public String getErrorMessage(String id) {
		Locale locale = LocaleContextHolder.getLocale();
		return errorMessage.getMessage(id, null, locale);
	}
}