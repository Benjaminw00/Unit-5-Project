public class GingerbreadCookie extends RussianRouletteCookie{
    private int christmasEnergy;

    public GingerbreadCookie(int christmasEnergy){
        super("Gingerbread cookie", "turns you into Santa", false, true);
        this.christmasEnergy = christmasEnergy;
        hunger+=10;
    }

    //setter
    public void setChristmasEnergy(int christmasEnergy) {
        this.christmasEnergy = christmasEnergy;
    }

    //extra methods

    public void makeNoise(){
        System.out.println("hohoho");
    }

    public String toString(){
        return "This is a " + flavor + " cookie with " + christmasEnergy + " Christmas energy. Eat at your own risk...";
    }

    public void eatCookie(){
        hunger-=20;
        System.out.println("You're santa now. You win!");
    }

    public static void main(String[] args){
        GingerbreadCookie testCookie = new GingerbreadCookie(200);
        System.out.println(testCookie);
        testCookie.makeNoise();
        testCookie.setChristmasEnergy(250);
        System.out.println(testCookie);
        testCookie.eatCookie();
    }
}
