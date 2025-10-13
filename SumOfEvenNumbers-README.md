# Sum of Even Numbers Assignment

## Assignment Overview

**Objective**: Design and implement a Java application that calculates the sum of all even integers between 2 and a user-provided input value (inclusive), with proper input validation.
**Topics**: Conditionals, Loops, Input Validation, Error Handling  

---

## Problem Statement

Write a Java program that:

1. **Prompts the user** to enter an integer value
2. **Validates the input** - must be 2 or greater
3. **Calculates the sum** of all even numbers from 2 to the input value (inclusive)
4. **Displays the result** in a clear, formatted message
5. **Handles errors** gracefully with appropriate error messages

---

## Requirements

### Step 1: User Input
- Prompt the user with: `"Enter an integer value: "`
- Use `Scanner` to read the integer input
- Store the input in a variable

### Step 2: Input Validation
- **Check if input is less than 2**
- If invalid, display: `"Error: Input must be 2 or greater."`
- **Exit the program** after showing the error
- If valid, proceed to calculation

### Step 3: Sum Calculation
- **Use a loop** to iterate through even numbers
- **Start at 2**, increment by 2 each iteration
- **Continue until** you reach the input value (inclusive)
- **Accumulate the sum** in a variable

### Step 4: Output Format
- Display result as: `"The sum of even numbers between 2 and X is Y."`
- Where X is the input value and Y is the calculated sum

---

## Examples & Test Cases

### Example 1: Input = 8
```
Enter an integer value: 8
The sum of even numbers between 2 and 8 is 20.
```
**Explanation**: Even numbers from 2 to 8 are: 2, 4, 6, 8  
**Calculation**: 2 + 4 + 6 + 8 = 20

### Example 2: Input = 5
```
Enter an integer value: 5
The sum of even numbers between 2 and 5 is 6.
```
**Explanation**: Even numbers from 2 to 5 are: 2, 4  
**Calculation**: 2 + 4 = 6

### Example 3: Input = 1 (Error Case)
```
Enter an integer value: 1
Error: Input must be 2 or greater.
```

### Example 4: Input = 10
```
Enter an integer value: 10
The sum of even numbers between 2 and 10 is 30.
```
**Explanation**: Even numbers from 2 to 10 are: 2, 4, 6, 8, 10  
**Calculation**: 2 + 4 + 6 + 8 + 10 = 30

### Example 5: Input = 12
```
Enter an integer value: 12
The sum of even numbers between 2 and 12 is 42.
```
**Explanation**: Even numbers from 2 to 12 are: 2, 4, 6, 8, 10, 12  
**Calculation**: 2 + 4 + 6 + 8 + 10 + 12 = 42

---

## Implementation Guide

### Algorithm Steps:
1. **Initialize Scanner** for user input
2. **Prompt and read** integer value
3. **Validate input** (must be ≥ 2)
4. **Initialize sum variable** to 0
5. **Loop from 2 to input** (increment by 2)
6. **Add each even number** to sum
7. **Display result** in specified format
8. **Close Scanner**

## Testing Your Solution

### Manual Testing
Test your program with these inputs:
- **2** → Should output: "The sum of even numbers between 2 and 2 is 2."
- **3** → Should output: "The sum of even numbers between 2 and 3 is 2."
- **4** → Should output: "The sum of even numbers between 2 and 4 is 6."
- **5** → Should output: "The sum of even numbers between 2 and 5 is 6."
- **6** → Should output: "The sum of even numbers between 2 and 6 is 12."
- **8** → Should output: "The sum of even numbers between 2 and 8 is 20."
- **10** → Should output: "The sum of even numbers between 2 and 10 is 30."
- **1** → Should output: "Error: Input must be 2 or greater."
- **0** → Should output: "Error: Input must be 2 or greater."
- **-5** → Should output: "Error: Input must be 2 or greater."



