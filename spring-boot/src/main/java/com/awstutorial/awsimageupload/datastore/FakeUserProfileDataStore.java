package com.awstutorial.awsimageupload.datastore;

import com.awstutorial.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "test123", null));
        USER_PROFILES.add(new UserProfile(UUID.randomUUID(), "test234", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
