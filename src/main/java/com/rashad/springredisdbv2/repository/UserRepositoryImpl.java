package com.rashad.springredisdbv2.repository;

import com.rashad.springredisdbv2.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class UserRepositoryImpl implements UserRepository{

    private final RedisTemplate<String, Object> redisTemplate;

    private static final String KEY = "USER";

    @Override
    public boolean saveUser(User user) {
        try {
            redisTemplate.opsForHash().put(KEY, user.getId().toString(), user);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public List<Object> fetchAllUser() {
        return redisTemplate.opsForHash().values(KEY);
    }

    @Override
    public User fetchUserById(Long id) {
        User user;
        user = (User) redisTemplate.opsForHash().get(KEY, id.toString());
        return user;
    }

    @Override
    public boolean deleteUser(Long id) {
        try {
            redisTemplate.opsForHash().delete(KEY, id.toString());
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean updateUser(Long id, User user) {
        try {
            redisTemplate.opsForHash().put(KEY, id.toString(), user);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}
