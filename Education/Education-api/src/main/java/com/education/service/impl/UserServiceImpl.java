package com.education.service.impl;

import com.education.dao.UserMapper;
import models.bean.User;
import models.beanExamples.UserExample;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by breaknull on 2017/11/2.
 */
@Service("userService")
public class UserServiceImpl{

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource(name = "userMapper")
    UserMapper userMapper;

    public List<User> findUserInfo(User user) {

        UserExample userExample = new UserExample();
        userExample.createCriteria().andUsernameEqualTo(user.getUsername());
        List<User> users = userMapper.selectByExample(userExample);
        return users;
    }


}
