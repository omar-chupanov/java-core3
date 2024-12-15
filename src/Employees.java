import java.time.LocalDate;
import java.util.Comparator;

public class Employees {

    private String name;
    private String lastName;
    private String profession;
    private LocalDate birthDate;
    private int salary;

    public Employees(String name, String lastName, LocalDate birthDate, String profession, int salary){
        this.name =name;
        this.lastName=lastName;
        this.birthDate = birthDate;
        this.profession = profession;
        this.salary= salary;
    }

    public java.lang.String getName(){
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public java.lang.String getLastName(){
        return lastName;
    }

    public java.lang.String getProfession(){
        return profession;
    }

    public java.time.LocalDate getBirthday() {
        return birthDate;
    }

   public static Comparator<Employees> birthDateComparator(){
         return Comparator.comparing(employees -> employees.birthDate);
   }
}
