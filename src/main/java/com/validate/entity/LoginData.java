package com.validate.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class LoginData {
    @NotBlank(message = "user namme cannot be empty")
    @Size(min = 3, max=12, message = "UserName must 3 to 12 characters")
    private String userName;

    @NotBlank
    @Email(message = "invalid email")
    private String email;

    @AssertTrue(message = "Please Accept Terms and Conditions")
    private boolean agreed;
}
