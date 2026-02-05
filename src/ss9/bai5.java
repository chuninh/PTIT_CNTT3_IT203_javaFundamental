package ss9;

public class bai5 {
    public static void main(String[] args) {

        Employees[] employees = new Employees[3];

        employees[0] = new OfficeEmployee("Nguyen Van A", 10_000_000);
        employees[1] = new ProductionEmployee("Tran Thi B", 300, 20_000);
        employees[2] = new ProductionEmployee("Le Van C", 150, 30_000);

        System.out.println("Danh sách lương nhân viên:");

        double totalSalary = 0;
        int index = 1;

        for (Employees e : employees) {
            double salary = e.calculateSalary();
            System.out.println(index + ". " + e.getName() +
                    " - Lương: " + salary);
            totalSalary += salary;
            index++;
        }

        System.out.println("=> TỔNG LƯƠNG CÔNG TY: " + totalSalary);
    }
}

abstract class Employees {
    protected String name;

    public Employees(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double calculateSalary();
}

class OfficeEmployee extends Employees {
    private double baseSalary;

    public OfficeEmployee(String name, double baseSalary) {
        super(name);
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        return baseSalary;
    }
}

class ProductionEmployee extends Employees {
    private int numOfProducts;
    private double price;

    public ProductionEmployee(String name, int numOfProducts, double price) {
        super(name);
        this.numOfProducts = numOfProducts;
        this.price = price;
    }

    @Override
    public double calculateSalary() {
        return numOfProducts * price;
    }
}
