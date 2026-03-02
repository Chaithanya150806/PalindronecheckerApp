/*
 This class represents the entry point of the palindrome checker management system.
 The goal is to establish a clear startup flow
 This is the first method executed by the JVM
 */

import java.util.Scanner;
import java.util.Stack;
import java.util.*;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class PalindronecheckerApp {
    public static void main(String[] args) {

        String input = "Level";

        // Convert to lowercase to make it case-insensitive
        input = input.toLowerCase();

        // Create a LinkedList to store characters
        LinkedList<Character> list = new LinkedList<>();

        // Add each character to the linked list
        for (char c : input.toCharArray()) {
            list.add(c);
        }

        // Flag to track palindrome state
        boolean isPalindrome = true;

        // Compare until only one or zero elements remain
        while (list.size() > 1) {
            char first = list.removeFirst();
            char last = list.removeLast();

            if (first != last) {
                isPalindrome = false;
                break;
            }
        }

        // Output
        System.out.println("Input : " + input.substring(0,1).toUpperCase() + input.substring(1));
        System.out.println("Is Palindrome? : " + isPalindrome);
            }
        }


