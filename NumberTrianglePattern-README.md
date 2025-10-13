# Number Triangle Pattern Assignment

## Assignment Overview

**Objective**: Design and implement a Java application that reads a positive integer n from the user and prints a number triangle pattern with n rows.

**Topics**: Nested Loops, Pattern Generation, Console Output Formatting  

## Problem Statement

Write a Java program that:

1. **Prompts the user** to enter a positive integer
2. **Reads the input** as an integer
3. **Generates a triangle pattern** where each row i contains numbers from 1 to i
4. **Formats the output** with spaces between numbers
5. **Handles any positive integer** input

---

## Requirements

### Step 1: User Input
- Prompt the user with: `"Enter a positive integer: "`
- Use `Scanner` to read the integer
- Store the input in an int variable

### Step 2: Pattern Generation
- **Use nested loops** to generate the triangle
- **Outer loop** controls the number of rows (1 to n)
- **Inner loop** controls the numbers in each row (1 to current row)
- **Print numbers** with spaces between them

### Step 3: Output Formatting
- **Each row** should contain numbers from 1 to the row number
- **Numbers** should be separated by single spaces
- **Each row** should be on its own line
- **No trailing spaces** at the end of each row

---

## Examples & Test Cases

### Example 1: Input = 1
```
Enter a positive integer: 
1
```

### Example 2: Input = 2
```
Enter a positive integer: 
1
1 2
```

### Example 3: Input = 3
```
Enter a positive integer: 
1
1 2
1 2 3
```

### Example 4: Input = 4
```
Enter a positive integer: 
1
1 2
1 2 3
1 2 3 4
```

### Example 5: Input = 5
```
Enter a positive integer: 
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
```

### Example 6: Input = 6
```
Enter a positive integer: 
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
1 2 3 4 5 6
```

