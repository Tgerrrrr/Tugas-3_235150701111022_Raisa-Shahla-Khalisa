package polimorfisme;

public class Main {
    public static void main(String[] args) {
        CommissionEmployee employee1 = new CommissionEmployee("Bayu", "2847828393947393", 2500000.0, 0.10);
        CommissionEmployee employee2 = new CommissionEmployee("John Doe", "2849387828929383", 2560000.0, 0.12);
        CommissionEmployee employee3 = new CommissionEmployee("Shepperd", "28373939375839", 1120000.0, 0.08);

        HourlyEmployee employee12 = new HourlyEmployee("Chris", "4879899348399393", 20000.0, 40.0);
        HourlyEmployee employee22 = new HourlyEmployee("Edo", "23487829292833", 34000.0, 35.0);
        HourlyEmployee employee32 = new HourlyEmployee("Mark", "278564568905839", 11000.0, 50.0);

        SalariedEmployee employee13 = new SalariedEmployee("Tika", "8269839298399393", 250000.0);
        SalariedEmployee employee23 = new SalariedEmployee("Taner", "237929839292833", 256000.0);
        SalariedEmployee employee33 = new SalariedEmployee("Rudolf", "237928929225839", 112000.0);

        System.out.println("\n==================================");
        System.out.println(employee1.toString());
        System.out.println("Pendapatan: Rp " + employee1.earnings());

        System.out.println("====================================");
        System.out.println(employee22.toString());
        System.out.println("Pendapatan: Rp " + employee22.earnings());

        System.out.println("====================================");
        System.out.println(employee13.toString());
        System.out.println("Pendapatan: Rp " + employee13.earnings());

        System.out.println("=====================================");
    }
}
