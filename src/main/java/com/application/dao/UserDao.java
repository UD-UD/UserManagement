package com.application.dao;

import com.application.model.User;

import java.util.List;

/**
 * Created by ud on 2/4/17.
 */
public interface UserDao {

    User findById(int id);

    User findBySSO(String sso);

    void save(User user);

    void deleteBySSO(String sso);

    List<User> findAllUsers();

}
