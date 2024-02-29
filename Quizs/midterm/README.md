# MidTerm
Exam Questions:
## 1. Essay Question (max points 4). What is the difference between type and variable?
Type defines the nature of data like integer, string, object, Types are used to specify the kind of data a variable can hold. While a variable is a named storage location that holds a value of a particular type.

## 2. Essay Question (max points 4). What is the role of archetypes in Java development environment?
An archetype is a project templating toolkit.
An archetype is defined as an original pattern or model from which all other things of the same kind are made.
Archetype will help authors create Maven project templates for users and provides users with the means to generate parameterized versions of those project templates.

## 3. Essay Question (max points 4). What is the difference between instance variable and local variable?
Instance variables are attributes defined at the class level; they are unique to each object instance and can be accessed by all methods in the class.
Local variables are defined within methods and are only accessible within their declaring block, disappearing once the method completes.

## 4. Essay Question (max points 4). What is the difference between Array and ArrayList?
ArrayList allows flexibility by being able to both add and remove elements.
The ArrayList class is a resizable array
Adding or removing elements from the end of an ArrayList is generally faster than doing the same with an array.
Arrays have a slight performance advantage for indexed access and storage.

## 5. Essay Question (max points 4). How does “switch” statement work?
The switch statement allows for the selection of execution paths based on the value of a variable or expression. If a matching case is found, the code associated with that case executes until a break statement is encountered or the switch block ends. If no cases match, an optional default section executes.

## 6. Essay Question (max points 4). What is the difference between “for” and “while” loops?
For loop is ideal when the number of loops is known, integrating initialization, condition, and update in a single line, thus commonly used for iterating over arrays or fixed ranges.
For loops neatly encapsulate the loop control variables, making them concise for counting operations.

While loops are preferred when the iteration count is not predetermined, executing based on a condition that's evaluated before each loop iteration.
While loops offer flexibility, allowing for more dynamic conditions not necessarily tied to a counter. The choice between them often hinges on clarity and the specific requirements of the looping construct.

## 7. Interpretation Question (max points 4). What is the output of the following fragment of code and why? Please explain in greater detail.
  int x = 5;
  if (x < 5)
      x++;
      x -= 1;
  else
      x *= 3;
  if (x >= 5)
    x *= 2;
  System.out.println("x = " + x);

Output: Syntax error
explain: The error in the code is due to the misplaced else statement. In Java, an else must directly follow an if block or another else if block. The code did not use braces '{}' for the body of the if statement, only the first statement after the if is working. The subsequent line x -= 1; is outside of the if block, causing the else statement to be misplaced.

## 8. Interpretation Question (max points 4). What is the output of the following fragment of code and why? Please explain in greater detail.
  int x = 5;
  if (x < 5)
    x++;
    x -= 1;
  if (x >= 5)
    x *= 2;
  System.out.println("x = " + x);

Output: x = 4
explain: the only working code is 'x -= 1;' so the output is 'x = 4'

## 9. Programming Assignment (max points 8):
Develop a program that calculates the sum of all elements of a matrix. Use loops. For example, in case of matrix {{1,2,3}, {4,5,6}}, the output should be 21 which is 1+2+3+4+5+6.
Initiate any matrix of any size no less than 2 x 3 in your program and run the program. Do not use square matrices (with the same number of rows and columns).
Make a screenshot of the output.
Submit both the actual source code file with the program and matrix (the actual java file that can be copied and run) and the snapshot image file of the program output. Thus, submit two files - one the actual java file with the source code and another image file with the screenshot of the output.