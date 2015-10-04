// 6 Division
//
// Outputs the result of dividing two numbers.
//
// Note: both numbers must be positive, not zero and dividing fractions isn't
// supported.
//

print "Enter the first number: ";
String str = System.console().readLine();
int value1 = Integer.parseInt(str);

print "Enter the second number: ";
str = System.console().readLine();
int value2 = Integer.parseInt(str);

if (value1 <= 0 || value2 <= 0) {
    println "Error: both numbers must be positive and not zero."
} else if (value1 < value2) {
    println "Error: first number must be bigger or equal to the second number."
} else {
    // we can turn a division into a substraction loop of the first number by
    // the second number while the result is bigger or equal to the first value
    // this will be the remainder and the number of loops will be the final
    // result
    int result = 0, remainder = value1;

    while (remainder >= value2) {
        remainder -= value2;
        result++;
    }

    // print result
    println value1 + " divided by " + value2 + " is " + result + \
        ", remainder " + remainder + ".";
}
