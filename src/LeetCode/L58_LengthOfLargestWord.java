package LeetCode;

import java.util.LinkedList;

public class L58_LengthOfLargestWord {
    LinkedList<String> list = new LinkedList<>();
    String word = "";
    public void allWords(String string, int i){
        if (string.length() == i){
            if (word.length()>0){
                list.add(word);
            }
            return;
        }
        if (string.charAt(i) == ' '){
            if (word.length() > 0){
                list.add(word);
                word = "";
            }
            allWords(string,++i);
            return;
        }

        word = word + string.charAt(i);
        allWords(string,++i);
    }


    public int lengthOfLastWord(String s) {
        allWords(s, 0);
        return list.get(list.size()-1).length();
    }
}
