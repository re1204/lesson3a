import java.util.Locale;

public class Student {
    private String name;
    private String surname;
    public int yearOfBirth;
    protected String gergefgwe;
    String wevewgvre;

    String petName = "Murzik";


    Student(String n){
        name = n.toUpperCase();
    }

    Student(){
    }

    Student(String n, String sn){
        name = n.toUpperCase();
        surname = sn.toUpperCase();
    }


    public void setName(String name){
        this.name = name.toUpperCase();
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
        System.out.println(name + " is going");
    }

    public void go(String tttt){
        System.out.println(name + " is going to " + tttt);
    }

    public void go(int nom){
        System.out.println("I am driving on tram no " + nom);
    }

    public String getFullName(){
        return name + " " + surname;
    }
}

