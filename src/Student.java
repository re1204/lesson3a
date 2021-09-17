import java.util.Locale;

public class Student {
    private String name;
    private String surname;
    public int yearOfBirth;

    String petName = "Murzik";

    public void setName(String n){
        name = n;
    }

    public String getName(){
        return name;
    }

    public String getSurnameName(){
        return surname;
    }

    public void setSurname(String sn){
        surname = sn;
    }

    public void go(){
        System.out.println("I am going");
    }

    public String getFullName(){
        return name + " " + surname;
    }
}

