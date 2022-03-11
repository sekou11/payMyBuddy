package com.payMyBuddy.Service;

import java.util.List;
import java.util.Optional;

import com.payMyBuddy.Models.UserApp;
import com.payMyBuddy.Models.dto.UserDto;

public interface UserService {
	public List<UserApp> findAll();

	public Optional<UserApp> findById(int id);

	public UserApp findByEmail(String email);

	
	public void deleteById(int id);

	public void deleteByEmail(String email);

	public UserApp saveDto(UserDto userDto);
	public Integer saveUser(UserApp user);
}
