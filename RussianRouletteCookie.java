public class RussianRouletteCookie {
    protected String flavor;
    protected String powerUp;
    protected boolean poisonous;
    protected boolean sprinkles;
    public static int hunger=0;

    public RussianRouletteCookie(String flavor, String powerUp, boolean poisonous, boolean sprinkles){
        this.flavor = flavor;
        this.powerUp = powerUp;
        this.poisonous = poisonous;
        this.sprinkles = sprinkles;
        hunger += 10; //more hungry everytime we eat a cookie
    }

    public RussianRouletteCookie(){
    }


    //setters

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public void setPowerUp(String powerUp) {
        this.powerUp = powerUp;
    }

    public void setPoisonous(boolean poisonous) {
        this.poisonous = poisonous;
    }

    public void setSprinkles(boolean sprinkles) {
        this.sprinkles = sprinkles;
    }   //end of setters

    //start of extra methods
    public void makeNoise(){
        System.out.println("...");
    }

    public String toString(){
        return "This is a " + flavor + " cookie. Eat at your own risk...";
    }

    public static void printHunger(){
        System.out.println("Your current hunger level is at " + hunger + ". MORE COOKIESS!!!!");
    }

    //testing environment
    public static void main(String[] args){
        RussianRouletteCookie testCookie = new RussianRouletteCookie("Strawberry cream", "gives a coquette bow", false, true);
        testCookie.makeNoise();
        System.out.println(testCookie);
        printHunger();
    }


}


