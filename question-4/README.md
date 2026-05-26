# Question #4: 2D Array Operations

## My Approach:
I created a variable to track the amount of points in a row, then made a for loop to traverse through the desired row, added the number of points of each object to the point accumulator, and compared each object's color to the color of the first object in the row. If the color maintains throughout the row, the amount of points is doubled, if not, it is returned as is.

## Course Connections:
The Game of Life project gave a lot of practice for a problem like this, especially with having to compare one object to others around it, in this case in the same row.
## What Gave Me Trouble:
I struggled to figure out the syntax to compare each object in a row to each other, but then settled to compare each to the first object.
## What I Would Do Differently:
I believe I should have done the if statement by focusing on whether the colors were not equal rather than if they were equal. I believe my syntax may lead to the wrong accumulation of points.
