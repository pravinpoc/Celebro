package com.celebro.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {

  @GetMapping	
  public String getEventName() {
	  return "Om Vigneshwaraaya Namaha";
  }
	
}
