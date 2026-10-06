
public class Main {

    public static void main(String[] args) {

        Employee[] employee = new Employee[10];

        employee[0] = new Employee("Иванов", "Иван", "Иванович", 1, 75_000);
        employee[1] = new Employee("Сидоров", "Евгений", "Аргентинович", 5, 95_000);
        employee[2] = new Employee("Шестаков", "Сергей", "Степанович", 3, 175_000);
        employee[3] = new Employee("Игривов", "Пётр", "Анатольевич", 2, 275_000);
        employee[4] = new Employee("Берестов", "Степан", "Астахович", 1, 475_000);

        // Инициализируем EmployeeBook
        EmployeeBook book = new EmployeeBook(employee);

        // Первые 5 должны вернуть true
        System.out.println("1. " + book.addEmployee(new Employee("Иванов", "Иван", "Иванович", 1, 75_000)));
        System.out.println("2. " + book.addEmployee(new Employee("Сидоров", "Евгений", "Аргентинович", 5, 95_000)));
        System.out.println("3. " + book.addEmployee(new Employee("Шестаков", "Сергей", "Степанович", 3, 175_000)));
        System.out.println("4. " + book.addEmployee(new Employee("Игривов", "Пётр", "Анатольевич", 2, 275_000)));
        System.out.println("5. " + book.addEmployee(new Employee("Берестов", "Степан", "Астахович", 1, 475_000)));

        // Следующие 6 вызовов должны вернуть false
        System.out.println("6. " + book.addEmployee(new Employee("Козлов", "Александр", "Петрович", 4, 80_000)));
        System.out.println("7. " + book.addEmployee(new Employee("Новиков", "Дмитрий", "Олегович", 2, 115_000)));
        System.out.println("8. " + book.addEmployee(new Employee("Морозов", "Антон", "Сергеевич", 3, 130_000)));
        System.out.println("9. " + book.addEmployee(new Employee("Петров", "Алексей", "Николаевич", 5, 90_000)));
        System.out.println("10. " + book.addEmployee(new Employee("Волков", "Владимир", "Юрьевич", 1, 105_000)));
        System.out.println("11. " + book.addEmployee(new Employee("Астаханов", "Валерьевич", "Осипович", 2, 50_000)));

        // Вывод всех сотрудников
        book.getAllEmployee();

        // Средняя зарплата
        book.getAverageSalary();

        // Проверка существования по зарплате (бухгалтерский equals)
        Employee employee1 = new Employee("Абрамович", "Коля", "Аргентинович", 2, 75_000);
        System.out.println("Есть ли в штате сотрудник с зарплатой 75 000? -> " + book.checkEmployeeSalary(employee1));

        // Расчет налогов для сотрудника
        Employee employee2 = employee[2]; // Зарплата 175_000
        book.getTax(employee2, "PROPORTIONAL");
        book.getTax(employee2, "PROGRESSIVE");
        book.getTax(employee[4], "PROGRESSIVE");

        // Индексация зарплаты (Отдел 1 повышаем на 10%, множитель 1.1)
        System.out.println("До индексации зарплата Иванова (отдел 1): " + employee[0].getSalary());
        book.salaryIndexation(1, 1.1);
        System.out.println("После индексации зарплата Иванова (отдел 1): " + employee[0].getSalary());

        // Вывод сотрудников отдела с зарплатой выше указанной
        System.out.println("Ищем в отделе 1 сотрудников с зарплатой выше 100 000:");
        book.showEmployeeHighSalary(1, 100_000);

        // Вывод первых N сотрудников с зарплатой ниже указанной
        System.out.println("Вывести максимум 2 сотрудников с зарплатой ниже 100 000:");
        book.showEmployeeCountLowSalary(100_000, 2);

    }

}
