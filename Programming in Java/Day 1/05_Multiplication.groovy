// 5 Multiplication
//
// Outputs the result of multiplying two numbers.
//

print "Enter the first number: ";
String str = System.console().readLine();
int value1 = Integer.parseInt(str);

print "Enter the second number: ";
str = System.console().readLine();
int value2 = Integer.parseInt(str);

// depending on the sign of the second value turn the multiplication into a sum
// or a subtraction of the first value
int result = 0;

if (value2 >= 0) {
    // second number is positive
    for (int i = 0; i < value2; i++) {
        result += value1;
    }
} else {
    // second number is negative
    for (int i = 0; i > value2; i--) {
        result -= value1;
    }
}

// print result
println value1 + " multiplied by " + value2 + " is " + result + "."
