package java8.interface_default;

public class DefaultClient {

	public static void main(String[] args) {

		SampleDefalut imp1 = new SampleDefaultImp1();
		SampleDefalut imp2 = new SampleDefaultImp2();

		imp1.doDefault();
		imp2.doDefault();

		imp1.doSomething();
		imp2.doSomething();
	}

}
