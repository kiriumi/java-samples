package java7.try_with_resources;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.stream.Stream;

public class SampleTryWithResources {

	private static final String FILE_PATH = "src/main/resources/file/try-with-resources.txt";

	/**
	 * 読込んだファイルのレコードをコンソールに出力
	 */
	public void print() {

		try(BufferedReader br = createBufferedReader(FILE_PATH)) {

			 Stream<String> lineStream = br.lines();
			 lineStream.forEach(System.out::println);

		} catch (FileNotFoundException e) {
			e.printStackTrace();

		} catch (IOException e) {
			e.printStackTrace();

		}

	}

	/**
	 * BufferedReaderのCreateメソッド
	 *
	 * @param filePath
	 * @return BufferedReader
	 * @throws FileNotFoundException
	 */
	private BufferedReader createBufferedReader(String filePath) throws FileNotFoundException {

		return new BufferedReader(new FileReader(filePath));
	}

}
