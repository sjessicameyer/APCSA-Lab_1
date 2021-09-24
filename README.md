# Lab 1
### Middle Earth Based Math

#### Objective: One base does NOT rule them all.

In Middle Earth, Humans use base 10 math while Elves use base 7, Dwarves use base 4 and Wizards use base 3. These differences can cause great confusion between the races.
During their trek to Mordor, the Fellowship begins discussing the merits of each other's respective math systems.  Aragorn maintains base 10 is perfect for humans because he can count in multiples of 10 using his fingers.  Gandalf claims using base 3 math allows wizards to better appreciate the relationship between abstract numbers and physical objects, improving their mystical abilities. Legolas believes base 7 makes sense for elves because of their ability to blend wizardry with the natural world. Gimli prefers base 4 for dwarfs because it suits their practical, ordered personalities.

To make sense of all the different bases used for math in Middle Earth, Samwise and Merry decide to write a program to provide examples of calculations using the different math bases, taking as input the race, a pair of numbers, and operation to be performed.  Please have your program loop 6 times for proper testing.

#### Input Format
Your calculator will take as input a `string` for race, human, elf, dwarf, or wizard, respectively, two `int` numbers in the appropriate base for the race, and an arithmetic operator (either add '+' or multiply '*').  All input numbers are guaranteed to have four or fewer digits, and be in the correct base.

#### Output Format
Your calculator should display the result of the operation on the two numbers in the input, in the same base (of the race input). Additionally, if the operation is multiplication and there are multiple steps involved, the calculator should return the partial results at each step in the exact format as shown in the examples of output below.

#### Reminders and Hints
* No Arrays, or Objects, Only primitive data types.
* `String` use for race and operation input only.
* Consider reusing some of your methods from Simple Algorithms, that’s why you wrote them.
* The number of - or = should be based on the ssize of the number above it's display.

