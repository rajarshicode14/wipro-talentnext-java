/*
How to Attempt?

Get Code Through Strings- 1: Farah is one of the few associates in Global Safe Lockers Corp Limited, who has access to the company's exclusive locker that holds confidential information related to her division. The PIN to the locker gets changed every two days. Farah receives the PIN in the form of a string which she needs to decode to get the single-digit numeric PIN.

The numeric PIN can be obtained by adding the lengths of each word of the string to get the total length, and then continuously adding the digits of the total length till we get a single digit.

For example, if the string is "Wipro Technologies", the numeric PIN will be 8.

Explanation

Length of the word "Wipro" = 5
Length of the word "Technologies" = 12

Let us add all the lengths to get the Total Length 5+ 12 = 17

The Total Length 17, which is not a single-digit, so now let us continuously add all digits till we get a single digit ie, 1+7=8 = Therefore, the single-digit numeric PIN = 8

Farah approaches you to write a program that would generate the single-digit numeric PIN if the string is input into the program. Help Farah by writing the function (method) that takes as input a string input1 that represents the sentence, and returns the single-digit numeric PIN.

Assumptions: For this assignment, let us assume that the given string will always contain more than one word.

Let's see one more example-

        • If the given string is "The Good The Bad and The Ugly", the numeric PIN would be = 5

Explanation:

Let us add lengths of all words to get the Total Length = 3+4+3+3+3+3+4 = 23 
Total Length 23, which is not yet a single digit, so let us continue adding all digits of the Total Length, ie. 2-3=5
Therefore, single-digit numeric PIN = 5

*/

class UserMainCode {
    public int getCodethroughStrings(String input1) {

        // Main code

        String str[] = input1.split(" ");

        int len = 0;

        for (String s : str) {
            len = len + s.length();
        }

        if (len % 9 == 0) {
            return 9;
        }

        return len % 9;
    }
}