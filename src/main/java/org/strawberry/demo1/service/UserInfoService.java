package org.strawberry.demo1.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.strawberry.demo1.dao.UserInfoMapper;
import org.strawberry.demo1.model.UserInfo;

@Service   //表明是一项服务，纳入Bean处理，由Spring自动处理
public class UserInfoService {
    private UserInfoMapper userInfoMapper;
    @Autowired
    public void setUserInfoMapper(UserInfoMapper userInfoMapper) {
        this.userInfoMapper = userInfoMapper;
    }

    public UserInfo getUserInfoByUsername(String username){
        /*UserInfoMapper userInfoMapper=new UserInfoMapper();*/
        return userInfoMapper.getUserInfoByUsername(username);
    }

}
