package me.guiijo.spring_api_dio.service;

import me.guiijo.spring_api_dio.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User user);

}
