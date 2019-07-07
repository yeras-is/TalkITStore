package com.github.yerasis.talkitstore.model.learning;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Lesson {

  Integer id;
  String name;
  String contentPath;
  String description;
  String tasks;
  String materials;

}
