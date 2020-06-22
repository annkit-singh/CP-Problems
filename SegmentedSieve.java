package MonConnect;

import java.util.Arrays;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class SegmentedSieve {
	
	static int MAX=10000;
	
	public   static Vector<Integer> SegmentedSiev() {
		Boolean isPrime[]=new Boolean[MAX+1];
		Arrays.fill(isPrime,true);
		for(int i=2;i*i<=MAX;i++) {
			if(isPrime[i]) {
				for(int j=i*i;j<MAX;j=j+i) {
					isPrime[j]=false;
				}
			}
		}
		isPrime[0]=isPrime[1]=false;
			Vector<Integer> primes =new Vector<Integer>();
			for(int i=0;i<=MAX;i++) {
				if(isPrime[i]) 
					primes.add(i);
					
			}
			return primes;
			
	}
	public  static void  printPrimes(int left,int right,Vector<Integer> v) {
		Boolean arrPrime[]=new Boolean[right-left+1];
		Arrays.fill(arrPrime, true);
		
		for(int i=0;v.get(i)*v.get(i)<=right;i++) {
			int currPrime=v.get(i);
			int base=(left/currPrime)*currPrime;
			if(base<left) {
				base=base+currPrime;
			}
			
			for(int j=base;j<=right;j+=currPrime) {
				arrPrime[j-left]=false;
			}
			if(base==currPrime) {
				arrPrime[base-left]=true;
			}
		}
			
			for(int i=0;i<(right-left);i++) {
				if(arrPrime[i]==true) {
					System.out.print(left+i+" ");
				}
			}
			
			
		}
	
	public static void segmentedSieve(int left,int right) {
		printPrimes(left, right, SegmentedSiev());
	}
		
		
	
			
			
	
	
	
					
	

	public static void main(String[] args) {
		segmentedSieve(20,40);
	

	}

}
