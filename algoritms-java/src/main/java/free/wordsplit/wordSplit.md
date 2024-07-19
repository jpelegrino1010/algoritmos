Problem:
The Problem
----------------------------
Problem: Have the function WordSplit(strArr) read the array of strings stored in strArr,
which will contain 2 elements: the first element will be a sequence of characters, 
and the second element will be a long string of comma-seperated words, in alphabetical order, 
that represents a dictionary of some arbitrary length. 
For example: strArr can be: ["hellocat", "apple, bat,cat,goodbye,hello,yellow,why"].
Your goal is to determine if the first element in the input can be split into two words, 
where both words in the dictionary that is provided in the second input. In this example,
the firs element can be split into two words: hello and cat because both of those words 
are in the dictionary. Your program should return the two words that exist in the dictionary
seperated by a comma. So for the example above, your program should return hello, cat.
There will only be one correct way to split the first element of characters into two words.
If there is no way to split string into two words that exist in the dictionary, 
return the string not possible. The first element itself will never exist in the dictionary as a real word.

PSEUDOCODIGO

START
1-take first index of the array
2-take second index of the array and split it by comma
3-create set collections and store index two in it
4-create an array of two element
5-loop variable of step 1
6-get the substring between 0 to dynamic variable i
7-if step 3 contains variable of step 6
8-index 0 of step 4 is null
9-store variable of step 6 in index 0 of step 4
10-get substring of current dynamic i
11-if step 3 contains variable of step 10
12-store variable of step 10 in index 1 of step 4
13-break the loop
14-if variable of step 1 is not equal to index 0 + index 1 of step 4
15-return "no possible"
16-index 0 of the array will be equal to index 0 + "," + index 1 of step 4
17-return array on index 0
END
