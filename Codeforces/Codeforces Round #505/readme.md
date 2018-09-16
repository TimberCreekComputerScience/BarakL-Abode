# Codeforces Round #505

In this round I answered 1 question, got hacked on another, and attempted 1 more.  

## Question #1 - Doggo Recoloring

Count the number of occurences of each character in the string. If there are more than 1 characters that appears only once, and there are no characters that appear more than once, print "No"
otherwise print "Yes"

## Question #2 - Name of Question

Find all the factors of each number in the first pair
for each factor do a for loop through all the pairs and see if there's a case where neither number in the pair can evenly divide the factor being checked. If so print (-1), otherwise print the factor that was just checked and end the code.

Passed pretests but failed on main test 44 due to Time Limit Exceeded

## Question #3 - Plasticine zebra

Did not solve but I tried to loop up the string keeping track of how far you can go before the string stops alternating between "w" and "b", and then loop down the string doing the same thing.

sum up the 2 values measuring each streak's length

Then loop through the string again looking for the longest possible streak of alternating characters and then print the max between this and the previous sum

