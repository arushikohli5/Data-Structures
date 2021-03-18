
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		HashMap<Character,Integer> hm=new HashMap<>();
		for(int i=0;i<str.length();i++){
		    hm.put(str.charAt(i),(hm.getOrDefault(str.charAt(i),0)+1));
		}
		
		for(int i=0;i<str.length();i++){
		    if(hm.get(str.charAt(i))!=0&&str.charAt(i)!=' '){
		        System.out.print(str.charAt(i));
		        int count=hm.get(str.charAt(i));
		        while(count-->0){
		            System.out.print("*");
		        }
		        //System.out.print(hm.get(str.charAt(i))+" ");
		        hm.put(str.charAt(i),0);
		    }
		}
	}
}
