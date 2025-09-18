package me.sarah.service;

import me.sarah.model.User;

public interface UserService {
    User findById(Long id);

    User create( User userToCreate);
}
