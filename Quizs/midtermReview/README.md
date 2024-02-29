# MidTerm
Exam Questions:
## Essay Question 1 (max points 4). What is the difference between type and variable?
Type defines the nature of data (e.g., integer, string, object), Types are used to specify the kind of data a variable can hold. While a variable is a named storage location that holds a value of a particular type.

## Essay Question 2 (max points 4). What is the role of archetypes in Java development environment?
An archetype is a project templating toolkit.
An archetype is defined as an original pattern or model from which all other things of the same kind are made.
Archetype will help authors create Maven project templates for users and provides users with the means to generate parameterized versions of those project templates.

## Essay Question 3 (max points 4). What is the difference between instance variable and local variable?
Instance variables are attributes defined at the class level; they are unique to each object instance and can be accessed by all methods in the class.

Local variables are defined within methods and are only accessible within their declaring block, disappearing once the method completes.

## Essay Question 4 (max points 4). What is the difference between Array and ArrayList?

ArrayList allows flexibility by being able to both add and remove elements.
The ArrayList class is a resizable array
Adding or removing elements from the end of an ArrayList is generally faster than doing the same with an array.
Arrays have a slight performance advantage for indexed access and storage.

## Interpretation Question 5 (max points 4). What is the output of the following fragment of code and why? Please explain in greater detail.
                                   int x = 5;

                                   if (x < 5)

                                     x++;

                                     x -= 1;

                                   else

                                     x *= 3;

                                   if (x >= 5)

                                     x *= 2;

                                   System.out.println("x = " + x);

 

## Interpretation Question 6 (max points 4). What is the output of the following fragment of code and why? Please explain in greater detail.
                                  int x = 5;

                                  if (x < 5)

                                     x++;

                                     x -= 1;

                                  if (x >= 5)

                                     x *= 2;

                                  System.out.println("x = " + x);

## Programming Assignment 1 (max points 6):
Develop a program that calculates the sum of all elements of a matrix. Use loops. For example, in case of matrix {{1,2,3}, {4,5,6}}, the output should be 21 which is 1+2+3+4+5+6.
Initiate any matrix of any size no less than 2 x 3 in your program and run the program. Do not use square matrices (with the same number of rows and columns).

Make a screenshot of the output.
Submit both the actual source code file with the program and matrix (the actual java file that can be copied and run) and the snapshot image file of the program output. Thus, submit two files - one the actual java file with the source code and another image file with the screenshot of the output.