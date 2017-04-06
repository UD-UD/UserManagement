package com.application.service;

import com.application.model.UserProfile;

import java.util.List;

/**
 * Created by ud on 2/4/17.
 */
public interface UserProfileService {

    UserProfile findById(int id);

    UserProfile findByType(String type);

    List<UserProfile> findAll();

}