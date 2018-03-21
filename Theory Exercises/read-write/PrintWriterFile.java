import java.io.*;

public class PrintWriterFile {

   public static void main(String[] args) {
      String s = "Hello World";
      
      try {

         // create a new writer
         PrintWriter pw = new PrintWriter("C:/Users/Mariannita/Desktop/test.txt");

         // write substrings
         pw.write(s+"\r\n"+"new line");

         // flush the writer
         pw.flush();

      } catch (Exception ex) {
         ex.printStackTrace();
      }
   }
}