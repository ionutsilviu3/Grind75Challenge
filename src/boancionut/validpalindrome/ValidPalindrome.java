package boancionut.validpalindrome;

public class ValidPalindrome {
    private static boolean isPalindrome(String s)       // solving this problem through the 2 pointer way
    {
        char[] charArray = s.toCharArray();     // converting the string into a char array
        for (int i = 0, j = charArray.length - 1; i < j; ) {
            if (!Character.isLetterOrDigit(charArray[i]))   // if the left element is a space or a symbol increment i
                i++;
            else if (!Character.isLetterOrDigit(charArray[j]))  // if the right element is a space or a symbol increment j
                j--;
            else if (Character.toLowerCase(charArray[i++]) != Character.toLowerCase(charArray[j--]))
                return false;           // if the left element is not the same as the right element, then it's not a palindrome
        }
        return true;
    }

    public static void main(String[] args) {
        String possiblePalindrome = "radar";
        System.out.println("Is it true that the word \"" + possiblePalindrome + "\" a palindrome ?");
        System.out.println(isPalindrome(possiblePalindrome));
    }
}
