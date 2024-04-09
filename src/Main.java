public class Main {
    public static void main(String[] args) {

        Darbuotojas darb1 = new Darbuotojas("Vard1", "Pavard1", "39012250045");
        Darbuotojas darb2 = new Darbuotojas("Vard2", "Pavard2", "50407050455");
        darb1.setPareigos("vadybininkas");
        darb1.setDarboPatirtis(5);
        darb2.setPareigos("buhalteris");
        darb2.setDarboPatirtis(1);
        System.out.println(darb1);
        System.out.println(darb2);
        System.out.println();

        Imone company = new Imone("JSC First", 1990);
        company.addEmployee("Name1 Surname1", "manager", 5);
        company.addEmployee("Name2 Surname2", "mechanic", 2);
        company.addEmployee("Name3 Surname3", "security", 4);
        company.workExperienceGreaterThan(3); //Print employees with work experience greater than 3 year

    }
}