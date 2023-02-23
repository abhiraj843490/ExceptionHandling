package com.appsdeveloperblog.exceptionHandling.service.impl;

import com.appsdeveloperblog.exceptionHandling.entity.UserEntity;
import com.appsdeveloperblog.exceptionHandling.exception.CloudVendorNotFoundException;
import com.appsdeveloperblog.exceptionHandling.repo.UserRepository;
import com.appsdeveloperblog.exceptionHandling.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Override
    public String postMapping(UserEntity userEntity) {
        userRepository.save(userEntity);
        return "Success";
    }

    @Override
    public UserEntity getMapping(Long id) {
        if(userRepository.findById(id).isEmpty())
            throw new CloudVendorNotFoundException("vendor not exist");
        return userRepository.findById(id).get();
    }
}
