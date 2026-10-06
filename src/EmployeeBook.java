public class EmployeeBook {
    private Employee[] recordStorage;

    public EmployeeBook(Employee[] recordStorage) {
        this.recordStorage = recordStorage;
    }

    public void getAllEmployee() {

        // Вывод всей информации о сотруднике
        for (Employee employee : this.recordStorage) {
            if (employee != null) {
                System.out.println(employee.toString());
            }
        }
    }

    public void getAverageSalary() {

        int totalSalary = 0;
        int employeeCount = 0;

        for (Employee employee : this.recordStorage) {
            if (employee != null) {
                totalSalary = totalSalary + employee.getSalary();
                employeeCount++;
            }
        }

        if (employeeCount > 0) {
            double averageSalary = (double) totalSalary / employeeCount;

            System.out.println("Средняя зарплата: " + averageSalary);
        } else {
            System.out.println("Нет ни одного сотрудника");
        }
    }

    public double getTax(Employee employee, String taxType) {
        double tax = 0.0d;
        switch (taxType) {
            case "PROPORTIONAL":
                tax = employee.getSalary() * 0.13;
                System.out.println("Налог \"PROPORTIONAL\" составляет: " + tax);
                break;
            case ("PROGRESSIVE"):
                if (employee.getSalary() < 150000) {
                    tax = employee.getSalary() * 0.13;
                    System.out.println("Налог \"PROGRESSIVE\" для текущей зарплаты составляет: " + tax);
                    break;
                } else if (employee.getSalary() < 350000) {
                    tax = employee.getSalary() * 0.17;
                    System.out.println("Налог \"PROGRESSIVE\" для текущей зарплаты составляет: " + tax);
                    break;
                } else if (employee.getSalary() > 350000) {
                    tax = employee.getSalary() * 0.21;
                    System.out.println("Налог \"PROGRESSIVE\" для текущей зарплаты составляет: " + tax);
                    break;
                }
            default:
                System.out.println("Неправильный тип налога");
                break;
        }
        return tax;
    }

    public void salaryIndexation(int departmentNumber, double percent) {
        for (Employee employee : this.recordStorage) {
            if (employee == null) {
                continue;
            }
            if (employee.getDepartment() != departmentNumber) {
                continue;
            }
            int newSalary = (int) (employee.getSalary() * percent);
            employee.setSalary(newSalary);
        }
    }

    public void showEmployeeHighSalary(int departmentNumber, int comparativeSalary) {
        for (Employee employee : this.recordStorage) {
            if (employee != null && employee.getDepartment() == departmentNumber && employee.getSalary() > comparativeSalary) {
                employee.printShortInfo();
                break;
            }
        }
    }

    public void showEmployeeCountLowSalary(int wage, int employeeNumber) {
        int index = 0;
        int count = 0;

        while (index < this.recordStorage.length) {
            if (count == employeeNumber) {
                break;
            }

            Employee employee = this.recordStorage[index];

            if (employee == null) {
                index++;
                continue;
            }

            if (employee.getSalary() < wage) {
                System.out.println(employee.toString());
                count++;
            }

            index++;
        }
    }

    public boolean checkEmployeeSalary(Employee checkEmployee) {
        if (checkEmployee == null) {
            return false;
        }

        for (Employee employee : this.recordStorage) {
            if (employee != null && employee.equals(checkEmployee)) {
                return true;
            }

        }
        return false;
    }

    public boolean addEmployee(Employee newEmployee) {
        if (newEmployee == null) {
            return false;
        }
        int count = 0;
        while (count < this.recordStorage.length) {
            if (this.recordStorage[count] == null) {
                this.recordStorage[count] = newEmployee;
                return true;
            }
            count++;
        }
        return false;
    }

    public Employee getEmployeeById(int searchId) {
        for (Employee employee : this.recordStorage) {
            if (employee != null && employee.getId() == searchId) {
                return employee;
            }
        }
        return null;
    }


}
