package HomeWork5;

public class Office {

    public static void main(String[] args) {

        employee mainEmployee = new employee("Иванов Иван Иванович", "Руководитель отдела трактористов", "ivanov@gml.com", "+7(123)456-78-90", 200000, 1990);
        employee[] office = {mainEmployee,
        new employee("Иванова Иванна Ивановно", "Логист", "ivanova@gml.com", "+7(123)456-78-90", 150000, 1993);
        new employee("Иванко Иван Иванович", "Маркетолог", "ivanko@gml.com", "+7(123)456-78-90", 150000, 1995);
        new employee("Иванович Иванка Ивантьевна", "Специалист по СММ", "ivanovich@gml.com", "+7(123)456-78-90", 150000, 1996);
        new employee("Петров Петр Петрович", "Тракторист", "none", "none", 20000, 1970);
       }

        private static void getOffice (employee[] office){
            for (int i = 0; i < office.length; i++) {
                System.out.println((i + 1) + " " + office[i].employeeInfo());
            }
        }

        private static void getOldiest (employee[] office) {
            int yo = 40;
            for (int i = 0; i < office.length; i++) {
                if (office[i].getAge() > yo) {
                    System.out.println(office[i].employeeInfo());
                }
            }
        }

    }
}
