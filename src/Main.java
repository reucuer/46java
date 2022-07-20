import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalTime;
import java.util.Scanner;
import java.lang.String;
import java.util.Arrays;
import java.lang.Math;
import java.math.BigInteger;
import java.text.DecimalFormat;



public class Main {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String path = "INPUT.TXT";
        File file = new File(path);
        Scanner sc = new Scanner(file);
        int N = sc.nextInt();
        String answer="";

        String value = "2.7182818284590452353602875";
        String value1 = value.substring(0,13);
        String value2 = value.substring(13,27);
        Double d1 = Double.parseDouble(value1);
        System.out.println(d1);
        Double d2 = Double.parseDouble(value2);
        String result = "";
        if (N < 14) {
            //result = String.format("%.Nf", d1);
        }
        answer = result;
        answer = answer.replace(',', '.');
        FileWriter writerS = new FileWriter("OUTPUT.TXT", false);
        writerS.write(String.valueOf(answer));
        writerS.flush();
    }
}
