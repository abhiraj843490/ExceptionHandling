package com.appsdeveloperblog.exceptionHandling.service;

import com.appsdeveloperblog.exceptionHandling.entity.UserEntity;


public interface UserService {
    public String postMapping(UserEntity userEntity);

    public UserEntity getMapping(Long id);
}
