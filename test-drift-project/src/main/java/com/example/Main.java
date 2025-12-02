package com.example;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int sum = calc.add(2, 3);
        String joined = StringUtils.join("Hello", "World");

        System.out.println("Sum: " + sum);
        System.out.println("Joined: " + joined);

        User user = new User("alice", "alice@example.com");
        System.out.println("User: " + user.getName() + ", age " + user.getAge());
    }
}
