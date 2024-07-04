package Creational.Builder;

public class Client {
    public static void main(String[] args) {
        Student abc = Student.getBuilder()
                            .setName("Abc")
                            .setAge(22)
                            .setGradYear(2022)
                            .build();

        System.out.println(abc.toString());

        Student qwerty = Student.getBuilder()
                .setName("Qwerty")
                .setAge(17)
                .setGradYear(2029)
                .build();

        System.out.println(qwerty.toString());
    }
}
