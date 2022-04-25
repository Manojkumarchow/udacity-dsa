class Solution {
    public String interpret(String command) {
        String result = "";
        for (int i=0;i<command.length();i++) {
            if (command.charAt(i) == 'G') {
                result += String.valueOf("G");
            } else if (command.charAt(i) == '(' && command.charAt(i+1) == ')') {
                result += String.valueOf("o");
            } else if (command.charAt(i) == '(' && command.charAt(i+1) == 'a'
                      && command.charAt(i+2) == 'l') {
                result += String.valueOf("al");
            }
        }
        return result;
    }
}