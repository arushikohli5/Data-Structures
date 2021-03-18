import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int a[]=new int[n];
		
		for(int i=0;i<n;i++){
		    a[i]=s.nextInt();
		}
		
		calculate(a,n);
	}
	
	public static void calculate(int a[],int n){
	    int dp[]=new int [n+1];
	    dp[0]=1;
	    
	    for(int i=1;i<n;i++){
	        dp[i]=1;
	        for(int j=0;j<i;j++){
	            if(a[i]>a[j]&&dp[i]<=dp[j]){
	                dp[i]=dp[j]+1;
	            }
	        }
	    }
	    int max=0,index=0;
	    for(int i=0;i<n;i++){
	        if(dp[i]>max){
	            max=dp[i];
	            index=i;
	        }
	    }
	    
	    int lis[]=new int[max];
	    int max1=max,x=0;
	    for(int i=index;i>=0;i--){
	        if(dp[i]==max){
	            lis[x++]=a[i];
	            max--;
	        }
	    }
	    System.out.println("max: "+max1);
	    for(int i=0;i<lis.length;i++){
	        System.out.print(lis[i]+" ");
	    }
	}
}
