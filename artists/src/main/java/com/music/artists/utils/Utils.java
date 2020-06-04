package com.music.artists.utils;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Configuration
public class Utils {
   @Bean
   public LocaleResolver localeResolver() {
      SessionLocaleResolver sessionLocaleResolver = new SessionLocaleResolver();
      sessionLocaleResolver.setDefaultLocale(Locale.US);
      return sessionLocaleResolver;
   }
   
   @Bean
   public ReloadableResourceBundleMessageSource errorMessage() {
       ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
       messageSource.setBasenames("classpath:locale/errorMessages",
    		   					"classpath:locale/masterConfig"
    		   );
       messageSource.setCacheSeconds(3600);
       return messageSource;
   }
}
