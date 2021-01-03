# TDD-Kata
TDD-Kata Challenge

TDD Kata is becoming  one of the popular interview technique used in pair-programming interviews.
Candidate is expected to solve a problem using some algorithm and writing test first for every possible test cases.
TDD or Test Driven Development approaches follows Red-Green-Blue pattern .
Steps involed are :
1.Write a Failed Test(Red)
2.Write minimum implentation code to make the Test pass(Green)
3.Do the code refactoring (Blue)

Argubably TDD believed to the best development practise since it help for better code-coverage and identification of technical debt as earlier as possible.
TDD approach have ultimately proven to be time-saving in the long run since it could save time in regression testing when functionality are changed in the future evolution.

In this TDD-Kata we will be trying to solve simple problem of coverting Roman numerals to their coresponding Intergers.

Example :If IV is given as input program should output 4 ,and for IX expected outpit would be 9  etc.

Algorithm Used
----------------------
1.Convert the given input String (Roman Letters) to Character
2.Each Character will be convereted corresponding numerals first
3.Iteration would be applied Starting from index 0, 
    if the current symbol value is greater than next symbol value then add the value to running total .
    if the current symbol value is lesser than the next symbol value then subtract the value from the running total.
