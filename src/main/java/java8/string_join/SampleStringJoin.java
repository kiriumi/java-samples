package java8.string_join;

public class SampleStringJoin {

	public static void main(String[] args) {

		String[] strs= {"1", "2"};

		String joined = String.join("-", strs);

		System.out.println(joined);
	}

}
