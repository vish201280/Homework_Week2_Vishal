package Javaprogramme;

/**
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 */
public class Pro01 {
  // 1.1 Declare two instance variables.

    String a1 = "This is an instavariable program1 is executed successfully";
    int a2 = 100;

    // 1.4 Declare the main method.

    public static void main(String[] args) {
        // 1.5 call the above instance method into the Main method and run the programme

        Pro01 obj1 = new Pro01();
        obj1.a3();
    }
//1.2 Declare one instance method.

    public void a3() {
        //1.3 call both instance variables into the instance method inside the print statement.

        System.out.println(a1);
        System.out.println(a2);
    }

}
