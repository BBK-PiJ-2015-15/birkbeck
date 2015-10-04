// 4 Prime numbers
//
// Outputs if a number is prime or not.
//

// ask the user to enter a number
print "Enter a number: ";
String str = System.console().readLine();
int value = Integer.parseInt(str);

// calculate if the number is prime
boolean prime;

if (value <= 1) {
    // 0 and 1 and negative numbers are not prime
    prime = false;
} else {
    prime = true;

    // to determine if a number is prime we only need to check upto the square
    // root of the value (faster computation time for large numbers)
    // note: if the value is 2 the code doesn't enter the loop but that's ok
    // since the variable named prime is already set as true
    for (int i = 2; i <= Math.sqrt(value); i++) {
        if ((value % i) == 0) {
            prime = false;
            break; // break the loop as soon as we find a divisor
        }
    }
}

// print result
str = (prime) ? " is" : " isn't";
println "The number " + value + str + " prime."
