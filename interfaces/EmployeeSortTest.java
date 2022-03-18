package interfaces;

public class EmployeeSortTest {
    public static void main(String[] args) {
        var staff = new Employee[3];

        staff[0] = new Employee("Harry Hacker",35000);
        staff[1] = new Employee("Carl Tester",38000);

        for(Employee e:staff){
            System.out.println("name="+e.getName()+",salary="+e.getSalary());
        }
    }
}
