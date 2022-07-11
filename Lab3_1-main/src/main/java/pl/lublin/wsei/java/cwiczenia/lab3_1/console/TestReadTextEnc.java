package pl.lublin.wsei.java.cwiczenia.lab3_1.console;

import java.io.*;
import java.nio.charset.Charset;
import java.time.Instant;

public class TestReadTextEnc {
    public static void main(String[] args)throws IOException {
        BufferedReader in=null;
        BufferedWriter out=null;
        System.out.println("Domyślne kodowanie: "+ Charset.defaultCharset().displayName());
        long startTime= Instant.now().toEpochMilli();
        try{
            in=new BufferedReader(new FileReader("dzieweczki.txt",Charset.forName("windows-1250")));
            //out=new BufferedWriter(new FileWriter("dzieweczki_java.txt"));
            PrintStream out2=new PrintStream(new FileOutputStream("dzieweczki_java2.txt"));
            String line;
            while ((line=in.readLine())!=null){
                //out.write(line);
                //out.newLine();
                out2.println(line);

            }
        }
        catch(IOException e){
            System.out.println("IOException: "+e.getMessage());
        }
        finally{
            if(in!=null){
                in.close();
            }
            if(out!=null){
                out.close();
            }
        }
        System.out.println("Czas kopiowania w nanosekundach: "+(Instant.now().toEpochMilli()-startTime));



    }
}
