public class Test { 
public void permuatations(char[] cArr,int left,int right){
            if(left==right){
                System.out.println(Arrays.toString(cArr)+" ");
            }
            for(int i=left;i<=right;i++){
                interChange(cArr, i, left);
                permuatations(cArr, left+1, right);
#for Backtracking->
                interChange(cArr, i, left);

            }

        }

        public void interChange(char[] cArr,int a,int b){
            char emp=cArr[a];
            cArr[a]=cArr[b];
            cArr[b]=emp;
        }
public static void main(String [] args){

        Test f=new Test();
    String str="ABC";
        char [] cu=str.toCharArray();
        f.permuatations(cu, 0, cu.length-1);

}
}