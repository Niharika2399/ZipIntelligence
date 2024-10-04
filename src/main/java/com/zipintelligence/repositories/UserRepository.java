package com.zipintelligence.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zipintelligence.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
