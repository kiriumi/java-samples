package annotatnion;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class SampleAnontation {

	/**
	 * アノテーションの定義
	 * ・RetentionPolicy.RUNTIME: 実行時に有効になる
	 * ・ElementType.METHOD:メソッドに使用するアノテーション
	 */
	@Retention(RetentionPolicy.RUNTIME)
	@Target(ElementType.METHOD)
	public @interface MethodAnnotation {
	}

}
