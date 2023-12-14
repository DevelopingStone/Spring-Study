package com.zerobase.study.controller;


import com.zerobase.study.Entity.User;
import com.zerobase.study.Repository.UserRepository;
import com.zerobase.study.constant.RoleType;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DummyControllerTest {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/dummy/users")
    public List<User> list() {
        return userRepository.findAll();
    }

    @GetMapping("/dummy/users/find/{id}")
    public User findUser(@PathVariable int id) {
        return userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("데이터가 없습니다."));

    }

    @GetMapping("/dummy/user")
    public List<User> pageList(
            @PageableDefault(size = 2, sort = "id", direction = Direction.DESC) Pageable pageable) {
        Page<User> pagingUser = userRepository.findAll(pageable);
        List<User> users = pagingUser.getContent();
        return users;
    }

    @GetMapping("/dummy/user/{id}")
    public User detail(@PathVariable int id) {
        return userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("해당 사용자 없음"));
//        return userRepository.findById(id);
    }


    @PostMapping("/dummy/join")
    public String join(User user) {
        user.setRole(RoleType.USER);
        userRepository.save(user);
        return "회원가입 성공";
    }

    @Transactional
    @PutMapping("/dummy/post/{id}")
    public User updateUser(@PathVariable int id, @RequestBody User rqUser) {
        User user = userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("아이디를 찾을수 없습니다."));
        user.setEmail(rqUser.getEmail());
        user.setPassword(rqUser.getPassword());
//        userRepository.save(user);
        return user;
    }

    @DeleteMapping("/dummy/post/delete/{id}")
    public String deleteUser(@PathVariable int id) {
        try {
            userRepository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            return "없는 값으로 삭제에 실패하였습니다.";
        }
        return "삭제되었습니다. id : " + id;
    }

    @PostMapping("/dummy/joint")
    public User joint(User user) {
        user.setRole(RoleType.USER);
        userRepository.save(user);
        return user;
    }

    @PutMapping("/dummy/put/{id}")
    public User put(@PathVariable int id, @RequestBody User rq) {
        User user = userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("없는데이터 입니다."));

        user.setEmail(rq.getEmail());
        user.setPassword(rq.getPassword());
        userRepository.save(user);
        return user;
    }
}
