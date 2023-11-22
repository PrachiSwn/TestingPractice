package seleniumTraining_October2023;

import java.io.*;
import java.util.stream.Collectors;

public class AddTheDataBetweenTheFiles {

    public static void main(String[] args) throws IOException {

        writeDataInTheMiddleOfTheFile(System.getProperty("user.dir")+"//Logs//Logs.txt","Third Line of the File","First Line of the File");
    }

    public static void writeDataInTheMiddleOfTheFile(String filePath, String content, String locator) throws IOException {
        FileReader fr=new FileReader(filePath);

        BufferedReader br=new BufferedReader(fr);

        String existingData=br.lines().collect(Collectors.toList()).toString();

        String[] existingArray=existingData.split(",");

        String newData="";

        for(int i=0;i<existingArray.length;i++)
        {
            if(existingArray[i].replace("[","").replace("]","").equalsIgnoreCase(locator))
            {
                newData=newData+existingArray[i]+"\n"+content;
            }

            else
                newData=newData+"\n"+existingArray[i];
        }

        FileWriter fw=new FileWriter(System.getProperty("user.dir")+"//Logs//UpdatedLogs.txt");

        fw.write(newData.replace("[","").replace("]",""));
        fw.close();
    }
}
