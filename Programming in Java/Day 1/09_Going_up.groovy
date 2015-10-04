// 9 Going up!
//
// Outputs whether the entered sequence is consecutive or not.
//

// ask the user for the first number
print "Enter a number: ";
String str = System.console().readLine();
int value = Integer.parseInt(str);

if (value < 0) { // check for empty sequence
    println "Empty sequence.";
} else {
    boolean consecutive = true;

    // determine the next expected value
    int expected = value + 1;
    int count = 1;

    // loop while asking the user for the numbers, break if it's negative
    for (;;) {
        print "Enter a number: ";
        str = System.console().readLine();
        value = Integer.parseInt(str);

        if (value < 0)
            break;
        else if (value != expected)
            consecutive = false;

        // increment the expected value
        expected++;

        // increment the number count in the sequence
        count++;
    }

    if (count == 1) {
        println "Only one number in the sequence.";
    } else {
        str = (consecutive) ? "is" : "isn't";
        println "The sequence " + str + " consecutive.";
    }
}
