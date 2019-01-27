package java8.interface_default;

public interface SampleDefalut {

	default void doDefault() {
		System.out.println("doDefault()を実行");
	}

	// ※自動でpublic abstructが付く
	void doSomething();
}
