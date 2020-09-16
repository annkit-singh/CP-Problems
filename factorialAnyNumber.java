import java.util.*;
import java.io.*;
import java.lang.*;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
public class Main {
    public static BigInteger factorial(BigInteger b) {
        if (b.equals(new BigInteger("0")) || b.equals(new BigInteger("0"))) {
            return new BigInteger("1");
        } else
            return b.multiply(factorial(new BigInteger(String.valueOf(b.intValue() - 1))));
    }

    public static void main(String[] args) throws IOException{
          BufferedInputStream bis = new BufferedInputStream(System.in);
        BufferedReader r = new BufferedReader(new InputStreamReader(bis, StandardCharsets.UTF_8));
        PrintStream ps = new PrintStream(System.out);

        int cases=Integer.parseInt(r.readLine());
        while(cases--!=0){
            String str=r.readLine();
            BigInteger input=new BigInteger(str);
            BigInteger output=factorial(input);
            ps.println(output);

           

        }
      
            


        }
    
    
}