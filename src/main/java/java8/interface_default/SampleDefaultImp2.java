package java8.interface_default;

public class SampleDefaultImp2 implements SampleDefalut {

	@Override
	public void doDefault() {
		System.out.println("Imp2でdoDefault()を実行");
	}

	@Override
	public void doSomething() {
		System.out.println("Imp1のdoSomething()を実行");
	}
}
