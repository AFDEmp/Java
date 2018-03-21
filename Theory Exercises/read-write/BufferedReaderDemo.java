import java.io.BufferedReader;
import java.io.FileReader;


public class BufferedReaderDemo {
   
   public static void main(String[] args) throws Exception {
      String thisLine = null;
      
      try {
         BufferedReader br = new BufferedReader(new FileReader("C:/Users/Mariannita/Desktop/test.txt"));      
         while ((thisLine = br.readLine()) != null) {
            System.out.println(thisLine);
         }       
      } catch(Exception e) {
         e.printStackTrace();
      }
   }
}