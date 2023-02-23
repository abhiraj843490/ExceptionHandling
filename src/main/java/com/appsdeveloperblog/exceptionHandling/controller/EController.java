package com.appsdeveloperblog.exceptionHandling.controller;

import com.appsdeveloperblog.exceptionHandling.entity.UserEntity;
import com.appsdeveloperblog.exceptionHandling.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.http.HttpHeaders;

@RestController
@RequestMapping("/excep")
public class EController {

    UserService userService;

    public EController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/euser")
    public String postMapping(@RequestBody UserEntity userEntity){
            userService.postMapping(userEntity);
            return "created successfully";
    }
    @GetMapping("/{id}")
    public UserEntity getMapping(@PathVariable("id")Long userId){

         return userService.getMapping(userId);
    }
}
