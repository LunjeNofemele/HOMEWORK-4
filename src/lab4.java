/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Name: Lunje Nofemele
 *Student Number: ST10420097
 */
public class lab4 {
   public static void main(String[] args) {
        // Step 1: Create an instance of the Car class named 'myCar'
       Car myCar = new Car();
       // Step 2: Set the speed of 'myCar' to Zero and Distance to Zero
       myCar.setDistance(0);
       myCar.setSpeed(0);
       
       System.out.println("myCar has a current speed of "
                            + myCar.getSpeed() + " and has gone a distance of "
                            + (int)myCar.getDistance());
       
       myCar.accelerate(50);
       myCar.travel(2.5);
       // Step 7: Print the current speed and total distance travelled by 'myCar'
       System.out.println("myCar has a current speed of "
                            + myCar.getSpeed() + " and has gone a distance of "
                            + (int)myCar.getDistance());
       
       // Step 8: Decelerate 'myCar' by 15 units
       myCar.decelerate(15);
       // Step 9: Travel an additional distance of 1.5 hours
       myCar.travel(1.5);
       // Step 10: Print the current speed and total distance travelled by 'myCar'
        System.out.println("myCar has a current speed of "
                            + myCar.getSpeed() + " and has gone a distance of "
                            + (int)myCar.getDistance());
    }    
}
