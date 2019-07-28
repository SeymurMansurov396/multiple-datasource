package com.ulife.config;

import com.ulife.unimb.domain.ErrorMessage;
import com.ulife.unimb.repository.ErrorMessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.AbstractMessageSource;
import org.springframework.stereotype.Component;

import java.text.MessageFormat;
import java.util.Locale;

@Component("messageSource")
public class DBMessageSource extends AbstractMessageSource {
    @Autowired
    private ErrorMessageRepository errorMessageRepository;

    private static final String DEFAULT_LOCALE_CODE = "en";

    @Override
    protected MessageFormat resolveCode(String key, Locale locale) {
        ErrorMessage message = errorMessageRepository.findByKeyAndLocale(key,locale.getLanguage());
        if (message == null) {
            message = errorMessageRepository.findByKeyAndLocale(key,DEFAULT_LOCALE_CODE);
        }
        return new MessageFormat(message.getContent(), locale);
    }
}
