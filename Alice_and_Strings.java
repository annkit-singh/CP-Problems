import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.*;

class TestClass{
    public Boolean aliceString(String a, String b){
        if(a.length() >1000000 ||b.length() >1000000){
            return false;
        }

        if(a.length()==b.length()){
        char array1[]=a.toCharArray();
        char array2[]=b.toCharArray();

        for(int i=0;i<array1.length;i++){
            if(array1[i]>array2[i]){
                return false;
            }
            else if(array1[i]==array2[i]){
            if(i==array1.length-1){
                return true;
            }
                continue;
        }
            
            else{
                    while(array1[i]==array2[i])
                        array1[i]++;
            }
            if(i==array1.length-1){
                return true;
            }
        }
    }
    return false;
}
    public static void main(String [] args) throws Exception{
        TestClass a=new TestClass();
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String ist=bf.readLine();
        String sec=bf.readLine();
        if(a.aliceString(ist,sec)){
            System.out.println("YES");
        }
        else
        System.out.println("NO");

    }
}