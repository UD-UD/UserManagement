package com.application.converter;

import com.application.model.UserProfile;
import com.application.service.UserProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

/**
 * Created by ud on 2/4/17.
 */
@Component
public class RoleToProfileUserConvertor implements Converter<Object, UserProfile> {

    @Autowired
    UserProfileService userProfileService;

    public UserProfile convert(Object element) {
        Integer id = Integer.parseInt((String)element);
        UserProfile profile= userProfileService.findById(id);
        System.out.println("Profile : "+profile);
        return profile;
    }

}
