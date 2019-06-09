package com.github.yerasis.talkitstore.controller;

import com.github.yerasis.talkitstore.service.MailService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
@RequiredArgsConstructor
public class TestController {
  private final MailService mailService;
/*

  @GetMapping
  public Map<Integer, String> test() {
    return test;
  }

  @GetMapping("{id}")
  public String putTest(@PathVariable Integer id) {
    return ((test.get(id) == null) ? "N/A" : test.get(id));
  }
*/

  @PostMapping
  private Boolean mail(String to, String subject, String text) {
    return mailService.sendMessage(to, subject, text);
  }

/*
  @DeleteMapping
  private String delete(@RequestParam Integer id){
    if(test.containsKey(id)){
      test.remove(id);
      System.out.println(test.remove(id));
      return test.toString();
    }
    else {
      return "Not such key\n"+test.toString();
    }
  }
*/
}
