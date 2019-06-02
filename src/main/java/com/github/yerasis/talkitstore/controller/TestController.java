package com.github.yerasis.talkitstore.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "/test")
public class TestController {
  public Map<Integer, String> test = new HashMap<Integer, String>() {{
    put(1, "Test");
    put(2, "TEST");
    put(3, "test");
    put(4, "TeSt");
  }};

  @GetMapping
  public Map<Integer, String> test() {
    return test;
  }

  @GetMapping("{id}")
  public String putTest(@PathVariable Integer id) {
    return ((test.get(id) == null) ? "N/A" : test.get(id));
  }

  @PostMapping
  private Map<Integer,String> create(@RequestParam Integer id, String name ){
    test.put(id,name);
    return test;
  }

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
}
