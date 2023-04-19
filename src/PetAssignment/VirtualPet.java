
public class VirtualPet {

    private String name;
    private int age;
    private PetNeeds petneeds;


//* constructor that takes in string and int
    public VirtualPet(String name, int age) {
        this.name = name;
        this.age = age;
        this.petneeds = new PetNeeds();
    }

    public void feed(){
        int decreaseAmount = getRandomNumber(10,20);
        petneeds.decreaseHunger(decreaseAmount);
    }

    public void drink(){
        int decreaseAmount = getRandomNumber(10,20);
        petneeds.decreaseThirst(decreaseAmount);
    }

    public void play(){
        int increaseAmount = getRandomNumber(10,20);
        petneeds.increaseHappiness(increaseAmount);
    }

    public void isSick(){
        if(petneeds.getHunger() >= 100 || petneeds.getThirst() >= 100){
            System.out.println(true);
        }
    }

    public void isSad(){
        if(petneeds.getHappiness() <= 0){
            System.out.println(true);
        }
    }

    public void printStatus(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(petneeds.getHunger());
        System.out.println(petneeds.getThirst());
        System.out.println(petneeds.getHappiness());
    }

    public int getRandomNumber(int min, int max){
        return(int)(Math.random() * (max - min + 1));
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public PetNeeds getPetNeeds(){
      return petneeds;
    }

    VirtualPet pet = new VirtualPet();


}
