
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;



public class ReadFile3
{
    public static void main(String[]args) throws FileNotFoundException, IOException
    {
        InputStream inputStream = System.in;
        
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);        
        BufferedReader bufferReader = new BufferedReader(inputStreamReader);
        
      
        System.out.println("Digite algo:");
        String line = bufferReader.readLine();
        while(line != null)
        {
            System.out.println(line);
            
            System.out.println("Digite algo:");
            line = bufferReader.readLine();
        }      
    }
}