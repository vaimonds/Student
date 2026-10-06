public class Employee {

    private String surname;
    private String name;
    private String middleName;
    private int department;
    private int salary;
    private final int id;
    private static int idCounter = 1;



    public Employee (String surname, String name, String middleName,int department, int salary) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
        this.id = idCounter;
        idCounter++;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Employee employee = (Employee) o;
        return salary == employee.salary;
    }

    @Override
    public String toString() {
        return "Сотрудник [ Имя: " + name + ", " + "Фамилия: " + surname + ", " + "Отчество: " + middleName + ", " + "Отдел: " + department + ", " + "Зарплата: " + salary + " ].";
    }

    public void printShortInfo() {
        System.out.println("Имя: " + name + ", " + "Зарплата: " + salary);
    }



    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

}

