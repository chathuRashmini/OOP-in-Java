package demos;
/*the package to which the Main class belongs to
 * statements have to be terminated with a semicolon*/

import java.util.Arrays;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		/*
		 * this is public so it can be accessible from other part of the program main
		 * method should always be static
		 */
		/*
		 * System.out.println(2); //
		 * -----------------------------------------------------------------------------
		 * int age = 28; System.out.println(age); age = 30; // can change value
		 * System.out.println(age);
		 * 
		 * int mathMarks = 78, englishMarks = 95; System.out.println(mathMarks);
		 * System.out.println(englishMarks);
		 * 
		 * can initialize multiple variable of same type on same line, not recommend
		 * because it makes code untidy note that variables are also named in
		 * camelNotation
		 * 
		 * 
		 * mathMarks = englishMarks; // copy value of one variable to another one
		 * System.out.println(englishMarks);
		 * 
		 * //
		 * -----------------------------------------------------------------------------
		 * byte physicsMarks = 78; // int takes 4 bytes to store values. here we only
		 * need 1B so we use byte here int intaFollowers = 123_463_000; // use under
		 * score to separate digits long siteUsers = 6_432_736_000L; // if we did not
		 * add L in the end java sees this as an integer as gives error // (L or l)
		 * float price = 10.99F; // java sees this number as a double, so use F or f
		 * char letter = 'A'; // use single quotes boolean isMale = false; // true and
		 * false are reserved key words in java
		 * 
		 * //
		 * -----------------------------------------------------------------------------
		 * Date now = new Date();
		 * 
		 * new operator is used to allocate memory. in primitive type we need not to
		 * allocate memory memory is allocated and released by JRE. here now is an
		 * object (instance of 'Date' class). reference types has members. therefore
		 * here, the variable 'now' can access the methods in the class 'Date' by using
		 * the do operator
		 * 
		 * System.out.println(now);
		 * 
		 * // ---------------------------------------------STRINGS String user =
		 * "Edward Cullen"; // this is a reference type not a primitive type // but java
		 * has given us the opportunity to use it without using new operator
		 * System.out.println(user); System.out.println(user.endsWith("n"));
		 * System.out.println(user.startsWith("E"));
		 * System.out.println(user.startsWith("e")); System.out.println(user.length());
		 * System.out.println(user.indexOf('l')); // first occurrence of the given
		 * letter System.out.println(user.indexOf('j')); // j is not in the user
		 * System.out.println(user.replace("Edward", "Alice")); // a new string object
		 * System.out.println(user); // original string has not changes. this is because
		 * in java strings are // immutable System.out.println(user.toLowerCase());
		 * System.out.println(user.toUpperCase()); System.out.println(user.trim()); //
		 * to get rid of white spaces in the beginning or the end of the string
		 * 
		 * // ------------------------------------------------ECSAPE SEQUENCES String
		 * sentence = "Teacher said, \"Do the questions 1 and 2\""; // to print the ""
		 * without compilation errors System.out.println(sentence); String path =
		 * "C:\\Users\\Documents"; // to print \ System.out.println(path); String
		 * twoLines = "Hello Everyone!\nYou are in Java for Beginners";
		 * System.out.println(twoLines);
		 * 
		 * // ----------------------------------------ARRAYS int[] numbers = new int[5];
		 * // array is reference type. include number of elements here numbers[0] = 10;
		 * // access individual elements using indexes numbers[1] = 20; // numbers[10] =
		 * 20; no index as 10. so exception was raised as program fails
		 * System.out.println(numbers); // does not print elements.
		 * 
		 * by default java returns a string which is calculated based on the address of
		 * the object in the memory when user asked to print the array. so we have to
		 * user class "Arrays"
		 * 
		 * System.out.println(Arrays.toString(numbers)); // prints the elements of the
		 * array
		 * 
		 * int[] stdMarks = { 46, 98, 75, 59, 91, 83 }; // another way of array
		 * initialization System.out.println(stdMarks.length); // gives the number of
		 * elements System.out.println(Arrays.toString(stdMarks));
		 * Arrays.sort(stdMarks); // sort the array
		 * System.out.println(Arrays.toString(stdMarks));
		 * 
		 * // ----------------------------------MULTI-DIMENSIONAL ARRAYS int[][] matrix
		 * = new int[2][3]; // create a 2x3 matrix matrix[0][0] = 1; matrix[0][1] = 2;
		 * matrix[1][2] = 3; System.out.println(Arrays.deepToString(matrix)); // to
		 * print multi-dimensional arrays
		 * 
		 * int[][] matrixTwo = { { 1, 2, 3 }, { 4, 5, 6 } };
		 * System.out.println(Arrays.deepToString(matrixTwo));
		 * 
		 * // ------------------------------------CONSTRANTS final float PI = 3.14F; //
		 * need to be a constant. should be immutable. so add 'final' // PI = 30; will
		 * give u an error // use capital letters to name constants
		 * 
		 * // -----------------------------------------ARITHMETIC EXPRESSIONS int result
		 * = 10 + 3; System.out.println(result); double div = (double) 10 / (double) 3;
		 * // to get the accurate answer
		 * 
		 * can't be use as double div = (double)(10/3); this gives 3.0 because it first
		 * divides 10 by 3 (answer is 3), and then cast that answer into double
		 * 
		 * System.out.println(div); int x = 1; x++; System.out.println(x); x += 2; //
		 * augmented (compound) assignment operator System.out.println(x);
		 * 
		 * // ----------------------------------------------ORDER OF OPERATORS x = 10 +
		 * 3 * 2; System.out.println(x); // answer is 60. bcz priority order of * > + x
		 * = (10 + 3) * 2; // this solves the problem System.out.println(x); // now
		 * answer is 26
		 * 
		 * // -----------------------------------------------CASTING and TYPE CONERSION
		 * short y = 1; int z = y + 2; System.out.println(z); // this prints the correct
		 * results, tho the data types are different
		 * 
		 * why is that? short - 2B int - 4B so any variable stored in short variable,
		 * can also be stored in int variable. so this is called IMPLICIT CASTING java
		 * does this automatically byte -> short -> int -> long -> float -> double
		 * 
		 * 
		 * double n1 = 1.1; double n2 = n1 + 2; System.out.println(n2);
		 * 
		 * this gives correct answer as well. int isless precise than double bcz in
		 * double we can have digits after decimal point. so java automatically cast int
		 * into double (here 2->2.0)
		 * 
		 * 
		 * EXPLISIT CASTING --------------------------------------------------- int n3 =
		 * (int) n2 + 10; System.out.println(n3);
		 * 
		 * can happen only between compatible types. string -> int not possible. is
		 * there a method?
		 * 
		 * String s1 = "1"; int n4 = Integer.parseInt(s1) + 10; System.out.println(n4);
		 * 
		 * why is this needed? in most of the frameworks for building user interfaces,
		 * it always receives user inputs as strings.
		 * 
		 * 
		 * String s2 = "1.1"; double n5 = Double.parseDouble(s2) + 10;
		 * System.out.println(n5);
		 * 
		 * 
		 * 
		 * // --------------------------------------------MATH CLASS int r1 =
		 * Math.round(20.4F); System.out.println(r1); int r2 = (int) Math.ceil(20.4F);
		 * System.out.println(r2); int r3 = (int) Math.floor(20.4F);
		 * System.out.println(r3); int maxNum = Math.max(10, 20);
		 * System.out.println(maxNum); double randNum1 = Math.round(Math.random()); //
		 * floating point number between 0 to 1 System.out.println(randNum1); int
		 * randNum2 = (int) Math.round(Math.random() * 100); // floating point number
		 * between 0 to 100 is casted to int System.out.println(randNum2);
		 * 
		 * // ------------------------------------FORMATTING NUMBERS // import the
		 * package java.text.NumberFormat then.
		 * 
		 * NumberFormat currency = new NumberFormat(); NumberFormat is abstract.age so
		 * cannot create an instance
		 * 
		 * NumberFormat currency = NumberFormat.getCurrencyInstance(); String curr1 =
		 * currency.format(1234567.891); // returns a string representation of this
		 * number formatted as // currency System.out.println(curr1); String perc1 =
		 * NumberFormat.getPercentInstance().format(0.1); // method chaining: chaining
		 * more than one method // together System.out.println(perc1);
		 * 
		 * 
		 * 
		 * // ------------------------------------REED INPUTS // import package
		 * java.util.Scanner
		 * 
		 * Scanner scan1 = new Scanner(System.in); // read from terminal need to specify
		 * where we're gonna read input either from terminal window or from a file
		 * System.out.print("Age: "); byte age1 = scan1.nextByte(); // cannot input
		 * float variables here. use scan1.nextFloat() or nextDouble()
		 * System.out.println("You are " + age1); // here implicit casting. java
		 * automatically converts age to string
		 * 
		 * Scanner scan2 = new Scanner(System.in); System.out.print("Name: "); String
		 * user2 = scan2.next(); // reads only one token. reads only one word.
		 * System.out.println("Hello " + user2);
		 * 
		 * Scanner scan3 = new Scanner(System.in); System.out.print("Full Name: ");
		 * String user3 = scan3.nextLine().trim(); // reads the complete input line.
		 * trim() removes the unneccessary white System.out.println("Are you " + user3 +
		 * "?");
		 * 
		 * 
		 * // --------------------------------CONTROL
		 * FLOW-----------------------------------
		 * //--------------------------------COMPARISION OPERATORS int num5 = 10; int
		 * num6 = 20; System.out.println(num5 == num6); System.out.println(num5 !=
		 * num6);
		 * 
		 * 
		 * 
		 * //--------------------------------LOGICAL OPERATORS int temp = 12; boolean
		 * isWarm = temp > 20 && temp <30; // can use || for OR. to reverse a boolean
		 * value use ! (ex: !isWarm) System.out.println(isWarm);
		 * 
		 * //--------------------------------CONDITIONAL OPERATORS if (temp > 30) {
		 * System.out.println("It's Warm"); System.out.println("Not much pleasant :|");
		 * } // {} are added only if there are more than one statement under a condition
		 * or if you need to define variables else if (temp > 20)
		 * System.out.println("Nice day"); else
		 * System.out.println("It's a brrrrrrr day");
		 * 
		 * int salary1 = 120_000; boolean hasHighSalary = (salary1 > 100_000); // () not
		 * compulsory System.out.println(hasHighSalary);
		 * 
		 * //------------------------------TERNARY OPERATOR String salaryGroup = salary1
		 * > 100_000 ? "First" : "Second"; System.out.println(salaryGroup);
		 * 
		 * //----------------------------SWITCH STATEMENTS String userRole = "admin";
		 * switch (userRole) { case "admin": System.out.println("admin"); break; // go
		 * out of the loop // continue : go to the next iteration case "maintainer":
		 * System.out.println("maintainer"); break; default:
		 * System.out.println("guest"); // no break is required since it automatically
		 * goes out of switch statements }
		 * 
		 * 
		 * 
		 * //------------------------LOOPS for (int i = 0; i < 4; i++) // good to use
		 * when u know the number of iterations required
		 * System.out.println("Hello World");
		 * 
		 * 
		 * 
		 * int i = 0; while(i < 4) { // good for a situation where u do not know how
		 * many times to execute System.out.println(i); i++; }
		 */
		// -----------------------------------------------------
		Scanner scan4 = new Scanner(System.in);
		String input = "";
		int count = 0;
		while (!input.equals("quit")) {
			System.out.print("Subject: ");
			input = scan4.next().toLowerCase(); // if user types like Quit, this won't work. so need to convert to lower
												// case
			count += 1;
			//System.out.println(input);
		}
		int subjectCount = count - 1;
		System.out.println("Number of subjects = " + subjectCount);
		// ------------------------------------------------------
		/*
		 * do { i *= 10; System.out.println(i); // gonna execute at least one time }
		 * while (i < 10_000);*/
		//-------------------------------------------------------- 
		String[] books = {"Twilight", "New moon", "Eclipse", "Breaking dawn", "Safe Heaven", "Kite Runner", "Hunger Games"};
		for (String book : books)
			System.out.println(book); // can't use to iterate from end to the beginning
		 // do not have access to the index of the items
	}
}