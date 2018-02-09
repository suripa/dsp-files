
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;



public class ReadFile2
{
    public static void main(String[]args) throws FileNotFoundException, IOException
    {
        InputStream inputStream = new FileInputStream("arquivo.txt");
        
        Scanner scanner = new Scanner(inputStream);
        
        while(scanner.hasNext())
        {
            System.out.println(scanner.nextLine());
        }
       
    }
}