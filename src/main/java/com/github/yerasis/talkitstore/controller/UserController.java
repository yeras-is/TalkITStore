package com.github.yerasis.talkitstore.controller;

import com.github.yerasis.talkitstore.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;


@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping(value = "/user")
@RequiredArgsConstructor
public class UserController {

  @GetMapping
  public User getUser(@PathVariable int id) {
    return new User();
  }


}
