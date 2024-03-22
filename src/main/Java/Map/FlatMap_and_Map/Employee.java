package Map.FlatMap_and_Map;

import java.util.List;

public class Employee {

    private int id;
    private String namne;
    private List<String> citiesWorkedIn;

    public Employee(int id, String namne, List<String> citiesWorkedIn) {
        this.id = id;
        this.namne = namne;
        this.citiesWorkedIn = citiesWorkedIn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNamne() {
        return namne;
    }

    public void setNamne(String namne) {
        this.namne = namne;
    }

    public List<String> getCitiesWorkedIn() {
        return citiesWorkedIn;
    }

    public void setCitiesWorkedIn(List<String> citiesWorkedIn) {
        this.citiesWorkedIn = citiesWorkedIn;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", namne='" + namne + '\'' +
                ", citiesWorkedIn=" + citiesWorkedIn +
                '}';
    }
}
