public class Dog extends Animal{
    private String breed; 

    public Dog(String breed){
        super("Dog", "Canine");
        this.breed = breed;
    }

    public void wagTail(){
        System.out.println("waggin");
    }

    public void matingCall(){
        System.out.println("Woof");
    }
}