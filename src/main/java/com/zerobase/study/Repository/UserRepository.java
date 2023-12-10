package com.zerobase.study.Repository;

import com.zerobase.study.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
