package com.github.yerasis.talkitstore.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Book {
  private Integer id;
  @NotBlank(message = "Name is required")
  private String name;
  @NotBlank(message = "Author is required")
  private String author;
  @Size(max = 150, message = "Max length is 150 chars")
  @NotBlank(message = "Snippet is required")
  private String snippet;
  private String path;
  @Digits(integer = 10,fraction = 0,message = "Cost is required")
  private Integer cost;
  @NotBlank(message = "Genre is required")
  private String genre;
}
