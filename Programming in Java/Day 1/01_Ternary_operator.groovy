// 1 Ternary operator
//
// Output if the user is an adult or not.
//
// This code asks the year the user was born and outputs if the user is an adult
// or not.
// If does this by subtracting the user's birth year from the current year
// (hardcoded) and by using the ternary operator to either create an empty
// string if the user is an adult (18 or older) or the string "not" if the user
// is not an adult.
// The output is created by inserting this string before the "an adult.",
// printing:
// "It seems you are an adult." if the user is an adult or
// "It seems you are not an adult." if the user isn't an adult.

int currentYear = 2012;
print "When were you born (year)?";
String str = System.console().readLine();
int birthYear = Integer.parseInt(str);
int ageAprox = currentYear - birthYear;
String result = (ageAprox > 17) ? "" : "not "
println "It seems you are " + result + "an adult.";
