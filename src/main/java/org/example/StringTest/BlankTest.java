package org.example.StringTest;

public class BlankTest {
    public static void main(String[] args) {
        String str = " "; // replace with your actual string variable

        if (str == null || str.isBlank()) {
            // String is either null or blank
            System.out.println("String is either null or blank");
        } else {
            // String is not null and not blank
            System.out.printf("String is not null and not blank");
        }

    }
}
