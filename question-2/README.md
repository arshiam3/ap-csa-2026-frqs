# Question #2: Class Design

## My Approach:
I declared instance variables that tracked the original amount of liquid in the bottle and a variable that would track the amount of water after an amount was removed. In the constructor, I set both variables to equal the same amount. In the updateAmount method, I set the variable tracking the current amount to be equal to itself, minus the amount to be removed. I then used an if statement to change that variable to equal the original capacity if the bottle was less that 25% its original capacity.

## Course Connections:
This question used concepts that were covered in the Confetti and Candy Box projects. Both projects were oriented around class design and object oriented programming, and completing those projects gave a solid foundation for working with these concepts.
## What Gave Me Trouble:
I initially struggled with getting the correct inputs because I was using one instance variable throughout the whole code. When I created a variable tracking the initial capacity, and the capacity after the liquid was removed, the code worked properly.

## What I Would Do Differently:
