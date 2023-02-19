package com.rashad.springredisdbv2.service;

import com.rashad.springredisdbv2.model.User;
import com.rashad.springredisdbv2.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public boolean saveUser(User user) {
        return userRepository.saveUser(user);
    }

    @Override
    public List<Object> fetchAllUser() {
        return userRepository.fetchAllUser();
    }

    @Override
    public User fetchUserById(Long id) {
        return userRepository.fetchUserById(id);
    }

    @Override
    public boolean deleteUser(Long id) {
        return userRepository.deleteUser(id);
    }

    @Override
    public boolean updateUser(Long id, User user) {
        return userRepository.updateUser(id,user);
    }
}
