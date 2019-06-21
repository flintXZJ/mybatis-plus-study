package com.xzj.stu.mp.service.impl;

import com.xzj.stu.mp.entity.User;
import com.xzj.stu.mp.mapper.UserMapper;
import com.xzj.stu.mp.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhijunxie
 * @since 2019-06-21
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
