# PalindromeCheckerApp

# Use Case 1 for palindrome Checker app executed
# A welcome and initialization message are printed
# Version and the author details are printed as well
---
# Use Case 2 for palindrome Checker app executed
# A welcome and initilization mesg, along with version and author details printed in UC1
# Demonstrated basic palindrome validation using a hardcoded string value
# Compares characters from both ends using for and if loops
# Displayed the result on the console
=======

# UC3- PalindromeReverse executed
# Displays the welcome and initialization message along with version and author details.
# Accepts a string input from the user via console.
# Reverses the string using a for loop.
# Builds the reversed string using String concatenation 
# Compares the original and reversed strings using the equals() method.
# Displays the palindrome validation result on the console.
======= 

# Use Case 4 for Palindrome Checker App Executed
# Displays a welcome and initialization message.
# Prints application version and author details.
# Accepts string input from the user via console.
# Converts the input string into a character array (char[]).
# Implements the two-pointer technique to compare characters from the beginning and end.
# Avoids creating additional String objects, improving efficiency.
# Displays the palindrome validation result on the console.
======

# UC5-StackPalindromeChecke for Palindrome Checker App Executed
# Displays a welcome and initialization message.
# Prints application version and author details.
# Accepts string input from the user via console.
# Uses a Stack data structure (LIFO principle).
# Pushes each character of the string into the stack.
# Pops characters from the stack to naturally reverse the string.
# Compares the original string with the reversed string using equals().
# Displays the palindrome validation result on the console.
=======

# UC6-Stack+QueueBasedPalindromeCheck for Palindrome Checker App Executed
# Displays a welcome and initialization message.
# Prints application version and author details.
# Accepts string input from the user via console.
# Uses a Queue (FIFO) and Stack (LIFO) to store characters.
# Enqueues characters into the queue.
# Pushes characters onto the stack.
# Compares dequeue (queue) output with pop (stack) output.
# Displays the palindrome validation result on the console.
=======

# UC7-Deque-BasedOptimizedPalindromeChecker for Palindrome Checker App Executed
# Displays a welcome and initialization message.
# Prints application version and author details.
# Accepts string input from the user via console.
# Uses a Deque (Double-Ended Queue) to store characters.
# Inserts characters into the deque from the rear.
# Removes and compares front and rear characters.
# Continues comparison until the deque is empty or mismatch is found.
# Displays the palindrome validation result on the console.
# Optimizes data handling by eliminating the need for separate reversal structures.
=======

# UC8-LinkedListPalindromeChecker for Palindrome Checker App Executed
# Displays a welcome and initialization message.
# Prints application version and author details.
# Accepts string input from the user via console.
# Converts the string into a singly linked list.
# Uses fast and slow pointer technique to find the middle of the list.
# Reverses the second half of the linked list in-place.
# Compares the first and second halves node by node.
# Restores the original linked list structure after comparison.
# Displays the palindrome validation result on the console.
# Optimizes memory by performing reversal in-place without extra data structures.
=======

# UC9-RecursivePalindromChecker for Palindrome Checker App Executed
# Displays a welcome and initialization message.
# Prints application version and author details.
# Accepts string input from the user via console.
# Uses recursion to check whether the string is a palindrome.
# Compares characters from start and end in each recursive call.
# Stops recursion when the start index meets or crosses the end index (base condition).
# Uses the call stack to manage recursive method calls.
# Displays the palindrome validation result on the console.
=======

# UC10-Case-InsensitiveSpace-IgnoredPalindrome for Palindrome Checker App Executed
# Displays a welcome and initialization message.
# Prints application version and author details.
# Accepts string input from the user via console.
# Normalizes the input string by removing spaces and converting to lowercase.
# Reverses the normalized string using a loop.
# Compares the normalized string with its reversed version.
# Displays the palindrome validation result on the console.
# Handles case-insensitivity and ignores spaces for accurate palindrome checking.
=======

# UC11-OODPPalindromeService for Palindrome Checker App Executed
# Displays a welcome and initialization message.
# Prints application version and author details.
# Accepts string input from the user via console.
# Encapsulates palindrome checking logic inside a PalindromeChecker class.
# Exposes a single method checkPalindrome() to check if a string is a palindrome.
# Uses Stack internally for reversal and comparison.
# Demonstrates OOP concepts:
# Encapsulation – keeps data and behavior within the class.
# Single Responsibility Principle – Palindrome logic is separated from main program.
# Displays the palindrome validation result on the console.
======

# UC12-StrategyPatternPalindromeAlgorithm for Palindrome Checker App Executed
# Displays a welcome and initialization message.
# Prints application version and author details.
# Accepts string input from the user via console.
# Implements Strategy Pattern to choose palindrome algorithm dynamically.
# Defines a PalindromeStrategy interface.
# Implements concrete strategies like StackStrategy and DequeStrategy.
# Allows polymorphic behavior by injecting strategy at runtime.
# Executes the selected strategy to check if the string is a palindrome.
# Displays the palindrome validation result on the console.
# Demonstrates OOP concepts:
#   Interface
#   Polymorphism
#   Strategy Pattern
======