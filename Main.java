/* Gary Henry
CIS221
2/7/2022
Tuesdays and Thrusdays (2:10pm to 4:00pm)
Professor: Mr.Swinarski 
CIS221 Homework_2*/

//Main class sets the variable names
public class Main {

    int x, y, z; // create 3 integers
    String A, B, C; // create 3 strings

    public Main() { // Main constructor that gives the variables values
        x = 10;
        y = 25;
        z = 1989;
        A = "Gary";
        B = "Eddie";
        C = "Henry";

    }

    public static void main(String[] args) { // main method

        Main myObj = new Main(); // create new object of Main class

        System.out.println(myObj.x + " / " + myObj.y + "/" + myObj.z);// print output by refering to the attributes
                                                                      // within object of Main class

        System.out.println(" My name is " + myObj.A + " " + myObj.B + " " + myObj.C); // print output by refering to the
                                                                                      // attributes within object of
                                                                                      // Main class

    }
}
