package java8.ifdefault;

public interface SampleDefalut {

	default void doDefault() {
		System.out.println("doDefault()を実行");
	}

	// ※自動でpublic abstructが付く
	void doSomething();
}
