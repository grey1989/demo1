package org.strawberry.demo1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.strawberry.demo1.model.UserInfo;
import org.strawberry.demo1.service.UserInfoService;

@RestController
public class UserInfoController {
    private UserInfoService userInfoService;
    @Autowired
    public void setUserInfoService(UserInfoService userInfoService) {
        this.userInfoService = userInfoService;
    }
    @RequestMapping(method = RequestMethod.GET,path = "/UserInfo/{username}")
    public UserInfo getUserInfo(@PathVariable String username){
        return userInfoService.getUserInfoByUsername(username);
    }
}
