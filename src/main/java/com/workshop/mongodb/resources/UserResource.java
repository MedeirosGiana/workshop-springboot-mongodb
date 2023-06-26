package com.workshop.mongodb.resources;

import com.workshop.mongodb.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping()
    public ResponseEntity<List<User>> findAll() {
        List<User> list = new ArrayList<>();
        User Maria = new User("1","Maria Brown","maria@gmail.com");
        User Alex = new User("2","Alex Green","alex@gmail.com");
        list.addAll(Arrays.asList(Maria,Alex));
        return ResponseEntity.ok().body(list);

    }
}
