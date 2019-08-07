package com.example.samplespringbooti18n;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageRestController {

  @Autowired private MessageSource messageSource;

  @GetMapping
  public String getHelloWorld() {
    return messageSource.getMessage("hello.world", null, LocaleContextHolder.getLocale());
  }
}
