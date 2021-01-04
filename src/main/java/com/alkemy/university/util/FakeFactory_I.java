package com.alkemy.university.util;

import com.alkemy.university.model.User;

import java.util.List;

public interface FakeFactory_I {

    /*public User createUser();*/

    public List<User> createNUsers(int number);
}
