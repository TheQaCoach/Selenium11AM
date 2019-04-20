package fileHandling;

import java.io.File;

public class ReadFileCountFromFolder {

	public static void main(String[] args) {
		
		String path = "C:\\testfolder";
		File f1 = new File(path);
				
		File[] fileArray = f1.listFiles();
		
		System.out.println(fileArray.length);
		
		for(File tempVar:fileArray) {
			System.out.println(tempVar);
		}
		
	}
}
