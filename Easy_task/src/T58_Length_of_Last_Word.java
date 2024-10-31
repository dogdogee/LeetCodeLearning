//time complexity: O(n)
//space complexity: O(1)
//Given a string s consists of some words separated by spaces, return the length of the last word in the string. If the last word does not exist, return 0.
//31-10-2024



public class T58_Length_of_Last_Word {
    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("a"));
    }
    public static int lengthOfLastWord(String s) {
        int index = s.length()-1;
        int length = 0;
        while(index>=0 && s.charAt(index)==' '){
            index--;
        }
        while(index>=0 &&s.charAt(index)!=' '){
            length++;
            index--;
        }
        
        return length;
    }
    
}
