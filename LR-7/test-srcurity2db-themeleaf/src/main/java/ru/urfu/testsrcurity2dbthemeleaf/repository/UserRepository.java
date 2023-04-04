package ru.urfu.testsrcurity2dbthemeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.urfu.testsrcurity2dbthemeleaf.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
