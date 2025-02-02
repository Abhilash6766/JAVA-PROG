import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {
    public static void main(String args[]) throws IOException{
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        try{
            int num = Integer.parseInt(br.readLine());
            System.out.println(num);
        }catch(NumberFormatException e){
            System.out.println("Enter the integer value");
        }catch(Exception e){
            e.printStackTrace();
        }
    } 
}
