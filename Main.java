import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter(new File("test.csv"));
        Scanner sc = new Scanner(new File("trainingDataIntsHash.csv"));
        StringBuilder sb = new StringBuilder();
        sc.useDelimiter("\n");


        while(sc.hasNext())
        {
            String s = sc.next();
            String[] cells = s.split(",");
            for(int i = 0; i <20; i++)
            {
                sb.append(cells[0].substring(0, cells[0].length() - 4) + "." + i + ","+cells[1]);
            }
        }
        pw.write(sb.toString());
        pw.close();
    }
    //
}