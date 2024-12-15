import java.time.LocalDate;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Employees omar = new Employees("Omar", "Chupanov", LocalDate.of(1999,8,22),"Программист",70000);
        Employees zlata = new Employees("Zlata", "Chupanova", LocalDate.of(2000,5,21), "Дизайнер",50000);
        Employees sergey = new Employees("Sergey", "Sergeev", LocalDate.of(2001,7,20), "Инженер",60000);

//        System.out.println( Employees.birthDateComparator().compare(omar, zlata));
//        if(Employees.birthDateComparator().compare(omar, zlata)<0){
//            System.out.println(zlata.getName() + " younger " + omar.getName());
//        }else {
//            System.out.println(zlata.getName() + " older " + omar.getName());
//        }


        Workes ivanov = new Workes("Ivan", "Ivanov", LocalDate.of(1996,9,13),"Руководитель", 250000);
        Employees [] employees = {omar, zlata, sergey, ivanov};

        Workes.increaceSalary(employees);

        for (Employees employee : employees) {
            System.out.println(employee.getName() + " " + employee.getLastName() + ", '" + employee.getProfession() + "' " + ": " +
                    "после повышения - " + employee.getSalary());
        }
    }
}