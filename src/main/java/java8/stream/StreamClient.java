package java8.stream;

public class StreamClient {

	public static void main(String[] args) {

		SampleStream stream = new SampleStream();

		// Stream化
		stream.doIntStream();
		stream.doIntStreamByRange();
		stream.doIntStreamByOf();
		stream.doLongStream();
		stream.doStream();
		stream.toIntStream();
		stream.toStream();

		// 中間操作
		stream.doFilter();
		stream.doLimit();
		stream.doDistinct();
		stream.doMap();

		// 終端操作
		stream.doAnyMatch();
		stream.doAllMatch();
		stream.doSum();
		stream.doMax();

		// 直列処理
		stream.doSequential();

		// 並列処理
		stream.doParallel();
	}

}
