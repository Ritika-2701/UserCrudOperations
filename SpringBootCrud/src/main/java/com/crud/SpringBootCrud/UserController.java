package com.crud.SpringBootCrud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")

public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/")
    public List<User> getUsers() {
        return userService.getUsers();
    }
    @GetMapping("/{id}")
    public User getUserBytId(@PathVariable Integer id) {
        return userService.getUserById(id);
    }
    @PostMapping("/add")
    public User addUser(@RequestBody User user) {
        return userService.addUser(user);
    }
    @PutMapping("/update")
    public User updateUser(@RequestBody User user) {
        return userService.updateUser(user);
    }
    @DeleteMapping("/delete/{id}")
    public Integer deleteUserById(@PathVariable Integer id) {
        userService.deleteUserById(id);
        return id;
    }
}
