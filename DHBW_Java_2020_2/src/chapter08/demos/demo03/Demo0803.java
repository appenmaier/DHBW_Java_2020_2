package chapter08.demos.demo03;

import java.io.File;
import java.io.IOException;
import java.util.Map.Entry;
import java.util.Properties;

/**
 * Absolute und relative Pfandangaben
 * 
 * @author Daniel Appenmaier
 *
 */
public class Demo0803 {

	public static void main(String[] args) throws IOException {

		String pathDocumentA;
		String pathDocumentB;

		/*
		 * Absolute Pfadangaben
		 */
		pathDocumentA = "C:/Temp/DocumentA.txt";
		checkPath("absolute Pfadangabe DocumentA", pathDocumentA);
		pathDocumentB = "C:/Users/d054906/git/DHBW_Java_2020_2/DHBW_Java_2020_2/src/resources/documents/DocumentB.txt";
		checkPath("absolute Pfadangabe DocumentB", pathDocumentB);

		/*
		 * Relative Pfadangaben
		 */
		pathDocumentA = "../../../../../Temp/DocumentA.txt";
		checkPath("relative Pfadangabe DocumentA", pathDocumentA);
		pathDocumentB = "src/resources/documents/DocumentB.txt";
		checkPath("relative Pfadangabe DocumentB", pathDocumentB);

		/*
		 * Systemeigenschaften
		 */
		String fileSeparator = System.getProperty("file.separator");
		String userWorkDirectory = System.getProperty("user.dir");
		String userHomeDirectory = System.getProperty("user.home");

		System.out.println("fileSeparator: " + fileSeparator);
		System.out.println("userWorkDirectory: " + userWorkDirectory);
		System.out.println("userHomeDirectory: " + userHomeDirectory);
		System.out.println();

		Properties properties = System.getProperties();
		for (Entry<Object, Object> entry : properties.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}

	}

	public static void checkPath(String option, String path) throws IOException {
		File file = new File(path);
		if (!file.exists()) {
			System.err.println(option);
			return;
		}

		System.out.println(option);
		System.out.println(file.getPath());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getCanonicalPath());
		System.out.println();
	}

}
