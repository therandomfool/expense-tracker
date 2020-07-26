package com.pairlearning.expensetrackerapi.resources;


import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/users")
public class UserResource {

    @PostMapping("/register")
    public String registerUser(@RequestBody Map<String, Object> userMap) {
        String firstName = (String) userMap.get("firstName");
        String lastName = (String) userMap.get("lastName");
        String email = (String) userMap.get("email");
        String password = (String) userMap.get("password");
        return firstName + ", " + lastName + ", " + email + ", " + password;

    }
}
