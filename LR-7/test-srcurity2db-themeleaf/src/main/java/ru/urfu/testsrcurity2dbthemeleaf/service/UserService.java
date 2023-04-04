package ru.urfu.testsrcurity2dbthemeleaf.service;

import ru.urfu.testsrcurity2dbthemeleaf.dto.UserDto;
import ru.urfu.testsrcurity2dbthemeleaf.entity.User;

import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);
    User findUserByEmail(String email);
    List<UserDto> findAllUsers();
}
