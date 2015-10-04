// 8 Maximising
//
// Outputs highest number entered.
//

String str;
int value, highest = -1;

// loop while asking the user for the numbers, break if it's negative
for (;;) {
    print "Enter a number: ";
    str = System.console().readLine();
    value = Integer.parseInt(str);

    if (value < 0)
        break;
    else if (value > highest)
        highest = value;
}

if (highest == -1)
    println "Empty sequence.";
else
    println "The highest number in the sequence is " + highest + ".";
