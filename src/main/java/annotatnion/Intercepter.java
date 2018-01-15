package annotatnion;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

import annotatnion.SampleAnontation.MethodAnnotation;

public class Intercepter implements InvocationHandler {

	// 処理を追加したいインスタンス
	private Object target;

	public Intercepter(Object target) {
		this.target = target;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		// MethodAnnotationアノテーションがついていないメソッドは、追加処理せず、終了。
		if (!Arrays.stream(method.getAnnotations()).anyMatch(p -> p instanceof MethodAnnotation)) {
			return method.invoke(target, args);
		}

		// 以下、MethodAnnotationアノテーションがついているメソッドは、処理を追加する
		System.out.println("AOP処理開始");

		// メソッド名と引数を出力
		StringBuilder sb = new StringBuilder();
		if (args != null) {
			Arrays.stream(args).forEach(arg -> sb.append(arg.toString()).append(" "));
		}

		System.out.println("呼び出しメソッド:" + method.getName() + " 引数:" + sb.toString());

		// 実際に実施し、結果を保存する
		Object result = method.invoke(target, args);

		if (result != null) {
			System.out.println("結果:" + result.toString());
		}

		// AOPの処理が完了したことを出力。空行も出力。
		System.out.println("AOP処理完了");
		System.out.println();

		// 実施した結果を返し、通常の実施を同じにする
		return result;
	}

}
