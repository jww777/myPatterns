import com.demo.MyPatternsApplication;
import com.demo.action.strategy.Context;
import com.demo.action.strategy.OperationAdd;
import com.demo.action.strategy.OperationSubstract;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Description:
 * @Author: jww
 * @CreateDate: 2019/4/9 13:38
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes={MyPatternsApplication.class})// 指定启动类
public class MyPatternsTest {

    /**
     * @Description: 策略模式 ,如果一个系统的策略多于四个，就需要考虑使用混合模式，解决策略类膨胀的问题
     * @param
     * @Author: jww
     * @CreateDate: 2019/4/9 13:40
     */
    @Test
    public void testStrategy()
    {
        Context context = new Context(new OperationAdd());
        System.out.println("10 + 5 = "+ context.execStrategy(10,5));

        Context context2 = new Context(new OperationSubstract());
        System.out.println("10 - 5 = "+ context2.execStrategy(10,5));
    }
}
