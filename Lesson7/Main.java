
public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Пётр", "Первый", "разработки", 190000.0);
        Employee e2 = new Employee("Пётр", "Первый", "правления", 1000000.0);
        Employee e3 = new Employee("Николай", "Второй", "тестирования", 100000.0);

        

        System.out.println("Список сотрудников:\n" + e1 + "\n" + e2 + "\n" + e3 + "\n");
        System.out.println(e1.equals(e2));
        System.out.println(e2.equals(e3) + "\n");
        System.out.println(e1.hashCode() == e2.hashCode());
        System.out.println(e2.hashCode() == e3.hashCode());
    }
}
