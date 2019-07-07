package com.github.yerasis.talkitstore.model.learning;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Course {
  Integer id;
  @NotBlank(message = "Name is required")
  String name;
  String descriptionEng;
  String descriptionRus;
  String imgPath;

}
