import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.*;
import java.util.Scanner;
class tryyy{
public void replace() {
      String oldFileName = "edit.txt";
      String tmpFileName = "tmp_try.txt";
     BufferedReader br = null;
      BufferedWriter bw = null;
      try {
         br = new BufferedReader(new FileReader(oldFileName));
         bw = new BufferedWriter(new FileWriter(tmpFileName));
         String line;
         while ((line = br.readLine()) != null) {
            if (line.contains())
               line = line.replace("[^0-9]", ""+System.currentTimeMillis());
            bw.write(line+"\n");
         }
      } catch (Exception e) {
         return;
      } finally {
         try {
            if(br != null)
               br.close();
         } catch (IOException e) {
            //
         }
         try {
            if(bw != null)
               bw.close();
         } catch (IOException e) {
            //
         }
      }
      // Once everything is complete, delete old file..
     File oldFile = new File(oldFileName);
      oldFile.delete();

      // And rename tmp file's name to old file name
      File newFile = new File(tmpFileName);
      newFile.renameTo(oldFile);

   }
}}

