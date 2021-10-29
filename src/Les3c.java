public class Les3c {

    public static void main(String[] args) {

//        Student vasya = new Student();
        Student petya = new Student();

//        vasya.name = "VASYA";
//        vasya.setName("vasya");
//        vasya.go();

//        System.out.println(
//                vasya.getName()
//        );

        Student vasya = new Student("vasya1");
        vasya.go();

        Student vanya = new Student("ivan", "demidov");
//        vanya.go("University");
        vanya.go("School");
        vasya.go(5);



    }

}
