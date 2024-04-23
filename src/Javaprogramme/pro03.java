package Javaprogramme;

/**
 * 3.1 Declare one instance and one static variable.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the
 * print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */

public class pro03 {

//3.1 Declare one instance and one static variable.

    static String c1 = "This is an one instance and one static variable pro03 is executed successfully";
    int c2 = 200;

    //3.5 Declare the main method.
    public static <Pro03> void main(String[] args) {

        //3.6 cal both instance and static methods into the main method and run the programme.

      //  Pro03 obj3 = new Pro03();
        c4();
        pro03 obj3 = new pro03();
        obj3.c3();
    }
//3.3 Declare one static method.
    public static void c4() {
        //3.4 call the both instance and static variables into both instance and static methods inside the print statement.
        System.out.println(c1);
    }
//3.2 Declare one instance method.
    public void c3(){
        //3.4 call both instance and static variables into both instance and static methods inside thr print statement.
        System.out.println(c2);
        System.out.println(c1);
    }
}

