package com.rashad.springredisdbv2.service;

import com.rashad.springredisdbv2.model.User;

import java.util.List;

public interface UserService {

    boolean saveUser(User user);

    List<Object> fetchAllUser();

    User fetchUserById(Long id);

    boolean deleteUser(Long id);

    boolean updateUser(Long id, User user);
}
