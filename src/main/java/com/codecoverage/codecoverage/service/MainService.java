package com.codecoverage.codecoverage.service;

import org.springframework.stereotype.Service;

@Service
public class MainService {

  public void processNotCalled () {
    System.out.println("This is not called");
  }

  public void processCalled () {
    System.out.println("This is called");
  }
  
}
