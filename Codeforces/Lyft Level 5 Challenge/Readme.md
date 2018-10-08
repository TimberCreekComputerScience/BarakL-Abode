# King Escape

You can split up the board into 4 quadrants based on the horizontal and vertical lines formed by the queen, diagonals don't matter.
Then you only have to check if the start and end locations are in the same quadrant.

# Square Difference

The area formed by the two squares is equal to (side1-side2)*(side1+side2)
Therefore, if the difference between side1 and side2 is greater than one, it is guaranteed the resulting number is not prime

Now if the difference is 1, then all we have to do is check if (side1+side2) is prime and that will determine the answer 
