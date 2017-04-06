package com.application.service;

import com.application.model.User;

import java.util.List;

/**
 * Created by ud on 2/4/17.
 */
public interface UserService {

    User findById(int id);

    User findBySSO(String sso);

    void saveUser(User user);

    void updateUser(User user);

    void deleteUserBySSO(String sso);

    List<User> findAllUsers();

    boolean isUserSSOUnique(Integer id, String sso);

}
