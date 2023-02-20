package Task3;
import java.lang.System;


public class Main {
    public static void main(String[]args){

        if ( Job.recruiting==true) {
            System.out.println("Lucky");
        }
        else
        {
            System.out.println("Unlucky");
        }
        Programmer rec = new Programmer();

        if ( Job.recruiting==true) {
            System.out.println("Lucky");
        }
        else
        {
            System.out.println("Unlucky");
        }
    }
}
/*

Code calls global variable from Class job to check its value if true prints lucky else prints unlucky
class programmer inherits class employee
when class programmer is called variable changes to true then code checks again


*/
