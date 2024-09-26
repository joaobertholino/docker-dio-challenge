package dev.joaobertholino.dockerdiochallenge.service;

import dev.joaobertholino.dockerdiochallenge.dto.UserDto;
import dev.joaobertholino.dockerdiochallenge.model.User;
import dev.joaobertholino.dockerdiochallenge.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.BeanUtils;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
	private final UserRepository userRepository;

	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	public UserDto findByEmail(String email) {
		User user = this.userRepository.findUserByEmail(email).orElseThrow();
		return new UserDto(user);
	}

	public List<UserDto> findAll() {
		return this.userRepository.findAll().stream().map(UserDto::new).toList();
	}

	@Transactional
	public User insert(UserDto userDto) {
		User userToSave = new User();
		BeanUtils.copyProperties(userDto, userToSave);

		return this.userRepository.save(userToSave);
	}
}
