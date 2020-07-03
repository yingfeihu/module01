import com.alibaba.dubbo.config.annotation.Reference;
import com.cn.Module01Application;
import com.cn.service.UserServcie;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @Author: 应飞虎
 * @Date: 2020/7/3 13:45
 * @Desc:
 */
@SpringBootTest(classes = Module01Application.class)
@RunWith(SpringRunner.class)
public class UserServiceTest {

    @Reference
    private UserServcie userServcie;

    @Test
    public void testHello() {
        String hello = userServcie.hello();
        System.out.println(hello);
    }
}
