package Javaprogramme;

/**2.1 Declare two static variables
 2.2 Declare one static method
 2.3 Call both static variables into the static method inside the print statement.
 2.4 Declare the Main method.
 2.5 Call the static method into the Main method and Run the programme.
 *
 */
public class Pro02 {
  //2.1 Declare two static variables
  static String x1 = "Programme 2 is executed successfully";
  static int x2 = 1000;

  //2.4 Declare the Main method.

    public static void main(String[] args) {
        //2.5 call the static method into the main method and run the programme x3();
    }
    //2.2 Declare one static method
    public static void x3() {
        //2.3 call both static into the static method inside the print statement.
        System.out.println(x1);
        System.out.println(x2);
    }
}
