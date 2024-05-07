package com.vamshi.education.repo;

import com.vamshi.education.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Userdb extends JpaRepository<User,Long> {
}
