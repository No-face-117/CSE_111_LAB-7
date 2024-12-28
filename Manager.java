// CSE-111 LAB - 7 TASK - 6     []
// T-6 Manager class

public class Manager extends Employee{
    private double bonus;
    private double salary_1 = getBaseSalary();
    private double salary_f_m = 0.00;
    private double increment_f = 0.00;

    public Manager(String name_1, double base_salary_1, int hours_worked_1, double bonus_1){
        super(name_1, base_salary_1, hours_worked_1);
        this.bonus = bonus_1;
    }
    
    public void requestIncrement(double increment_0){
        if(getHoursWorked() > 100){
            System.out.println("$" + increment_0 + " Increment approved.");
            increment_f = increment_0;
        }else if(getHoursWorked() > 80){
            System.out.println("$" + increment_0/2.0 + " Increment approved.");
            increment_f = increment_0/2.0;
        }else{
            System.out.println("Increment denied.");
            increment_f = 0.0;
        }
    }

    public void calculateSalary(){
        if (getHoursWorked() > 40){
            salary_1 = (getBaseSalary() * bonus) / 100;
        }
        else{
            salary_1 = 0.0;
        }

        salary_f_m = salary_1 + increment_f + getBaseSalary();
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Bonus: " + bonus + " %");
        System.out.println("Final Salary: $" + (salary_f_m));
    }
}