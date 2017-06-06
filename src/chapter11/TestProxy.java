package chapter11;
public class TestProxy implements Test
{
    private Logger logger = Logger.getLogger(getClass().getName());
    private Test test;

    public TestProxy(Test test)
    {
        this.test = test;
    }

    public void doLogic(String name)
    {
        logger.log(name + "开始业务逻辑处理……");
        test.doLogic(name);
        logger.log(name + "业务逻辑处理结束……");
    }
}
