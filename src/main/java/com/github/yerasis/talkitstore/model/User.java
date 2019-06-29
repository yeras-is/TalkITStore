package com.github.yerasis.talkitstore.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class User {
  private Integer id;
  @NotBlank(message = "Name is required")
  private String firstName;
  @NotBlank(message = "LastName is required")
  private String lastName;
  @NotBlank(message = "Role is required")
  private String role;
  @Email
  @NotBlank(message = "Email is required")
  private String email;
  @NotBlank(message = "Phone is required")
  private String phone;
  private Integer cash;
  private Boolean actual;
  @Size(max = 16)
  private String password;
}
