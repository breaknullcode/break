package com.education.service;

import models.bean.User;

import java.util.List;

/**
 * @Project : com.education.service;
 * @Description : ;
 * @Author : rongbo;
 * @Creation Date : 2017/11/2;
 * @ModificationHistory ;
 * Who        When          What ;
 * --------   ----------    -----------------------------------;
 * username   2017/11/2     ${TODO};
 */

public interface UserService {

    public List<User> findUserInfo(User user);
}
