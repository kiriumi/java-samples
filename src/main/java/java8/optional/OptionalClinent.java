package java8.optional;

public class OptionalClinent {

	public static void main(String[] args) {

		SampleOptional optional = new SampleOptional();
		optional.setOptional("引数");
		optional.setOptional(null);

		System.out.println();
		optional.doOptional("引数");
		optional.doOptional(null);

	}
}
