package com.education.controller;

import com.education.common.APIConstants;
import models.bean.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Project : com.education.controller;
 * @Description : 用户操作接口;
 * @Author : rongbo;
 * @Creation Date : 2017/11/2;
 * @ModificationHistory ;
 * Who        When          What ;
 * --------   ----------    -----------------------------------;
 * username   2017/11/2     ${TODO};
 */
@RestController
@RequestMapping(APIConstants.APP_VERSION )
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private final String ORDER = "/order";
    private final String BUFFERS = "/buffers";

    @RequestMapping(value = ORDER + BUFFERS, method = RequestMethod.POST)
    public ResponseEntity<User> createOrderBuffers(User user) throws Exception {
//        User user = new User():
//这里是正式的测试从远程主干拉的分支   修改的的地方
        //增加的地方
        return new ResponseEntity<User>(user, HttpStatus.OK);
    }
}
