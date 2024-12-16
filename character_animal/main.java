class dog{
    String Breed;
    int age;
    void bark(){
        System.out.println("Woof!");
    }
}
public class main{
    public static void main(String[] args){
        dog my_dog = new dog();
        my_dog.Breed = "Labrador";
        my_dog.age = 5;
        my_dog.bark();

        System.out.println("Breed " + my_dog.Breed);
        System.out.println("age " + my_dog.age);

    }
}