package com.example.pictgram.form;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.example.pictgram.validation.constraints.PasswordEquals;

import lombok.Data;

// @Data
@PasswordEquals
public class UserForm {

    @NotEmpty
    @Size(max = 100)
    private String name;

    @NotEmpty
    @Email
    private String email;

    @NotEmpty
    @Size(max = 20)
    private String password;

    @NotEmpty
    @Size(max = 20)
    private String passwordConfirmation;

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public String getPasswordConfirmation() {
		return passwordConfirmation;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setPasswordConfirmation(String passwordConfirmation) {
		this.passwordConfirmation = passwordConfirmation;
	}


}