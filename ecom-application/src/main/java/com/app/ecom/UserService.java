package com.app.ecom;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class UserService {
    private List<User> userList = new ArrayList<>();


    public List<User> fetchAllUsers() {
        return userList;
    }

    public List<User> addUser(User user) {
        Long id = new Random().nextLong();
        user.setId(id);
        userList.add(user);
        return userList;
    }
}
