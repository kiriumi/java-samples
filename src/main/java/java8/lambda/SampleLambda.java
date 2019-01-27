package java8.lambda;

public class SampleLambda {

	public String doLambda() {

		// LAMBDA式
		SampleFunctionalInterface lambda = (String target) -> {
			String message = "Hello " + target;
			System.out.println(message);
			return message;
		};

		return lambda.seyHello("World");

	}
}
