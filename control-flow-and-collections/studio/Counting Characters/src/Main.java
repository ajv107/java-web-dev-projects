import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a quote ");
        String userQuote = input.nextLine();
    char[] charactersInString = userQuote.toLowerCase().toCharArray();
        HashMap<Character, Integer> quoteMap = new HashMap<>();
        for ( char i  : charactersInString)
        {
             if(Character.isLetter(i)){
                 if(quoteMap.containsKey(i)){
                     int quoteCounter = quoteMap.get(i) + 1;
                     quoteMap.put(i, quoteCounter);
                 } else{
                     quoteMap.put(i,1);
                 }
             }
        }

        for(Map.Entry<Character,Integer>entry:quoteMap.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}