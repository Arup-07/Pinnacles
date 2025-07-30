#Task 1
Password Analyzer
A simple Java console application that analyzes the strength of a user-entered password and categorizes it as Invalid, Weak, Moderate, or Strong based on several criteria.

Features
-Validates password length (minimum 8 characters).
-Checks for the presence of:
   Uppercase letters
   Lowercase letters
   Digits
   Special characters
-Detects common, easily guessable passwords.
-Classifies password strength into four categories:
  Invalid Password
  Weak Password
  Moderate Password
  Strong Password

Password Strength Criteria
Strength	Conditions-Invalid	Less than 8 characters or missing any required character type (uppercase, lowercase, digit, special)
Weak	Password is common/guessable, or length is between 8 and 11, or any character type count is 1
Moderate	Valid password that doesn’t meet strong password criteria
Strong	Length >= 12 and at least 2 uppercase, 2 lowercase, 2 digits, and 2 special characters

How to Use
1.Clone or download the repository.
2.Compile the program:
    javac PasswordAnalyzer.java
3.Run the program:
    java PasswordAnalyzer
4.Enter your password when prompted. The program will output the password strength.

Requirements
-Java Development Kit (JDK) 8 or higher.
-Terminal or command prompt to compile and run Java programs.
