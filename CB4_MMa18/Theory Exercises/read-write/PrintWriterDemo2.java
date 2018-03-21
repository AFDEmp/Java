import java.io.*;

public class PrintWriterDemo2 {

   public static void main(String[] args) {
      String s = "Hello World";
      
      try {

         // create a new writer
         PrintWriter pw = new PrintWriter(System.out);

         // write substrings
         pw.write(s);

         // flush the writer
         pw.flush();

      } catch (Exception ex) {
         ex.printStackTrace();
      }
   }
}