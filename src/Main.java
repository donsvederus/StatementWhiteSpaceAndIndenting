public class Main {

    public static void main(String[] args) {

        ////////////////
        // Statements

        // a statement is the complete line of code, closed by a ;
        int myVariable = 50;
        // statement:  int myVariable = 50;
        myVariable++;
        // statement: myVariable++;
        myVariable--;
        // statement: myVariable--;
        System.out.println("This is a test");
        // statement: System.out.println("This is a test");

        // multiple line still a statements
        System.out.println("This " +
                "is another" +
                "test");

        // you can put multiple statements on the same line but not recommended
        int anotherVariable = 50;
        myVariable--;
        System.out.println("another one");

        /////////////////////
        // Whitespace

        // java doesn't care about white space, it deletes out the spaces.
        // obviously you don't want to do something like this even though it works
        int myVariable
                =
                50;

        // put space where it makes it more readable

        //////////////////////////
        // Indentation

        // use indentation to make it easier to read
        // To auto format:  use ctrl + alt + L

    }
}
