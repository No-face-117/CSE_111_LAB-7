// CSE-111 LAB - 7 TASK - 6     []
// T-6 Developer class

public class Developer extends Employee{
    private String prog_lang;
    private double salary_0 = getBaseSalary();
    private double salary_f_d = 0.0;

    public Developer(String name_0, double base_salary_0, int hours_worked_0, String prog_lang_0){
        super(name_0, base_salary_0, hours_worked_0);
        this.prog_lang = prog_lang_0;
    }

    public void calculateSalary(){
        double salary_b = 0.0;

        if(prog_lang.equals("Java")){
            salary_b += 700.0;
        }
        else{
            salary_b = 0.0;
        }

        salary_f_d += salary_b + getBaseSalary();
    }

    public void displayInfo(){
        super.displayInfo();
        System.out.println("Programming Language: " + prog_lang);
        System.out.println("Final Salary: $" + salary_f_d);
    }
    
}