package dev.joaobertholino.dockerdiochallenge.dto;

import dev.joaobertholino.dockerdiochallenge.model.User;

import java.io.Serial;
import java.io.Serializable;

public class UserDto implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	private String firstName;
	private String lastName;
	private String email;

	public UserDto() {
	}

	public UserDto(User user) {
		this.firstName = user.getFirstName();
		this.lastName = user.getLastName();
		this.email = user.getEmail();
	}

	public UserDto(String firstName, String lastName, String email) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
