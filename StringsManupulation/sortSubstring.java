//  IMPORTANT: Multiple classes and nested static classes are supported */


//  * uncomment this if you want to read input.
// imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
// */

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail

class TestClass {
    public  String sortString(String inputString) 
    { 
        Character tempArray[] = new Character[inputString.length()]; 
        for (int i = 0; i < inputString.length(); i++) { 
            tempArray[i] = inputString.charAt(i); 
        } 
//Arrays.sort(tempArray,Collections.reverseOrder())
        Arrays.sort(tempArray, new Comparator<Character>(){ 
    
            public int compare(Character c1, Character c2) 
            { 
                return -Character.compare(Character.toLowerCase(c1), 
                                        Character.toLowerCase(c2)); 
            } 
        }); 
          
        // using StringBuilder to convert Character array to String 
        StringBuilder sb = new StringBuilder(tempArray.length); 
        for (Character c : tempArray) 
            sb.append(c.charValue()); 
    
        return sb.toString(); 
    } 
    
       
         
        public static void main(String args[] ) throws Exception {
            /* Sample code to perform I/O:
             * Use either of these methods for input
    
            //BufferedReader
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String name = br.readLine();                // Reading input from STDIN
            System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
    
            //Scanner
            Scanner s = new Scanner(System.in);
            String name = s.nextLine();                 // Reading input from STDIN
            System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
    
            */
    
            // Write your code here
      TestClass t=new TestClass();
            BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
            int tes=Integer.parseInt(bf.readLine());
            while(tes--!=0){
            
            String b=bf.readLine();
            String a[]=b.split(" ");
            String s=a[0];
            int begin=Integer.parseInt(a[1]);
            int end=Integer.parseInt(a[2]);
            String cut=s.subSequence(begin, end+1).toString();
            // System.out.println(cut);
           String reserve=t.sortString(cut);
           String finStr=s.substring(0,begin).toString()+reserve+s.substring(end+1,s.length()).toString();
           System.out.println(finStr);
            }
           
           
           
        }
    }
    