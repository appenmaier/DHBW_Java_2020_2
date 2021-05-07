package chapter08.demos.demo02;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Zeichenorientiertes Schreiben
 * 
 * @author Daniel Appenmaier
 *
 */
public class Demo0802Writer {

	public static void main(String[] args) {

		File file = new File("C:/Temp/demo0802.txt");

		// bis Java 7
//		BufferedWriter bufferedWriter = null;
//		try {
//			FileWriter fileWriter = new FileWriter(file);
//			bufferedWriter = new BufferedWriter(fileWriter);
//			bufferedWriter.write("Hans;false");
//			bufferedWriter.newLine();
//			bufferedWriter.write("Peter;false");
//			bufferedWriter.newLine();
//			bufferedWriter.write("Lisa;true");
//			bufferedWriter.newLine();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				if (bufferedWriter != null) {
//					bufferedWriter.close();
//				}
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		}

		// seit java 7
		try (FileWriter fileWriter = new FileWriter(file, true);
				BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
			bufferedWriter.write("Peter;false;2000");
			bufferedWriter.newLine();
			bufferedWriter.write("Hans;false;2002");
			bufferedWriter.newLine();
			bufferedWriter.write("Lisa;true;2001");
			bufferedWriter.newLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
