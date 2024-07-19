Problem:

Maria plays college basketball and wants to go pro. 
Each season she maintains a record of her play. 
She tabulates the number of times she breaks her season record for most points
and least points in a game. Points scored in the first game establish her record
for the season, and she begins counting from there.

Example

Scores are in the same order as the games played. She tabulates her results as follows:

                                     Count
    Game  Score  Minimum  Maximum   Min Max
     0      12     12       12       0   0
     1      24     12       24       0   1
     2      10     10       24       1   1
     3      24     10       24       1   1
Given the scores for a season, determine the number of times Maria breaks her records for most and least points scored during the season.

Function Description

Complete the breakingRecords function in the editor below.

breakingRecords has the following parameter(s):

int scores[n]: points scored per game
Returns

int[2]: An array with the numbers of times she broke her records. Index  is for breaking most points records, and index  is for breaking least points records.
Input Format

The first line contains an integer , the number of games.
The second line contains  space-separated integers describing the respective values of .

Constraints

Sample Input 0

9
10 5 20 20 4 5 2 25 1
Sample Output 0

2 4


PSEUDOCODIGO

START
1-receive array
2-store the position 0 of step 1 for the minScore
3-store the position 0 of step 1 for the maxScore
4-create count variable for minScore
5-create count variable for maxScore
6-Loop thought step 1
7-if step 1 on dynamic variable i is greater than step 3
8-assign step 1 on position of the dynamic variable to step 3
9-increment step 5
10-if step 1 on dynamic variable i is less than step 2
11-assign step 1 on position of the dynamic variable to step 2
12-create a array of 2 position
13-assign step 4 in position 0 of step 12
14-assign step 5 in position 1 of step 12
15-return step 12
END