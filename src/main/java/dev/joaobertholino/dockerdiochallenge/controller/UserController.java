package dev.joaobertholino.dockerdiochallenge.controller;

import dev.joaobertholino.dockerdiochallenge.dto.UserDto;
import dev.joaobertholino.dockerdiochallenge.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
	private final UserService userService;

	public UserController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/email")
	public ResponseEntity<UserDto> findByEmail(@RequestParam String email) {
		return ResponseEntity.ok(this.userService.findByEmail(email));
	}

	@GetMapping("/all")
	public ResponseEntity<List<UserDto>> findAll() {
		return ResponseEntity.ok(this.userService.findAll());
	}

	@PostMapping("/insert")
	public ResponseEntity<UserDto> insert(@RequestBody UserDto userDto) {
		UserDto userSaved = new UserDto(this.userService.insert(userDto));
		return ResponseEntity.ok(userSaved);
	}
}
