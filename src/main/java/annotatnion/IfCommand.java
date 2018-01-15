package annotatnion;

import java.lang.reflect.Proxy;

import annotatnion.SampleAnontation.MethodAnnotation;

public interface IfCommand {

	public static IfCommand create(Object obj) {

		return (IfCommand) Proxy.newProxyInstance(
				IfCommand.class.getClassLoader(),
				new Class[] { IfCommand.class },
				new Intercepter(obj));
	}

	@MethodAnnotation
	public void consumer(String message);

	@MethodAnnotation
	public boolean supplyer();

	public void noAnnotation();

}
