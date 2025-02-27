# Crivo (Prime Number Finder)

This repository contains a Java program that implements a simple algorithm to find prime numbers within a specified range using the sieve method. The program checks each number from 1 to 100 and prints the prime numbers.

## About the Project

This project was developed as part of my studies in the "Systems Analysis and Development" course. The main objective was to implement an algorithm that finds prime numbers in a given range and print them.

The program uses basic loops and conditional statements to check whether each number is prime by counting the number of divisors. If a number has exactly two divisors (1 and itself), it is considered prime.

## How It Works

1. The program initializes an array of numbers from 1 to 100.
2. It then checks each number and counts how many numbers can divide it evenly.
3. If the number has exactly two divisors, it is considered prime and printed.

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/Crivo.git
   ```

2. Navigate to the project directory:
   ```bash
   cd Crivo
   ```

3. Compile the Java program:
   ```bash
   javac Crivo.java
   ```

4. Run the program:
   ```bash
   java Crivo
   ```

## Author

**Daniel Tavares dos Anjos**  
GitHub: [danieltanjos](https://github.com/danieltanjos)
