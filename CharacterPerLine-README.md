# Character Per Line Assignment

## Assignment Overview

**Objective**: Design and implement a Java application that reads a string from the user and prints each character on a separate line.

**Topics**: String Manipulation, Loops, Character Access  

---

## Problem Statement

Write a Java program that:

1. **Prompts the user** to enter a word
2. **Reads the input** as a string
3. **Prints each character** on its own line
4. **Handles any length** of input string

---

## Requirements

### Step 1: User Input
- Prompt the user with: `"Enter a word: "`
- Use `Scanner` to read the entire string
- Store the input in a String variable

### Step 2: Character Processing
- **Use a loop** to iterate through each character
- **Access each character** using some sort of String method
- **Print each character** on a separate line 

### Step 3: Loop Structure
- **Start at index 0**
- **Continue until** you reach the end of the string
- **Increment index** by 1 each iteration

---

## Examples & Test Cases

### Example 1: Input = "hello"
```
Enter a word: hello
h
e
l
l
o
```

### Example 2: Input = "java"
```
Enter a word: java
j
a
v
a
```

### Example 3: Input = "a"
```
Enter a word: a
a
```

### Example 4: Input = "programming"
```
Enter a word: programming
p
r
o
g
r
a
m
m
i
n
g
```

### Example 5: Input = "computer"
```
Enter a word: computer
c
o
m
p
u
t
e
r
```

