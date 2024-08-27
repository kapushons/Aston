public class Employee {
    private String name;
    private String post;
    private String email;
    private String phoneNumber;
    private String salary;
    private String age;

    public Employee(String name, String post, String email, String phoneNumber, String salary, String age) {
        this.name = name;
        this.post = post;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void getEmployeeData() {
        System.out.println("Ф.И.О: " + name + "\n" +
                "Должность: " + post + "\n" +
                "Email: " + email + "\n" +
                "Номер телефона: " + phoneNumber + "\n" +
                "Заработная плата: " + salary + "\n" +
                "Возраст: " + age);
    }

    public static void getEmployee() {
        Employee employee = new Employee(
                "Сорокин Сергей Владимирович",
                "Стажер",
                "стажер@ру",
                "999999999",
                "500 000",
                "32");
        employee.getEmployeeData();

//        Задание №2

        Employee[] employeeArray = new Employee[5];
        employeeArray[0] = new Employee("Смирнов Иван Иванович", "Дворник", "******", "4444444444", "50 000", "37");
        employeeArray[1] = new Employee("Иванов Семен Семенович", "Техник", "******", "5555555555", "30 000", "20");
        employeeArray[2] = new Employee("Семенов Семен Семенович", "Уборщик", "******", "666666666", "17 000", "75");
        employeeArray[3] = new Employee("Жуков Жук Жукович", "Почтальон", "*****", "777777", "70 000", "34");
        employeeArray[4] = new Employee("Юрьев Юрий Юрьевич", "СММ", "******", "2222222", "500 000", "15");
        for (Employee person1 : employeeArray) {
            person1.getEmployeeData();
        }
    }
}
