/*
Write a Java program to create a class called "Dog" with a name and breed attribute.
Create two instances of the "Dog" class, set their attributes using the constructor and modify
the attributes using the setter methods and print the updated values.
 */

public class Dog {
    String Name;
    String breed;

    Dog(String name, String breed){
        this.Name=name;
        this.breed=breed;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public  void  Objectinfo(){
        System.out.println("Dog name: " + Name);
        System.out.println("Breed type: "+ breed);
        System.out.println(" ");
    }
}
