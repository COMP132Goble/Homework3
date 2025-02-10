package hw3;

public class Employee {
    private String name;        // employee name
    private double rate;        // hourly pay rate of the employee
    private double standardHours; 
    private double muliplier;   // pay multiplier for overtime hours

    public Employee(String name, double rate, double hours, double mult) {
        this.name = name;
        this.rate = rate;
        this.standardHours = hours;
        this.muliplier = mult;
    }

    /**
     * Returns the name of the employee
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * Returns the hourly rate of the employee
     * @return
     */
    public double getRate() {
        return rate;
    }

    /**
     * returns the normal working hours the employee has on a weekly basis.
     * For example, if standardHours = 25.5 then that employee works 25.5 hours 
     * in the work week
     * @return
     */
    public double getHours() {
        return standardHours;
    }

    public double getMultiplier() {
        return muliplier;
    }

    /**
     * Increase the hourly pay rate of this employee by the specified amount 
     * 
     * @param amt - the amount to increase the pay rate by
     */
    public void giveRaise(double amt) {
        // add your code here
    }

    /**
     * Calculate the weekly pay for this employee based on the hours worked that 
     * week. Instructions for this calculation are contained in the homework 
     * assignment
     * 
     * @param hours - the hours worked for the week
     * @return  the pay amount for the week
     */
    public double calculateWeeklyPay(double hours) {
        // add your code here
        return 0.0;
    }
}
