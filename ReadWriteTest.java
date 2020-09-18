package FifthdayTest;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class ReadWriteTest {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\GBA\\IO" + File.separator + "test.txt");
		Writer out = new FileWriter(f);
		System.out.println("写进去的内容：hahaha");
		String str = "hahaha/n";
		out.write(str);
		out.close();

		Reader input = new FileReader(f);
		char[] c = new char[1024];
		int temp = 0;
		int len = 0;
		while ((temp = input.read()) != -1) {
			c[len] = (char) temp;
			len++;
		}
		input.close();
		System.out.println("读出的内容：");
		System.out.println(new String(c, 0, len));
	}
}
