package day19_array;

import java.util.Arrays;

public class Alphabets {
    public static void main(String[] args) {

        char[] ascending = new char[26];
        char[] descending = new char[26];

        for (int i = 0, j = 'A', k = 'Z'; i < ascending.length; i++, j++, k--) {
            ascending[i] = (char) j; // A - Z
            descending[i] = (char) k; // Z - A
        }

        System.out.println("ascending = " + Arrays.toString(ascending));
        System.out.println("descending = " + Arrays.toString(descending));

        System.out.println("================================================================");

        char[] characters = new char[65535];

        for (int i = 0; i < characters.length; i++) {
            characters[i] = (char) i;
        }

        System.out.println("characters = " + Arrays.toString(characters));
    }
}
/*
    3. Create a char array and store all the alphabet letters in ascending order

	4. Create a char array and store all the alphabet letters in descending order

 */