/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *Name: Lunje Nofemele
 *Student Number: ST10420097
 */
public class Car {
    // Fields for the car's speed and total distance
    private int speed = 0; // Speed in units per hour
    private double distance = 0; // Distance in units
    
    // Set the speed of the car
    public void setSpeed(int speed)
    {
        this.speed = speed;
    }
    // Set the speed of the car
    public int getSpeed()
    {
        return this.speed;
    }
    // Set the total distance traveled by the car
    public void setDistance(double distance)
    {
        this.distance = distance;
    }
    // Get the total distance traveled by the car
    public double getDistance()
    {
        return this.distance;
    }
    // Accelerate the car by a given amount
    public void accelerate(int speed)
    {
        if(speed >= 0) 
        {
            this.speed += speed;
        }
    }
    // Decelerate the car by a given amount
    public void decelerate(int speed)
    {
        if(speed >= 0)
        {
            this.speed -= speed;
        }
        if(this.speed < 0)
        {
            this.speed = 0;
        }
    }
    // Travel a distance based on the current speed and time
    public void travel(double hours)
    {
        this.distance += this.speed * hours;
    }
}
