package com.goldencodertima.software_project_demo.accountActivity;

/**
 * Created by CS.ABDULLH RTIMA on 4/7/2018.
 */

public class User {
    private String UserId;
    private String UserName;

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public User(String userId, String userName) {
        UserId = userId;
        UserName = userName;
    }
}