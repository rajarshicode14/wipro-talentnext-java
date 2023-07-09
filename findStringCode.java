/* 

-FindStringCode-

Crazy Zak has designed the below steps which can be applied on any given string (sentence) to produce a number. 

STEP1. In each word, find the Sum of the Difference between the first letter and the last letter, second letter and the penultimate letter, and so on till the center of the word. 

STEP2. Concatenate the sums of each word to form the result.

For example-

If the given string is "WORLD WIDE WEB"

STEP1. In each word, find the Sum of the Difference between the first letter and the last letter, second letter and the penultimate letter, and so on till the center of the word. 

WORLD = [W-D] - [O-L] + [R] = [23-4] + [15-12] + [18] = [19] + [3] + [18] = [40] 
WIDE = [W-E] + [I-D] = [23-5] + [9-4] = [18] + [5] = [23]
WEB = [W-B] + [E] = [23-2] + [5] = [21] + [5] = [26]

STEP2. Concatenate the sums of each word to form the result

[40] [23] [26] 
[402326]

The answer (output) should be the number 402326.


NOTE1:The value of each letter is its position in the English alphabet system i.e. a=A=1, b-B-2 c=C=3, and so on till z=Z=26

So the result will be the same for "WORLD WIDE WEB" or "World Wide Web" or "world wide web" or any other
combination of uppercase and lowercase letters.

IMPORTANT Note: in Step1, after subtracting the alphabets we should use the absolute values for calculating the sum.
For instance in the below example both [H-O] and [E-L] result in negative number -7, but the positive number 7 (absolute value of -7) is used for calculating the sum of the differences.

Hello = [H-O] + [E-L] + [L] = [8-15] + [5-12] + [12] = [7] + [7] + [12] = [26]

Assumptions: The given string (sentence) will contain only alphabet characters and there will be only one space character between any two consecutive words

*/

class UserMainCode {

    public int findStringCode(String input1) {

        // Main code

        String arr[] = input1.split(" ");
        String result = "";

        for (String s : arr) {
            int n = s.length();
            s = s.toUpperCase();
            int i = 0;
            int sum = 0;

            while (i < n / 2) {
                sum = sum + Math.abs((int) s.charAt(i) - (int) s.charAt(n - i - 1));
                i++;
            }

            if (n % 2 != 0) {
                sum = sum + ((int) s.charAt(n / 2) - 64);
            }

            result = result + sum;
        }

        return Integer.parseInt(result);
    }
}
