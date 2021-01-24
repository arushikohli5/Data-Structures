import java.util.*;
import java.util.LinkedList;
public class word_ladder {
    public static void main(String args[]){
        Set<String> d=new HashSet<String>();

        d.add("poon");
        d.add("plee");
        d.add("same");
        d.add("poie");
        d.add("plie");
        d.add("poin");
        d.add("plea");

        String  start="toon";
        String end="plea";

        int m=calc(start,end,d);
        System.out.println(m);
    }

    public static int calc(String start,String end,Set<String> d){
        if(!d.contains(end)){
            return 0;
        }

        Queue<String> q=new LinkedList<String>();

        int level=0,len=start.length();

        q.add(start);

        while(!q.isEmpty()){
            //int size=q.size();

            for(int k=0;k<q.size();k++){
                ++level;

                char []word=q.peek().toCharArray();
                q.remove();
                
                for(int pos=0;pos<len;pos++){
                    char first=word[pos];
                    for(char c='a';c<='z';c++){
                        word[pos]=c;

                        if(String.valueOf(word).equals(end)){
                            return level+1;
                        }
                        if(!d.contains(String.valueOf(word))){
                            continue;
                        }

                        d.remove(String.valueOf(word));
                        q.add(String.valueOf(word));

                    }

                    word[pos]=first;
                }

            }
        }
        return 0;
    }
}
