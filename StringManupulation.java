class Test{
    public static void main (String[] args){
        String s="hacker";
        char[] c=s.toCharArray();
        char[] newChar=new char[c.length];
            int q=2;

            for(int i=0;i<c.length;i++){
                if(q>c.length-1){
                    q=q%c.length;
                }
                newChar[q++]=c[i];
            }
            
        for(char al:newChar)
            System.out.print(al);
        
    }
}