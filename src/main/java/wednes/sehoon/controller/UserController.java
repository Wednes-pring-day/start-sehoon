package wednes.sehoon.controller;

import org.springframework.web.bind.annotation.*;
import wednes.sehoon.domain.UserRequestDto;

@RestController
public class UserController {

    @GetMapping("/users")
    public String getUsers(@RequestBody UserRequestDto userRequestDto) {
        return "get user data";
    }

    @PostMapping("/users")
    public String signup(@RequestBody UserRequestDto userRequestDto) {
        return "signup";
    }

    @PutMapping("/users/{id}")
    public String editUser(@PathVariable Long id, @RequestBody UserRequestDto userRequestDto) {
        return "edit user date";
    }

    @DeleteMapping("/users/{id}")
    public String deleteUser(@PathVariable Long id) {
        return "delete user";
    }


}
