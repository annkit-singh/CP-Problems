

class ShortPath{

	public int shortestPath(int array[][],int s1,int s2,int d1,int d2){
		
		int rows=array.length;
		int cols=array[0].length;
		boolean [] []vis=new boolean[rows][cols];

		return shortPath(array,s1,s2,d1,d2,vis);

	}
	public boolean isValid(int array[][],int s1,int s2,boolean vis[][]){
		
		return (s1>=0   && s2>=0 && s2<array[0].length  && s1<array.length && array[s1][s2]==1 && !vis[s1][s2]);
			}
	public int shortPath(int array[][],int s1,int s2,int d1,int d2,boolean vis[][]){
		if(!isValid(array, s1, s2, vis)) return 1000000;
		if(s1==d1 && s2==d2) return 0;

		vis[s1][s2]=true;
		int left=shortPath(array, s1, s2-1, d1, d2, vis) +1;
		int right=shortPath(array, s1, s2+1, d1, d2, vis)+1;
		int up=shortPath(array, s1-1, s2, d1, d2, vis)+1;
		int down=shortPath(array, s1+1, s2, d1, d2, vis) +1;
		vis[s1][s2]=false;


		return Math.min(Math.min(left,right), Math.min(up,down));

	}

	
	public static void main (String[] args){
		ShortPath sp=new ShortPath();
		int arr[][]={
			{1,1,1,1,1,0,0,1,1,1},
			{0,1,1,1,1,1,0,1,0,1},
			{0,0,1,0,1,1,1,0,0,1},
			{1,0,1,1,1,0,1,1,0,1},
			{0,0,0,1,0,0,0,1,0,1},
			{1,0,1,1,1,0,0,1,1,0},
			{0,0,0,0,1,0,0,1,0,1},
			{0,1,1,1,1,1,1,1,0,0},
			{1,1,1,1,1,0,0,1,1,1},
			{0,0,1,0,0,1,1,0,0,1}
		};
		System.out.println(
		sp.shortestPath(arr, 0, 0, 8, 0));


	}
}