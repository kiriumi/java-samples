package java8.lambda;

public class LambdaClient {

	public static void main(String[] args) {

		// LAMBDA式のサンプル
		SampleLambda lambda = new SampleLambda();
		lambda.doLambda();

		System.out.println();

		// LAMBDA式のスコープ確認
		SampleLambdaScope lambdaScope = new SampleLambdaScope();
		SampleArgClass argClass = new SampleArgClass();
		String arg = "引数";
		lambdaScope.testScope(arg, argClass);
	}

}
