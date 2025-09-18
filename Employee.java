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
    //public boolean canDrive() {
        //int age = calculateAge(2025);
        //if (age >= 16) {
            //return true;

        //} //else {
            //System.out.println("you can drive in" + (16 - age) + "years");
            //return false
        //}
    //}

    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    //private double calculatePay(){
        // to be completed
        //basePay = hourlyWage*unpaidHours;
        //taxe = 0.30;
        //deductedPay = basePay*taxe;
        //totalPay = basePay - deductedPay;
        //return totalPay;
        
        
    //}
    
    public String getName() {
        return fullname;
    }
    
    public void setName(String fullname) {
        this.fullname = fullname;
    }
    

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(){
        //amount = calculatePay();
        //System.out.println(fullname + " has received a wire tranfer of " + amount + " CAD");
        //unpaidHours = 0.0;
    }
}