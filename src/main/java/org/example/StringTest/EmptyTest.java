package org.example.StringTest;

public class EmptyTest {
    public static void main(String[] args) {
        String str = " "; // replace with your actual string variable

        if (str == null || str.isEmpty()) {
            // String is either null or empty
            System.out.println("String is either null or empty");
        } else {
            // String is not null and not empty
            System.out.printf("String is not null and not empty");
        }

    }
}
