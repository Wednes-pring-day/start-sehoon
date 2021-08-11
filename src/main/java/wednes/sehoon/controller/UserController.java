package wednes.sehoon.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import wednes.sehoon.domain.User;
import wednes.sehoon.domain.UserRequestDto;
import wednes.sehoon.repository.MemoryUserRepository;
import wednes.sehoon.repository.UserRepository;
import wednes.sehoon.service.UserService;

import java.util.List;

@RequiredArgsConstructor
@RestController
public class UserController {

    private final UserService userService;
    private final UserRepository userRepository;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/users")
    public List<User> getUsers() {
        return userService.findAllUser();
    }

    @PostMapping("/users")
    public Long signup(@RequestBody UserRequestDto userRequestDto) {
        User user = new User(userRequestDto);
        return userService.signup(user);
    }

    @PutMapping("/users/{id}")
    public Long editUser(@PathVariable Long id, @RequestBody UserRequestDto userRequestDto) {
        return userService.editUser(id, userRequestDto);
    }

    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable Long id) {
        return "delete user";
    }


}
