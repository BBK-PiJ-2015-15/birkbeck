// 7 Naive sorting
//
// Outputs the inputted numbers in ascending sorted order.
//

// ask the user for the three numbers
print "Enter the first number: ";
String str = System.console().readLine();
int value1 = Integer.parseInt(str);

print "Enter the second number: ";
str = System.console().readLine();
int value2 = Integer.parseInt(str);

print "Enter the third number: ";
str = System.console().readLine();
int value3 = Integer.parseInt(str);

// we'll have 6 possibilities for any 3 inputs
// for example for the values 1, 2 and 3 here's the possible ways the user can
// input them:
// 1 2 3
// 1 3 2
// 2 1 3
// 2 3 1
// 3 1 2
// 3 2 1
//
// we can then see if the first value is the smallest of the three, print it and
// check if the second is smaller than the third, print it and then print the
// third or if it's not print the third and then the second
// continue if the second is the smallest and compare the first and third or
// continue if the third is actually the smallest and compare the first and
// the second
//
// using the less than relational operator as opossed to less we can make sure
// it will work even if the user inputs 2 or 3 equal values

if (value1 <= value2 && value1 <= value3) {
    print value1 + " "
    if (value2 <= value3)
        println value2 + " " + value3
    else
        println value3 + " " + value2
} else if (value2 <= value1 && value2 <= value3) {
    print value2 + " "
    if (value1 <= value3)
        println value1 + " " + value3
    else
        println value3 + " " + value1
} else {
    print value3 + " "
    if (value1 <= value2)
        println value1 + " " + value2
    else
        println value2 + " " + value1
}
