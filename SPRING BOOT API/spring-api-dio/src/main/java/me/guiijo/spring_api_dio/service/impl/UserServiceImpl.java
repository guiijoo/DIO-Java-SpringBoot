package me.guiijo.spring_api_dio.service.impl;

import java.util.NoSuchElementException;

import org.springframework.stereotype.Service;

import me.guiijo.spring_api_dio.domain.model.User;
import me.guiijo.spring_api_dio.domain.repository.UserRepository;
import me.guiijo.spring_api_dio.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User user) {
        if (userRepository.existsByAccountAccountNumber(user.getAccount().getAccountNumber())) {
            throw new IllegalArgumentException("This account number already exists!");
        }
        return userRepository.save(user);
    }
}
