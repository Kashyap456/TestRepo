import java.sql.SQLOutput;
import java.util.*;

// add disciple class

class lastsupper {

    private static disciple disciples[] = {
            new disciple("Jesus",0,true),
            new disciple("Peter",1,false), // also called Simon
            new disciple("Andrew",1,false),
            new disciple("James",2,false), // two of them
            new disciple("John",1,false),
            new disciple("Philip",1,false),
            new disciple("Bartholomew",1,false),
            new disciple("Thomas",1,false),
            new disciple("Matthew",1,false),
            new disciple("Thaddaeus",1,false),
            new disciple("Simon",2,false),
            new disciple("Judas",2,false) // Thaddaeus was also called Ju// das
    };

    public static void whoIs(String n)
    {
        int j = -1;
        for (int i = 0; i < disciples.length; i++) {
            if (disciples[i].getName().equals(n)) {
               j = i;
            }
        }
            if (j > -1 && disciples[j].isMessiah() == true) {
                System.out.println(n+" was the Messiah");
            }
            else if (j > -1 && disciples[j].getName().equals(n) && disciples[j].nDisciples() > 1 ) {
                System.out.println("There were 2 disciples named "+n);
            }
            else if (j > -1 && disciples[j].getName().equals(n)) {
                System.out.println(n+" was a Disciple");
            }
            else {
                System.out.println(n+" was not one of the 12");
            }
    };

    public static void main(String args[])
    {
        whoIs("John");
        whoIs("Byron");
        whoIs("Jesus");
        System.out.print("Enter a name (first name only, capitalized)? ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        whoIs(name);
    }
}
