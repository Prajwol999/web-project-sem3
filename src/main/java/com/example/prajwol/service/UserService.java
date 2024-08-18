package com.example.prajwol.service;

import com.example.prajwol.entity.User;
import com.example.prajwol.pojo.UserPojo;

import java.util.List;
import java.util.Optional;

public interface UserService {

    void saveUser(UserPojo userPojo);

    List<User> getAllData();

    Optional<User> getById(Integer id);

    void deleteById(Integer id);
    void updateUser(Integer id, UserPojo updatedUserDetails);

}
