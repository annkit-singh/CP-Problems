import java.util.Arrays;

class ProblemSet{

    public int RangeArray(int []array){
        int min=array[0];
        int max=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]<min){
                min=array[i];
            }
            if(array[i]>max){
                max=array[i];
            }
        }
        int result=max-min;

        return result;

        }


        // #question which illutrate flood fill
        public void floodFill(int array[][],int rows,int columns,int prevFills,int toFill){
            int ro=array.length;
            int col=array[0].length;

            if(rows<0 || rows>=ro || columns<0  || columns>=col)
                return;
            if(array[rows][columns]!=prevFills)
                return;
            array[rows][columns]=toFill;
            floodFill(array, rows-1, columns, prevFills, toFill);
            floodFill(array, rows, columns-1, prevFills, toFill);
            floodFill(array, rows+1, columns, prevFills, toFill);
            floodFill(array, rows, columns+1, prevFills, toFill);
        }

// Function to print matrix
        public static void printMatrix(int array[][]){
            int rows=array.length;
            int col=array[0].length;
            for(int i=0;i<rows;i++){
                for(int j=0;j<col;j++){
                    System.out.print(array[i][j]+" ");
                }
                System.out.println();
            }
        }
        

// Interchange the indexes from string
        public static String interchange(String s,int l,int r){
            String p;
            char  c[]=s.toCharArray();
            char temp=c[l];
            c[l]=c[r];
            c[r]=temp;
           p= String.valueOf(c);
        

           return p;
        }

// Question on game theory

        public int gameTheory(int array[],int l,int r){
            if(l+1==r){
                System.out.println(Math.max(array[l], array[r]));
            }
            return Math.max(    array[l]+Math.min(gameTheory(array, l+2, r),gameTheory(array, l+1, r-1)),
            array[r]+Math.min(gameTheory(array, l+1, r-1),gameTheory(array, l, r-2))
            );
        }


        // TO print permutation of the string
        public void permutationsMade(String s,int l,int r){
            if(l==r){
                System.out.println(s);
                return ;
            }
            for(int i=l;i<=r;i++){
                s=interchange(s, l, i);
                permutationsMade(s, l+1, r);
                s=interchange(s, l, i);
            }
        }

        public String interchangeMade(String s,int a,int b){
            char [] p=s.toCharArray();
            char temp=p[a];
            p[a]=p[b];
            p[b]=temp;
            return String.valueOf(p);

        }
        public static void main(String[] args){
           ProblemSet r=new ProblemSet();
            r.permutationsMade("abc", 0, 2);
        //     int array[]={1,5,7,3,7,8,9};
        //     int right=array.length-1;
        //    int result= r.gameTheory(array, 0,right);
        //    System.out.println(result);
        //    String o= "abc";
        //    int len=o.length()-1;
        //   r.permutation(o, 0, len);
            // int array[] []={{1,1,1,1,1},
            //                 {0,0,1,2,1},
            //                 {1,1,1,1,0},
            //                 {2,1,1,1,0}};
            // r.floodFill(array, 0, 0, 1, 99);
            // printMatrix(array);

        



        }
    }
    
