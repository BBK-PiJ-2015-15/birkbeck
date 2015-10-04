// 3 Yet another loop
//
// Loop until a set of conditions is met.
//
// Ask the user to input a number, loop while the number is less than 10
// incrementing it by one and ask the user to input another number, if that
// number is 0 break the loop and end execution, otherwise if the number is not
// equal to 1, print that number's value.
//

String str = System.console().readLine();
int i = Integer.parseInt(str);
while (i < 10) {
    i++;
    str = System.console().readLine(); // there was an error here, this variable
                                       // was being redefined
    int j = Integer.parseInt(str);
    if (j == 0) {
        break;
    } else if (j != 1) {
        println j;
    }
}
System.out.println("finished");
