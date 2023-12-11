package com.zerobase.study.controller;


import com.zerobase.study.Entity.User;
import com.zerobase.study.Repository.UserRepository;
import com.zerobase.study.constant.Role;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyControllerTest {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/dummy/user")
    public List<User> list(){
        return userRepository.findAll();
    }

    @GetMapping("/dummy/user/{id}")
    public User detail(@PathVariable long id) {
        return userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 사용자 없음"));
//        return userRepository.findById(id);
    }


    @PostMapping("/dummy/join")
    public String join(User user) {
        user.setRole(Role.USER);
        userRepository.save(user);
        return "회원가입 성공";
    }
}
