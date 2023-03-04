/*
 Создать класс Сотрудник (Employee) с полями:
Имя, Фамилия (String)
Название отдела (String)
Зарплата (double)
Реализовать equals и hashCode, который работает только с именем и фамилией
 */


 public class EmployeeMain {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ivan", "Ivanov", "IT dept", 100000);
        Employee e2 = new Employee("Ivan", "Petrov", "Commercial dept", 200000);
        Employee e3 = new Employee("Ivan", "Ivanov", "Technical dept", 300000);

        System.out.println("e1: " + e1 + "\ne2: " + e2 + "\nрезультат сравнения (equals):" + e1.equals(e2) + "\n");
        System.out.println("e2: " + e2 + "\ne3: " + e3 + "\nрезультат сравнения (equals):" + e2.equals(e3) + "\n");
        System.out.println("e1: " + e1 + "\ne3: " + e3 + "\nрезультат сравнения (equals):" + e1.equals(e3) + "\n");

        System.out.println(e1.hashCode() == e2.hashCode());
        System.out.println(e2.hashCode() == e3.hashCode());
        System.out.println(e1.hashCode() == e3.hashCode());
    }
}