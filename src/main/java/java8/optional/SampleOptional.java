package java8.optional;

import java.util.Optional;

public class SampleOptional {

	/**
	 * Optionalの設定
	 * @param arg 引数
	 */
	public void setOptional(String arg) {

		// 空のOptionalを返す
		// Optional<String> optional = Optional.empty();

		// argがnullの場合、NullPointerExceptionで落ちる
		// Optional<String> optional = Optional.of(arg);

		// argがnullの場合、空のOptionalを返す
		Optional<String> optional = Optional.ofNullable(arg);
		String result = optional.orElse("引数がNullだよー");

		System.out.print("引数：" + arg);
		System.out.println(" -> setOptional()の実行結果：" + result);

	}

	/**
	 * Optionalの実行
	 * @param arg 引数
	 */
	public void doOptional(String arg) {

		doOrElse(arg);

		doOrElseGet(arg);

		doMap(arg);

		doIfPresent(arg);

		System.out.println();
	}

	/**
	 * orElse()のサンプル
	 *
	 * @param arg 引数
	 */
	private void doOrElse(String arg) {

		// argがnullの場合、"Nullだよー"と返す
		String result = Optional.ofNullable(arg).orElse("Nullだよー");
		printResults(getMethodName(), arg, result);
	}

	/**
	 * orElseGet()のサンプル
	 *
	 * @param arg 引数
	 */
	private void doOrElseGet(String arg) {

		// argがnullの場合、LAMBDA式を実行
		// LAMBDA式
		// ・引数：なし
		// ・戻値：あり
		String result = Optional.ofNullable(arg).orElseGet(() -> {
			return "NULLだよー";
		});

		printResults(getMethodName(), arg, result);
	}

	/**
	 * map()のサンプル
	 *
	 * @param arg 引数
	 */
	private void doMap(String arg) {

		// arg がnullではない場合、LAMBDA式を実行
		// ・引数：あり
		// ・戻値：あり
		String result = Optional.ofNullable(arg).map((String str) -> {
			return "mapでLAMBDA式を実行";
		}).orElse("NULLだよー");

		printResults(getMethodName(), arg, result);
	}

	/**
	 * ifPresent()のサンプル
	 *
	 * @param arg 引数
	 */
	private void doIfPresent(String arg) {

		// arg がnullではない場合、LAMBDA式を実行
		// ・引数：あり
		// ・戻値：なし
		Optional.ofNullable(arg).ifPresent((String str) -> {
			printResults("doIfPresent", arg, "ifPresentでLAMBDA式を実行");
		});
	}

	/**
	 * メソッド名の取得
	 * @return メソッド名
	 */
	private String getMethodName() {
        return Thread.currentThread().getStackTrace()[2].getMethodName();
    }

   /**
    * 結果をコンソールに出力
    * @param method
    * @param arg
    * @param result
    */
	private void printResults(String method, String arg, String result) {

		String format = "%s(%s)の実行結果：%s";
		System.out.println(String.format(format, method, arg, result));
	}

}
