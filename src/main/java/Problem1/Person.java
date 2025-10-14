package Problem1;

public class Person {
    private String name;
    private double salary;
    private boolean isWorking;
    private double monthlyExpenses;
    private final double DEFAULT_SALARY = 1000;

    public Person(String name) {
        this.name = name;
        this.salary = 0.0;
        this.isWorking = false;
        this.monthlyExpenses = 0.0;
    }

    public Person(String name, double salary, boolean isWorking, double monthlyExpenses) {
        this.name = name;
        this.isWorking = isWorking;
        this.setSalary(salary);
        this.monthlyExpenses = monthlyExpenses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMonthlyExpenses() {
        return monthlyExpenses;
    }

    public void setMonthlyExpenses(double monthlyExpenses) {
        this.monthlyExpenses = monthlyExpenses;
    }
    
    public boolean getIsWorking(){
        return this.isWorking;
    }

    public void setIsWorking(boolean isWorking) {
        this.isWorking = isWorking;
        if (!isWorking) {
            this.salary = 0.0;
        } else {
            if (this.salary <= 0) {
                this.salary = DEFAULT_SALARY;
            }
        }
    }

    public double getSalary(){
        return this.salary;
    }
    
    public void setSalary(double salary) {
        if (!this.isWorking) {
            this.salary = 0.0;
        } else {
            if (salary > 0) {
                this.salary = salary;
            } else {
                this.salary = DEFAULT_SALARY;
            }
        }
    }
}