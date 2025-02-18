public class Person {
        String name;
        String address;
        Integer age;
    Person(String name, String address, Integer age){
        this.name = name;
        this.address = address;
        this.age = age;



    }

    public void Objectinfo() {
        System.out.println("Name: " + name );
        System.out.println("Age: "+ age);
        System.out.println("Address: " + address);
        System.out.println(" ");
    }
}
