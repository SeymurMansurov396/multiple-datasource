package com.ulife;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.ulife.unimb.repository.ErrorMessageRepository;
import com.ulife.repository.FooRepository;

@RestController
public class FooBarController {

  private final FooRepository fooRepo;
  private final ErrorMessageRepository barRepo;

  @Autowired
  FooBarController(FooRepository fooRepo, ErrorMessageRepository barRepo) {
    this.fooRepo = fooRepo;
    this.barRepo = barRepo;
  }



}
