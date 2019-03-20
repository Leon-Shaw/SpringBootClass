package cn.wzvtc.leonshaw.springbootclass.class07;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping(path = "addUser")
    public void addUser(User user) {
        userRepository.save(user);
    }

    @PostMapping(path = "deleteUser")
    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
}