package com.rashad.springredisdbv2.repository;

import com.rashad.springredisdbv2.model.User;

import java.util.List;

public interface UserRepository {

    boolean saveUser(User user);

    List<Object> fetchAllUser();

    User fetchUserById(Long id);

    boolean deleteUser(Long id);

    boolean updateUser(Long id, User user);
}
