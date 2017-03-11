package java8.lambda;

public class SampleLambdaScope {

	private static String classField = null;
	private String instanceField = null;

	public void testScope(String arg, SampleArgClass argClass) {

		String localField = "ローカル変数";
		final String localFinalField = "ローカル定数";

		// LAMBDA式
		SampleLambdaScopeInterface lambda = () -> {

			// 更新可能な変数
			classField = "クラス変数";
			instanceField = "インスタンス変数";
			argClass.setArg("Argクラスのインスタンス変数");

			// 更新不可能な変数
			// arg = "引数";
			// argClass = new SampleArgClass(); // 引数のクラス
			// localField = "ローカル変数の更新";
			// localFinalField = "ローカル定数の更新";

			// クラス内のメソッドは使用可能
			method();

			System.out.println("【更新可能な変数】");
			System.out.println(classField);
			System.out.println(instanceField);
			System.out.println(argClass.getArg());

		};

		lambda.doLambda();

	}

	private void method() {
		System.out.println("同一クラス内のメソッド実行\n");
	}

}
