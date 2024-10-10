package me.guiijo.spring_api_dio.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import me.guiijo.spring_api_dio.domain.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existsByAccountAccountNumber(String accountNumber);

}
