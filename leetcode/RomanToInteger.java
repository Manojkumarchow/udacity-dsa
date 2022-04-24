class Solution {
    public int romanToInt(String s) {
        int sum = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            try {
                if (s.charAt(i) == 'I') {
                    sum += 1;
                } else if (s.charAt(i) == 'M') {
                    if (s.charAt(i - 1) == 'C') {
                        sum += 900;
                        i--;
                    } else
                        sum += 1000;
                } else if (s.charAt(i) == 'V') {
                    if (s.charAt(i - 1) == 'I') {
                        sum += 4;
                        i--;
                    } else
                        sum += 5;
                } else if (s.charAt(i) == 'X') {
                    if (s.charAt(i - 1) == 'I') {
                        sum += 9;
                        i--;
                    } else
                        sum += 10;
                } else if (s.charAt(i) == 'L') {
                    if (s.charAt(i - 1) == 'X') {
                        sum += 40;
                        i--;
                    } else
                        sum += 50;
                } else if (s.charAt(i) == 'C') {
                    if (s.charAt(i - 1) == 'X') {
                        sum += 90;
                        i--;
                    } else
                        sum += 100;
                } else if (s.charAt(i) == 'D') {
                    if (s.charAt(i - 1) == 'C') {
                        sum += 400;
                        i--;
                    } else
                        sum += 500;
                }
                // System.out.println("Sum: " + sum);
            } catch (Exception e) {
                if (s.charAt(i) == 'I')
                    sum += 1;
                else if (s.charAt(i) == 'V')
                    sum += 5;
                else if (s.charAt(i) == 'X')
                    sum += 10;
                else if (s.charAt(i) == 'L')
                    sum += 50;
                else if (s.charAt(i) == 'C')
                    sum += 100;
                else if (s.charAt(i) == 'D')
                    sum += 500;
                else if (s.charAt(i) == 'M')
                    sum += 1000;
            }
        }
        return sum;
    }
}


class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        s = s.replace("IV", "IIII");
        s = s.replace("IX","VIIII");
        s = s.replace("XL","XXXX");
        s = s.replace("XC","LXXXX");
        s = s.replace("CD","CCCC");
        s = s.replace("CM","DCCCC");
        for (int i = 0; i < s.length(); i++) {
            char m = s.charAt(i);
            switch (m) {
                case 'I':
                    sum += 1;break;
                case 'V':
                    sum += 5;break;
                case 'X':
                    sum += 10;break;
                case 'L':
                    sum += 50;break;
                case 'C':
                    sum += 100;break;
                case 'D':
                    sum += 500;break;
                case 'M':
                    sum += 1000;break;
            }
        }
        return sum;
    }
}