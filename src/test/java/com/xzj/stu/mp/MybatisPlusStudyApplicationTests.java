package com.xzj.stu.mp;

import com.xzj.stu.mp.entity.User;
import com.xzj.stu.mp.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisPlusStudyApplicationTests {

    @Autowired
    private UserService userService;

    @Test
    public void test_01_add() {
        User user = new User();
        user.setName("xzj");
        user.setAge(28);
        boolean save = userService.save(user);
        Assert.assertEquals(true, save);
    }

    @Test
    public void test_03_getOne() {
        User userPO = userService.getById(1L);
        Assert.assertNotNull(userPO);
    }

    @Test
    public void test_07_list() {
        List<User> list = userService.list();
        Assert.assertNotEquals("user table is not empty", 0, list.size());
    }

}
