import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.yuanmeng.springdemo.model.UserInfo;
import com.yuanmeng.springdemo.service.UserService;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",    "classpath:spring-mybatis.xml" })
public class TestUserService {

    private static final Logger LOGGER = Logger.getLogger(TestUserService.class);

    @Autowired
    private UserService userService;

    
    @Test
    public void testGetUserInfoById() {
        UserInfo userInfo = userService.getUserInfoById(1);
        LOGGER.info(JSON.toJSON(userInfo));
    }
}
