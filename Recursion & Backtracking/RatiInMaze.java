class Rat{
    void  ratInMaze (int [][]  maze,int [][] solution ,int x,int y){
        if(x==solution.length-1 && y==solution.length-1){
            solution[x][y]=1;
            printMatrix(solution);
     

        }
        if(x>=maze.length ||y>=maze.length || x<0 || y<0 ||maze[x][y]==0  ||solution[x][y]==1){
            return;
        }
            
        solution[x][y]=1;   //to make path in maze
        ratInMaze(maze, solution, x-1, y);   //to up
        ratInMaze(maze, solution, x+1, y);   //to down
        ratInMaze(maze, solution, x, y+1);   //to left
        ratInMaze(maze, solution, x, y-1);   //to right
        solution[x][y]=0;  //this line is for backtrack to zero while moving backward
    }

    void printMatrix(int [][] mat){
        for(int internal[]:mat){
            for(int i:internal){
                System.out.print(i+" ");
            }
            System.out.println();
        }


        System.out.println(" ******* ");
    }






    public static void main(String [] args){
        Rat n=new Rat();

        int matrix[][]={{1,1,0},
                        {1,1,1},
                        {1,1,1}
                        };
        int solution[][]=new int [matrix.length][matrix.length];
        n.ratInMaze(matrix, solution, 0, 0);

// Time Complexity: O(2^(n^2)): The recursion can run upper bound 2^(n^2) times.
//  Space Complexity: O(n^2): Output matrix is required so an extra space of size n*n is needed.
        

    }
}
