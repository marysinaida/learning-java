public class Dog {
    String name = "";
    int age = 0;
//Creating a constructor
//Explaining the behavior of the class
    Dog(String name){
        this.name = name;

    }
    Dog(String name,int age){
        this.name = name;
        this.age = age;

    }
    static void bark(){
        System.out.println("Barking");
    }
    void run (){
        System.out.println("Running");
    }
    String getName(String type){
        return type + name;
    }
    String getName(String type, String breed){
        return type + breed + name;
    }
    int getAge(){
        return age;
    }
}
