package com.mosa.gestions.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.mosa.gestions.entities.User;
public interface UserRepository extends JpaRepository<User, Long> {
User findByUsername (String username);
}