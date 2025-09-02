package me.sarah.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.sarah.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
