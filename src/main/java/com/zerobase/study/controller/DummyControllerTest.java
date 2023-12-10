package com.zerobase.study.controller;


import com.zerobase.study.Entity.User;
import com.zerobase.study.Repository.UserRepository;
import com.zerobase.study.constant.Role;
import java.util.function.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyControllerTest {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/dummy/user{id}")
    public String detail(@PathVariable Long id) {
            userRepository.findAllById(id).orElseGet(new Supplier<User>(){

                @Override
                public User get() {
                    return null;
                }
            });
            return user;
    }

    @PostMapping("/dummy/join")
    public String join(User user) {
//        System.out.println();
//        System.out.println("user.getId() = " + user.getId());
//        System.out.println("user.getUsername() = " + user.getUsername());
//        System.out.println("user.getEmail() = " + user.getEmail());
//        System.out.println("user.getPassword() = " + user.getPassword());
//        System.out.println("user.getPhoneNumber() = " + user.getPhoneNumber());
//        System.out.println("user.getRole() = " + user.getRole());
//        System.out.println("user.getCreateDate() = " + user.getCreateDate());
        user.setRole(Role.ADMIN);
        userRepository.save(user);
        return "회원가입 성공";

    }
}
