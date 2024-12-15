import java.time.LocalDate;

public class Workes extends Employees {

    public Workes(String name, String lastName, LocalDate birthDate, String profession, int salary) {
        super(name, lastName, birthDate, profession, salary);
    }

    public static void increaceSalary(Employees [] employees){
        for (Employees employee : employees){
            if(!(employee instanceof Workes)){
                int newSalary = employee.getSalary()* 2;
                employee.setSalary(newSalary);
            }
        }
    }
}
