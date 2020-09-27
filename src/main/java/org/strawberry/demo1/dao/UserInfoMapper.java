package org.strawberry.demo1.dao;

import org.springframework.stereotype.Repository;
import org.strawberry.demo1.model.UserInfo;

@Repository
public interface UserInfoMapper {
    UserInfo getUserInfoByUsername(String username);

}
