package Problem1;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("saif", 20000, true, 1000);
        System.out.println("name is "+p.getName());
        System.out.println("salary is "+p.getSalary());
        System.out.println("is working "+p.getIsWorking());
        System.out.println("monthly expenses "+p.getMonthlyExpenses());
    }
}
