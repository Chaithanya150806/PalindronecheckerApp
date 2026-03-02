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

public class PalindronecheckerApp {
    public static void main(String[] args) {
        String input = "refer";

        // Create a Deque to store characters
        Deque<Character> deque = new ArrayDeque<>();

        // Add each character to the deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        // Flag to track palindrome result
        boolean isPalindrome = true;

        // Continue comparison while more than one element exists
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Output result
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
            }
        }


