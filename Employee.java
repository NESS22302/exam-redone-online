/**
 * Consider this incomplete Employee class to answer some questions of your exam
 *
 * @author Tassia
 * @version 0.1
 */
public class Employee{
    private String fullname;
    private int yearOfBirth;
    private boolean onLeave;
    private double hourlyWage;
    private double unpaidHours;

    public Employee(String fullname, int yearOfBirth, double hourlyWage){
        this.fullname = fullname;
        this.yearOfBirth = yearOfBirth;
        this.hourlyWage = hourlyWage;
        onLeave = false;
        unpaidHours = 0.0;
    }
    
    /**
     * Returns true is an employee is above 16 years old
     */
    private int calculateAge(int currentYear){
        return (currentYear - yearOfBirth);
    }

    /**
     * Returns true is an employee is above 16 years old
     */
    public boolean canDrive(){
        int age = calculateAge(2025);
        // to be completed
        //12.
        //get age
        set age as 16 you can drive
        print you can drive
        if under 16
        print the # of years left until you reach 16
        then print you cant drive for # of years
    }

    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    private double calculatePay(){
        // to be completed
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(){
        // to be completed
          11. to get pay salary you eed to set wage and set hourly wage then multiply wage hourly by hours worked to get salary
    }
}