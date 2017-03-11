package java8.stringjoin;

public class SampleStringJoin {

	public static void main(String[] args) {

		String[] strs= {"1", "2"};

		String joined = String.join("-", strs);

		System.out.println(joined);
	}

}
