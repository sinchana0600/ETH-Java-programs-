package salary;

class Company {
    private int salary = 50000;   

    protected int accessSalary() {   
        return salary;
    }
}

class Worker extends Company {

    void show() {
        System.out.println("Worker salary is: " + accessSalary());
    }
}

public class salary {
    public static void main(String[] args) {

        Worker w1 = new Worker();
        w1.show();
    }
}

