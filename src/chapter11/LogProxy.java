package chapter11;

import java.lang.reflect.*;
public class LogProxy implements InvocationHandler
{

	private Logger logger = Logger.getLogger(this.getClass().getName());
	private Object delegate;
	
	public Object bind(Object delegate)
	{
		this.delegate = delegate;
		return Proxy.newProxyInstance(delegate.getClass().getClassLoader(), delegate.getClass().getInterfaces(), this);
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		Object result = null;
		try {
			logger.log(args[0] + "开始业务逻辑处理……");
			result = method.invoke(delegate, args);
			logger.log(args[0] + "业务逻辑处理结束……");
		} catch (Exception e) {
			logger.log(e.toString());
		}
		return result;
	}
    
}
