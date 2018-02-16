
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;



public class ReadFile
{
    public static void main(String[]args) throws FileNotFoundException, IOException
    {
        InputStream inputStream = new FileInputStream("arquivo.txt");
        
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        
        BufferedReader bufferReader = new BufferedReader(inputStreamReader);
        
        //int i = inputStream.read();
        
        
        String line = bufferReader.readLine();
        while(line != null)
        {
            System.out.println(line);            
            line = bufferReader.readLine();
        }        
    }
}