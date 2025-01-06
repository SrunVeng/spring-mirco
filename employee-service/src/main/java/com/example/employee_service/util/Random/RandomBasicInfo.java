package com.example.employee_service.util.Random;



import java.util.Random;

public class RandomBasicInfo {

    // Predefined list of first names, last names, and domains
    private static final String[] FIRST_NAMES = {"John", "Jane", "Michael", "Emily", "Chris", "Sarah", "David", "Laura", "Robert", "Alice"};
    private static final String[] LAST_NAMES = {"Smith", "Johnson", "Williams", "Brown", "Jones", "Miller", "Davis", "García", "Rodriguez", "Martinez"};
    private static final String[] EMAIL_DOMAINS = {"gmail.com", "yahoo.com", "outlook.com", "example.com"};

    private static final Random RANDOM = new Random();

    // Generate a random first name
    public static String generateRandomFirstName() {
        return FIRST_NAMES[RANDOM.nextInt(FIRST_NAMES.length)];
    }

    // Generate a random last name
    public static String generateRandomLastName() {
        return LAST_NAMES[RANDOM.nextInt(LAST_NAMES.length)];
    }

    // Generate a random email
    public static String generateRandomEmail() {
        String firstName = generateRandomFirstName().toLowerCase();
        String lastName = generateRandomLastName().toLowerCase();
        String domain = EMAIL_DOMAINS[RANDOM.nextInt(EMAIL_DOMAINS.length)];
        return firstName + "." + lastName + "@" + domain;
    }

}

