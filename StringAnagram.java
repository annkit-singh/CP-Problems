import java.util.*;

class Zoo{

    static int total=256;
    public boolean areAnagram(String ist,String sec)
{
    char [] is=ist.toCharArray();
    char [] se=sec.toCharArray();
   int c1[]=new int[total];
   Arrays.fill(c1, 0);
   int c2[]=new int[total];
   Arrays.fill(c2,0);

   for(int i=0;i< ist.length() && i< sec.length();i++){
       c1[is[i]]++;
       c2[se[i]]++;
   }
   if(is.length!=sec.length()){
       return false;
   }

   for(int i=0;i<total;i++){
       if(c1[i]!=c2[i])
       return false;

   }
   return true;

}

public boolean isAnagram(String a,String b){
    if(a.length()!=b.length())
    return false;

    char [] is=a.toCharArray();
    char [] se=b.toCharArray();

    Arrays.sort(is);
    Arrays.sort(se);

    for(int i=0;i<is.length;i++){
        if(is[i]!=se[i])
        return false;
    }
    return true;
}
public boolean anagramString(String ist,String sec){
    String lowi=ist.toLowerCase();
    String lows=sec.toLowerCase();

 
    char isarray[]= lowi.toCharArray();
    HashSet hs=new HashSet<Character>();


    for(char c:isarray){
        hs.add(c);

    }
    for(int i=0;i<sec.length();i++){
      if(!hs.contains(lows.charAt(i))){
          return false;
      }
    }

      return true;
}
    
    

    public static void main(String []  args){
        Zoo z=new Zoo();
        System.out.println(z.isAnagram("khdshsk", "listen"));

        
    
        
    }
}