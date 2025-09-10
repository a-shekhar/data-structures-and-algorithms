import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);    // uses default charset
        String line = sc.nextLine();      
        String[] words = line.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for(String word : words){
            word = word.toLowerCase();
            if(map.containsKey(word)){
                map.put(word, map.get(word) + 1);
            }else{
                map.put(word, 1);
            }
        }
        
        List<String> keys = new ArrayList<>(map.keySet());
        Collections.sort(keys);
        
        for(String key : keys){
            System.out.println(key + ": " + map.get(key));
        }
	}
}
