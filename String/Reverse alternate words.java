
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		
		String str1=reverse(str);
		
		String ans="";
		
		String words[]=str1.split(" ");
		for(int i=0;i<words.length;i++){
		    if(i%2!=0){
		        ans=ans+reverse(words[i])+" ";
		    }
		    else{
		        ans=ans+words[i]+" ";
		    }
		}
		System.out.println(ans);
	}
	
	public static String reverse(String str){
	    return (new StringBuilder(str).reverse().toString());
	}
}
