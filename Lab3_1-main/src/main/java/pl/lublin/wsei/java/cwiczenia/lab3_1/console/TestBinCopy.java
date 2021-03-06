package pl.lublin.wsei.java.cwiczenia.lab3_1.console;
import java.io.*;
import java.io.FileInputStream;

public class TestBinCopy {
    public static void main(String[] args) throws IOException {
        FileInputStream in=null;
        FileOutputStream out=null;
        long startTime=System.nanoTime();
4444
        try{
            in =new FileInputStream("sample_1920×1280.tiff");
            out=new FileOutputStream("img_copy.tiff");
            int c;
            while((c = in.read()) != -1){
                out.write(c);
            }
            }
        catch (IOException e){
            System.out.println("IOexception: "+e.getMessage());
            e.printStackTrace();

        }
        finally {
            if (in != null){
                in.close();
            }
            if(out !=null){
                out.close();
            }
        }
        long endTime =System.nanoTime();
        long timeElapsed=endTime-startTime;
        System.out.println("Czas wykonania w nanosekundach: "+timeElapsed);
        System.out.println("Czas wykonania w milisekundach: "+timeElapsed/1000000);
    }
}
