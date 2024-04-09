import java.util.HashMap;
import java.util.Map;

public class Imone {
    private String name;
    private int foundedYear;
    Map<String, Integer> employeesList;

    public Imone(String name, int foundedYear){
        this.name = name;
        this.foundedYear = foundedYear;
        employeesList = new HashMap<String, Integer>();
    }

    public void addEmployee(String nameSurname, String jobPosition, int workExperience){
        employeesList.put(nameSurname + " " + jobPosition, workExperience);
    }

    public void workExperienceGreaterThan(int greaterThan){
        for(Map.Entry<String, Integer> entry: employeesList.entrySet()){
            if(entry.getValue() > greaterThan) System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
