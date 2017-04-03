# String Calculator
The following is a TDD Kata- an exercise in coding, refactoring and test-first, that you should apply daily for at least 15 minutes (I do 30).

**Before you start:**  
Try not to read ahead.
Do one task at a time. The trick is to learn to work incrementally.
Make sure you only test for correct inputs. there is no need to test for invalid inputs for this kata

## String Calculator

- Create a simple String calculator with a method `int Add(string numbers)`
- The method can take 0, 1 or 2 numbers, and will return their sum  
  (for an empty string it will return 0) for example “” or “1” or “1,2”
- Start with t1he simplest test case of an empty string and move to 1 and two numbers
- Remember to solve things as simply as possible so that you force yourself to write tests you did not think about
- Remember to refactor after each passing test
- Allow the Add method to handle an unknown amount of numbers

- Allow the Add method to handle new lines between numbers (instead of commas):  
the following input is ok:  “1\n2,3”  (will equal 6)  
the following input is NOT ok:  “1,\n” (not need to prove it - just clarifying)




## Books to read
* Kent Beck: *Test Driven Development: By Example*
* Steve Freeman & Nat Pyrce: *Growing Object-Oriented Software Guided by Tests*