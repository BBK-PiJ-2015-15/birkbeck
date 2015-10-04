// 10 You say high, I say low...
//
// Outputs highest number entered.
//

boolean consecutive = true;

// ask the user for the first number
print "Enter a number: ";
String str = System.console().readLine();
int first_value = Integer.parseInt(str);

if (first_value < 0) {
    println "Empty sequence.";
} else {
    // ask the user for the second number so that we can determine if it's going
    // up or down
    print "Enter a number: ";
    str = System.console().readLine();
    int value = Integer.parseInt(str);

    if (value < 0) {
        println "Only one number in the sequence.";
    } else {
        // determine the increment
        if (first_value < value) {
            increment = 1;
        } else {
            increment = -1;
        }

        // determine the next expected value
        int expected = value + increment;

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
            expected += increment;
        }

        str = (consecutive) ? "is" : "isn't";
        println "The sequence " + str + " consecutive.";
    }
}
