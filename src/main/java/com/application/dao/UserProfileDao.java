package com.application.dao;

import com.application.model.UserProfile;

import java.util.List;

/**
 * Created by ud on 2/4/17.
 */
public interface UserProfileDao {

    List<UserProfile> findAll();

    UserProfile findByType(String type);

    UserProfile findById(int id);
}