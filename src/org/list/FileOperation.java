package org.list;

import java.io.File;
import java.io.IOException;

public class FileOperation {
public static void main(String[] args) throws IOException {
	File f=new File("C:\\Users\\Meeral\\OneDrive\\Desktop\\Sample\\Open.txt");
	//boolean mkdir = f.mkdir();
	//System.out.println(mkdir);
	//boolean mkdirs = f.mkdirs();
	//System.out.println(mkdirs);
	//boolean canWrite = f.canWrite();
	//System.out.println(canWrite);
	boolean canExecute = f.canExecute();
	System.out.println(canExecute);
}
}
