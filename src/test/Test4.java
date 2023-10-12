package test;
//Need to find first non repeating vowel
import java.util.ArrayList;
import java.util.List;

public class Test4 {

    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        List<Character> chr = new ArrayList<>();
        chr.add('a');
        chr.add('e');
        chr.add('i');
        chr.add('o');
        chr.add('u');
        String str = "cbcaabeeidnf";
        char[] characters= str.toCharArray();
        for(int i=0;i<characters.length;i++) {
            if(chr.contains(characters[i]) && characters[i] != (characters[i+1])) {

                System.out.println(characters[i]);
                break;
            }
        }
    }
}
