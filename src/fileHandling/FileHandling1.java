package fileHandling;

import java.io.File;

public class FileHandling1 {

	public static void main(String[] args) {
		
		String path = "C:\\testfolder";
		File f1 = new File(path);
		
		System.out.println(f1);
		System.out.println(f1.getAbsolutePath());
		
		if(f1.exists()) {
			System.out.println("File exists");
		}else
		{
			System.out.println("File does not exist");
			f1.mkdir();
			if(f1.exists()) {
				System.out.println("File Now exists");
			}
		}
	}
}
