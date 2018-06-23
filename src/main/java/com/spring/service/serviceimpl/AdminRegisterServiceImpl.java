package com.spring.service.serviceimpl;

import com.wang.service.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 管理员注册
 *
 * @date 2018/5/24
 * @auther ten
 */
 class AdminRegisterServiceImpl implements Service {
    private Logger logger = LoggerFactory.getLogger(AdminRegisterServiceImpl.class);

    private AdminRegisterServiceImpl() {
    }

    static Service newService() {
        return new AdminRegisterServiceImpl();
    }

    @Override
    public ServiceResult execute(HttpServletRequest req, HttpServletResponse resp) {
        // TODO 管理员注册功能
        return null;
    }
}
