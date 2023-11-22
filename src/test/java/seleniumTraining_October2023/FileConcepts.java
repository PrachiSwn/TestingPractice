package seleniumTraining_October2023;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileConcepts {

	public static void main(String[] args) throws IOException {
		
		//Prints the path of the project that we are working
		System.out.println(System.getProperty("user.dir"));
		
		File f1=new File(System.getProperty("user.dir")+"//Logs");
		
		//Checks if the given file path exists 
		//Returns true if the above condition is satisfied else it returns false
		System.out.println(f1.exists());

		//Checks if the given file path is hidden or not
		//Returns true if the above condition is satisfied else it returns false
		System.out.println(f1.isHidden());
		
		//Checks if we can read the data from the above file path
		//Returns true if the above condition is satisfied else it returns false
		System.out.println(f1.canRead());
		
		//Creates the missing folders or directories mentioned in the file path
		f1.mkdirs();
		
		System.out.println(f1.exists());
		
		//Deletes that folder/file present in that path
		f1.delete();
		
		//Prints the path of the file stored in the file object
		System.out.println(f1.getPath());
		
		f1.mkdirs();
		
		File f2=new File(f1.getPath()+"//Logs.txt");
		
		//Checks if we can write the data to the file
		//Returns true if the above condition is satisfied else it returns false
		System.out.println(f2.canWrite());

		//Creates the missing file
		f2.createNewFile();
		
		System.out.println(f2.canRead());

		//Setting the file to readable mode
		f2.setReadOnly();
		
		System.out.println(f2.canWrite());
		
		//Setting the file to writable mode
		f2.setWritable(true);
		
		//Prints the size of the file in bytes
		System.out.println(f2.length());
		
		//Prints the last modified date time in nanoseconds
		System.out.println(f2.lastModified());
		System.out.println(getCurrentDateTime("dd-MM-yyyy hh-mm-ss E", f2.lastModified()));
		
		//Checks if the given path is a file 
		//Returns true if the above condition is satisfied else it retuns false
		System.out.println(f2.isFile());
	}
	
	//dd-MM-yyyy, yyyy-MM-dd, MM-yyyy-dd, dd-MM-yyyy hh-mm-ss.SSS,
	public static String getCurrentDateTime(String format, long time)
	{
		//JAVA Understand the date format that you have given
		SimpleDateFormat sdf=new SimpleDateFormat(format);
		
		//It Will convert the given time into a default date format
		Date d1=new Date(time);
		
		//Returns the date in the format that we have mentioned for
		return sdf.format(d1);
	}
}
