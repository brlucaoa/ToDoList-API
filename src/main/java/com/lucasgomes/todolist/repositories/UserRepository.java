package com.lucasgomes.todolist.repositories;

import com.lucasgomes.todolist.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findAllByUsername(String username);
}
