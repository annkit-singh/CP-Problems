public class FloodFill {

    public void floodFill(int array[][],int sr,int sc,int prevFill,int toFill){
        if(sr<0 || sc<0 || sr>array.length-1|| sc>array[0].length-1){
            return;
        }
        if(array[sr][sc]!=prevFill){
            return;
        }
        array[sr][sc]=toFill;

         floodFill(array, sr, sc+1, prevFill, toFill);
         floodFill(array, sr, sc-1, prevFill, toFill);
         floodFill(array, sr-1, sc, prevFill, toFill);
        floodFill(array, sr+1, sc, prevFill, toFill);

        }

public static void main(String [] args){

        FloodFill f=new FloodFill();
int array[][]={
    {1,1,2,2},
    {2,2,4,2},
    {2,3,2,2},
    {2,2,2,1}
};
f.floodFill(array, 0, 2,2, 8);
for(int arr[]:array){
    for(int i:arr){
        System.out.print(i+" ");
    }
    System.out.println();
}
}