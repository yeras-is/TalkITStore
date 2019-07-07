package com.github.yerasis.talkitstore.model.social;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Achivements {

  Integer id;
  Integer userId;
  String name;
  Integer count;
  String imageId;

}
