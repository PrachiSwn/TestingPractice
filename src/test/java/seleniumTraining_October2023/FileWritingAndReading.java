package seleniumTraining_October2023;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

public class FileWritingAndReading {

	public static void main(String[] args) throws IOException 
	{
		new File(System.getProperty("user.dir")+"//Logs").mkdirs();
		writeDataToTheFile(System.getProperty("user.dir")+"//Logs//Logs.txt","First Line of the File");
		writeDataToTheFile(System.getProperty("user.dir")+"//Logs//Logs.txt","Second Line of the File");

		readDataFromTheFile_Alternate(System.getProperty("user.dir")+"//Logs//Logs.txt");
	}

	public static void readDataFromTheFile_Alternate(String filePath) throws IOException
	{
		FileReader fr=new FileReader(filePath);

		//Since BufferedReader cannot interact with the file directly, we are taking the help of File Reader to read the data from the file
		BufferedReader br=new BufferedReader(fr);

//		System.out.println(br.readLine());

		//br.readLine() --->
		//1. Reads the data from the file line by line
		//2. Returns null if it reaches the end of the file

//		String str;
//
//		while((str= br.readLine())!=null)
//		{
//			System.out.println(str);
//		}

		//Collects all the data from the file and stores it in the form of a list
//		System.out.println(br.lines().collect(Collectors.toList()));

		List<String> l1=br.lines().collect(Collectors.toList());

		System.out.println(l1);

//		l1.add("Third Line Of The File");
//
//		l1.set(1,"Third Line Of The File");
//		l1.set(2,"Second Line Of The File");
//
//		System.out.println(l1);
//
//		new File(filePath).delete();
//
//		for(int i=0;i<l1.size();i++)
//		writeDataToTheFile(filePath,l1.get(i));
	}

	public static void readDataFromTheFile(String filePath) throws IOException {
		FileReader fr=new FileReader(filePath);

//		System.out.println(fr.read());

		//fr.read() --->
		//1. Reads the data from the file character by character
		//2. Returns the ASCII Value of the Character
		//3. Returns -1 if it reaches the end of the file

		int a;

		while((a= fr.read())!=-1)
		{
			//Type casting the integer to a character
			System.out.print((char)a);
		}
	}
	
	public static void writeDataToTheFile(String filePath, String content) throws IOException
	{
		File f1=new File(filePath);

		if(f1.exists())
		{
			//FileWriter is the class used to write the data to the file
			//Add the data to the existing set of data
			FileWriter fw = new FileWriter(filePath,true);

			//Add a new line
			fw.write("\n");

			//Writing the data to the file
			fw.write(content);

			//Closing the File Writer Object
			fw.close();
		}

		else {
			//FileWriter is the class used to write the data to the file
			FileWriter fw = new FileWriter(filePath);

			//Writing the data to the file
			fw.write(content);

			//Closing the File Writer Object
			fw.close();
		}
	}
}
