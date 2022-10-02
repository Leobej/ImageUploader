package com.example.imageuploader.database;

import com.example.imageuploader.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("b17a5ec2-458a-484a-8f9d-f3dd26b9b9d2"), "randomleo", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("5a8c0fee-96ff-4f48-a7c7-bb3cc139909f"), "randompoti", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }

}
