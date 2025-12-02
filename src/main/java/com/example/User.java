package com.example;

/**
 * Represents a user in the system.
 * Contains user profile information and authentication data.
 */
public class User {
    private String username;
    private String email;
    private int age;
    
    /**
     * Creates a new user with username and password.
     * Password is hashed using SHA-256.
     * @param username the user's login name
     * @param password the user's password (will be hashed)
     */
    public User(String username, String email) {  // DRIFT: constructor changed, no password param
        this.username = username;
        this.email = email;
    }
    
    /**
     * Gets the user's ID.
     * @return the unique user identifier
     */
    // DRIFT: No getId() method exists!
    
    /**
     * Gets the username.
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * Alias for username to satisfy API expectations.
     * @return name
     */
    public String getName() {
        return username;
    }
    
    /**
     * Sets the username.
     * Must be alphanumeric and 3-20 characters.
     * @param username new username
     * @throws IllegalArgumentException if invalid
     */
    public void setUsername(String username) {  // DRIFT: No validation in actual code
        this.username = username;
    }
    
    /**
     * Gets the user's email address.
     * @return email
     */
    public String getEmail() {
        return email;
    }
    
    /**
     * Returns the user's age in years.
     * @return age
     */
    public int getAge() {
        return age;
    }
    
    /**
     * Updates the user's profile picture.
     * Validates image format and size.
     * @param imageUrl URL to the new profile picture
     * @param format image format (jpg, png, gif)
     * @return true if successful
     */
    // DRIFT: This method was never implemented!
    
    /**
     * Validates if the user account is active.
     * Checks last login time and subscription status.
     * @return true if account is active
     */
    public boolean isActive() {  // DRIFT: Only checks if username is not null
        return username != null;
    }
}
