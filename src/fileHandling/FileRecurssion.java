package fileHandling;

import java.io.File;

public class FileRecurssion {

	public static void main(String[] args) {
		
		File f = new File("c:/testFolder");
		getFileList(f.getAbsolutePath());
		
		
	}
	
	public static void getFileList(String folderName) {
		
		File temp = new File(folderName);
		File[] fArray = temp.listFiles();
		
		for(File t:fArray) {
			
			if(t.isDirectory())
			{
				System.out.println("Folder : "+t);
				getFileList(t.getAbsolutePath());
			}else {
				System.out.println("File : "+t);
			}
		}
		
	}
	
	
	
	
}
