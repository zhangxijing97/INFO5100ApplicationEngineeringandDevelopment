# Final exam (Essay Questions and Interpretation Question)

1) Essay Question 1 (max points 4). What specifics do the following class modifiers “public”, “private”, “protected”, and “static” imply? Explain and provide simple examples.
public: Allows unrestricted access to the class, method, or field from any other class.
private: Restricts access to only within the same class, hiding implementation details.
protected: Allows access within the same package or by subclasses in different packages.
static: Indicates that the method or field belongs to the class itself, rather than instances of the class.

2) Essay Question 2 (max points 4). Describe derived classes in Java, their properties and usage. Provide a simple example.
Derived classes in Java inherit properties and behaviors from a parent class. They extend the functionality of the parent class by adding new features or modifying existing ones. It will be useful when you don't want to write similar code lots of times.

3) Essay Question 3 (max points 4). What is the role of abstract classes and why are they needed? Provide a simple example.
Abstract classes in Java cannot be instantiated and are meant to be extended by subclasses. They may contain abstract methods (methods without implementation) that must be overridden by concrete subclasses.

4) Essay Question 4 (max points 4). What does class modifier “final” do and why is it needed? Provide a simple example.
The final modifier in Java prevents a class from being subclassed, meaning it cannot have any subclasses. it's useful when you don't want any subclasses in your program.

5) Essay Question 5 (max points 4). What is method overload, how does it work, and why is it needed? Provide a simple example.
Method overloading in Java allows a class to have multiple methods with the same name but different parameters. This provides flexibility in method usage and simplifies method naming. if two methods, the first one has one parameter, the second has two parameters, it will not cause an error even if they have the same name.

6) Essay Question 6 (max points 4). What is the difference between “while” and “do … while” loops? Provide simple examples.
while loop checks the loop condition before executing the loop body. It may not execute at all if the condition is false initially.
do ... while loop executes the loop body at least once before checking the loop condition. we can use it if we want the code to run at least 1 time.

7) Essay Question 7 (max points 4). What is SDLC, what are its main stages, and why is it needed? Provide simple examples.
SDLC is a systematic approach to software development that defines phases (such as planning, analysis, design, implementation, testing, deployment, and maintenance) to ensure efficient and high-quality software delivery. It will be a very useful way to make use of the process of developing an application is effective.

8) Interpretation Question 8 (max points 4). Why does the indicated line of code cause an error?
private means Restricting access to only within the same class, hiding implementation details. class Main is outside of the class TestClass, so causes an error.

9) Programming Assignment 1 (max points 8):
Open the Notepad application on your computer and write a plain text “Initial string” in the Notepad. Save the Notepad on the desktop of your computer under filename “myFile.txt”.

Make a screenshot of the text in the Notepad. Close the Notepad.

Develop a program that opens and reads file “myFile.txt”. Use “try … catch” construction in this program.

Print this text from “myFile.txt” in the Visual Studio Code terminal.

Make a screenshot of the printed text in the Visual Code terminal.

Write an additional new text “A new string” to file “myFile.txt” from your program. Thus, the file has two strings, the initial one, and the new one.

Open file “myFile.txt” with Notepad to see its content. It should have two strings, the initial string and the added later new string.

Make a screenshot of the text in the Notepad. Close the Notepad.

Submit four files including the actual source code file with the program, two screenshots of the Notepad content (before and after), and one screenshot of the Visual Studio Code terminal output.