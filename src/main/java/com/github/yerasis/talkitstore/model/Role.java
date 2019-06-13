package com.github.yerasis.talkitstore.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@NoArgsConstructor
@Data
public class Role {
  private Integer id;
  private String name;
  private Boolean isTeacher;
  private Boolean isCreator;
  //add additional vars in future
}
