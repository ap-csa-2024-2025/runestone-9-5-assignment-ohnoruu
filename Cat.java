public class Cat extends Animal{
    private int numLives;

    public Cat(int numLives){
        super("Cat", "Feline");
        this.numLives = numLives; 
    }

    public void matingCall(){
        System.out.println("Meow");
    }

    public int getNumLives(){
        return numLives;
    }
}