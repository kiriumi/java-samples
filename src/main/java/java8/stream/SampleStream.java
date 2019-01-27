package java8.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/**
 * Streamのサンプル
 *   ①データを Stream に変換
 *   ②中間操作：Streamのデータを加工して、Streamを返す。
 *   ③終端操作：Streamの処理を確定する。
 *
 * @author Kengo
 *
 */
public class SampleStream {

	/**
	 * IntStreamのサンプル
	 */
	public void doIntStream() {

		print(getMethodName());

		int[] ints = {1, 2, 4, 8};

		IntStream intStream = Arrays.stream(ints);
		intStream.forEach(System.out::println);
	}

	/**
	 * IntStreamのサンプル
	 */
	public void doIntStreamByRange() {

		print(getMethodName());

		// 2～4まで
		IntStream intStream = IntStream.rangeClosed(2, 4);
		intStream.forEach(System.out::println);
	}

	/**
	 * IntStreamのサンプル
	 */
	public void doIntStreamByOf() {

		print(getMethodName());

		IntStream intStream = IntStream.of(1, 2, 4);
		intStream.forEach(System.out::println);
	}

	/**
	 * LongStreamのサンプル
	 */
	public void doLongStream() {

		print(getMethodName());

		long[] longs = {1L, 100L};

		// 10～15まで
		LongStream longStream = Arrays.stream(longs);
		longStream.forEach(System.out::println);
	}

	/**
	 * Streamのサンプル
	 */
	public void doStream() {

		print(getMethodName());

		List<String> strs = Arrays.asList("横須賀", "呉", "佐世保", "舞鶴");

		Stream<String> stream = strs.stream();
		stream.forEach(System.out::println);
	}

	/**
	 * Stream → IntStreamのサンプル
	 */
	public void toIntStream() {

		print(getMethodName());

		String[] strs = {"1", "2", "3"};

		// Stream化
		Stream<String> strStream  = Arrays.asList(strs).stream();

		IntStream intStream = strStream.mapToInt(s -> Integer.parseInt(s));

		// 終端操作
		intStream.forEach(System.out::println);
	}

	/**
	 * IntStream → Streamのサンプル
	 */
	public void toStream() {

		print(getMethodName());

		int[] ints = {1, 2, 3};

		// Stream化
		IntStream intStream  = Arrays.stream(ints);

		Stream<String> strStream = intStream.mapToObj(i -> String.valueOf(i));

		// 終端操作
		strStream.forEach(System.out::println);
	}



	/**
	 * 中間操作 filter() のサンプル
	 */
	public void doFilter() {

		print(getMethodName());

		int[] ints = {1, 2, 3, 4, 1, 2};

		// Stream化
		IntStream intStream = Arrays.stream(ints);

		// 中間操作
		intStream = intStream.filter(i -> i % 2 == 0);

		// 終端操作
		intStream.forEach(System.out::println);
	}

	/**
	 * 中間操作 limit() のサンプル
	 *   ※重複は集約される
	 */
	public void doLimit() {

		print(getMethodName());

		int[] ints = {1, 2, 3, 4, 1, 2};

		// Stream化
		IntStream intStream = Arrays.stream(ints);

		// 中間操作
		intStream = intStream.limit(3);

		// 終端操作
		intStream.forEach(System.out::println);
	}

	/**
	 * 中間操作 distinct() のサンプル
	 */
	public void doDistinct() {

		print(getMethodName());

		int[] ints = {1, 2, 3, 4, 1, 2};

		// Stream化
		IntStream intStream = Arrays.stream(ints);

		// 中間操作
		intStream = intStream.distinct();

		// 終端操作
		intStream.forEach(System.out::println);
	}

	/**
	 * 中間操作 map() のサンプル
	 */
	public void doMap() {

		print(getMethodName());

		int[] ints = {1, 2, 3, 4, 1, 2};

		// Stream化
		IntStream intStream = Arrays.stream(ints);

		// 中間操作
		intStream = intStream.map(i -> 1); // すべて1に変更

		// 終端操作
		intStream.forEach(System.out::println);
	}

	/**
	 * 終端操作 anyMatch() のサンプル
	 */
	public void doAnyMatch() {

		print(getMethodName());

		int[] ints = {1, 2, 3, 4, 1, 2};

		// Stream化
		IntStream intStream = Arrays.stream(ints);

		// 終端操作
		System.out.println(intStream.anyMatch(value -> value == 2));
	}

	/**
	 * 終端操作 allMatch() のサンプル
	 */
	public void doAllMatch() {

		print(getMethodName());

		int[] ints = {1, 2, 3, 4, 1, 2};

		// Stream化
		IntStream intStream = Arrays.stream(ints);

		// 終端操作
		System.out.println(intStream.allMatch(value -> value == 2));
	}

	/**
	 * 終端操作 sum() のサンプル
	 */
	public void doSum() {

		print(getMethodName());

		int[] ints = {1, 2, 3, 4, 1, 2};

		// Stream化
		IntStream intStream = Arrays.stream(ints);

		// 終端操作
		System.out.println(intStream.sum());
	}

	/**
	 * 終端操作 max() のサンプル
	 */
	public void doMax() {

		print(getMethodName());

		int[] ints = {1, 2, 3, 4, 1, 2};

		// Stream化
		IntStream intStream = Arrays.stream(ints);

		// 終端操作
		int max = intStream.max().getAsInt();

		System.out.println(max);
	}

	/**
	 * 直列処理 のサンプル
	 */
	public void doSequential() {

		print(getMethodName());

		int[] ints = {1, 2, 3, 4};

		// Stream化
		IntStream intStream = Arrays.stream(ints);

		// 直列処理化
		intStream.sequential();

		// 中間操作
		intStream = intStream.map(i -> i * i);

		// 終端操作
		intStream.forEach(System.out::println);
	}

	/**
	 * 並列処理 のサンプル
	 */
	public void doParallel() {

		print(getMethodName());

		int[] ints = {1, 2, 3, 4};

		// Stream化
		IntStream intStream = Arrays.stream(ints);

		// 直列処理化
		intStream.parallel();

		// 中間操作
		intStream = intStream.map(i -> i * i);

		// 終端操作
		intStream.forEach(System.out::println);
	}

	/**
	 * メソッド名の取得
	 * @return メソッド名
	 */
	private String getMethodName() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

   /**
    * メソッドの開始ログをコンソールに出力
    * @param method メソッド名
    */
	private void print(String method) {

		String format = "\n%s()の実行";
		System.out.println(String.format(format, method));
	}
}
