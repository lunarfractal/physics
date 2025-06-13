# How to count number of digits
To count the number of digits of an integer, simply follow these steps:<br />
- Take the absolute value of the number.
- Take the logarithm of the number to the base 10.
- This gives you a fractional number whose ceiling is the number of digits.
- Math.ceil it to get that number
- return the number
