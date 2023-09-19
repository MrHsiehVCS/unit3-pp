# Unit 3 Programming Project

For this project, you will be completing parts of the `Main` and `LeapYear` classes in order to fulfill the specs of each part below.

## PART A - LeapYear.java

For **PART A**, you need to complete the method `boolean isLeapYear(int year)` in the `LeapYear` class. A `year` is a leap year based on the following rules:

1. Everything before 1582 is not a leap year
2. Every year between 1582 and now that is exactly divisible by four is a leap year.
   - Years that are evenly divisble by 100 are not leap years unless they are evenly divisible by 400
   - - Example: 1700, 1800, and 1900 are not leap years
   - - Example: 1600 and 2000 are leap years

Your function should `return true` if the `year` is a leap year and `false` if the year is not a leap year.

## PART B - Main.java

For **Part B** you are going to complete the class `Main`. 
The program should ask the user for input and output whether or not the year given is a leap year (see sample run for format & specific wording). Also, the program should end when the user inputs `STOP`.
In order to do so, you will need to:

1. Take input from the user with a `Scanner`. Use that input to update the variable `year`.
   - Note: To convert a `String` to an `int`, you can use the code: `int intName = Integer.parseInt(stringName);`
2. At the end of the `main` method, make sure to close the `Scanner`

When **PART A** and **PART B** are both done, they should function together like the **Sample Run** below

### Sample Run

```java
Enter a year (or enter STOP to end):  2000
2000 is a leap year
Enter a year (or enter STOP to end):  1900
1900 is not a leap year
Enter a year (or enter STOP to end):  1956
1956 is a leap year
Enter a year (or enter STOP to end):  1580
1580 is not a leap year
Enter a year (or enter STOP to end):  STOP
```

## Grading Breakdown

- Code compiles & runs without errors: 1 pts
- Formatting/indentation: 2 points
- All code commented: 2 points
- No public methods/attributes besides the ones specified: 2 point
- All code is DRY (Don't repeat yourself): 3 points
- Passes all test cases: 20 points

*Total: 30 points*

## Bonus - Text Adventure Game

You now have all you need (variables, if statements, Scanner) to make a choose your own text-based adventure game!
Make one for Mr. Hsieh and your friends to play. 

Make a new file with a class that has it's own main function, and have the game run from there.

### Text Adventure Game - Simple Example

```
You want to go to the bathroom. 
You are currently in class. 
What would you like to do?
(1) Go to the bathroom
(2) Raise your hand
(3) wait
Your choice: 3

You wait for a long time. You can't hold it anymore. It's explosive. 
GAME OVER. 
```

### Text Adventure Game - Complex Example
```
You wake up in a wagon, your arms are shackled together. 
A man in rags, probably a fellow prisoner, speaks to you. 
"Hey you, you're finally awake."
What do you do? (type 'help' for a list of options)
> help
---------
Help
---------
look - see what is around you
use <item> - use an item
go <direction> - move in a particular direction
Other words might exist based on context! 
---------
What do you do? (type 'help' for a list of options)
> look
You see the green scenery passing by. You see a man sitting near you.
...
...
etc
```
