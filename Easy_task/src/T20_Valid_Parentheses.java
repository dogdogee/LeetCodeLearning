
// Time Complexity: O(n^2)
// Space Complexity: O(n)
//runtime: 40ms :_(


public class T20_Valid_Parentheses {
    public static void main(String[] args) {
    System.out.println(isValid("()"));
    System.out.println(isValid("()[]{}"));
    System.out.println(isValid("(]"));
    }


        public static boolean isValid(String s) {
            while (s.contains("{}") || s.contains("()") || s.contains("[]")) {
            s = s.replace("{}", "");
            s = s.replace("()", "");
            s = s.replace("[]", "");
            }
            return s.isEmpty();
            }
}
   
    


//runtime: 2ms 
//
//class Solution {
//     public boolean isValid(String s) {
//         Stack<Character> stack = new Stack<>();
        
//         for (char c : s.toCharArray()) {
//             if (c == '(' || c == '{' || c == '[') {
//                 stack.push(c);
//             } else {
//                 if (stack.isEmpty()) {
//                     return false;
//                 }
//                 char top = stack.pop();
//                 if ((c == ')' && top != '(') ||
//                     (c == '}' && top != '{') ||
//                     (c == ']' && top != '[')) {
//                     return false;
//                 }
//             }
//         }
        
//         return stack.isEmpty();
//     }
// }