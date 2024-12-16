public class ZeroSugarRaisinWheatCookie extends RussianRouletteCookie {
    private int raisinCount;

    public ZeroSugarRaisinWheatCookie(int raisinCount){
        super("Zero-sugar raisin wheat cookie", "painfully slow death", true, false);
        this.raisinCount = raisinCount;
        hunger+=10;
    }

    //setter
    public void setRaisinCount(int raisinCount) {
        this.raisinCount = raisinCount;
    }

    //extra methods

    public void makeNoise(){
        System.out.println("*the cookies dryly groans in agony*");
    }

    public String toString(){
        return "This is a " + flavor + " cookie with " + raisinCount + " raisins. Eat at your own risk...";
    }

    public void eatCookie(){
        hunger-=20;
        System.out.println("You died a painful death");
    }

    public static void main(String[] args){
        ZeroSugarRaisinWheatCookie testCookie = new ZeroSugarRaisinWheatCookie(5);
        System.out.println(testCookie);
        testCookie.makeNoise();
        testCookie.setRaisinCount(4);
        System.out.println(testCookie);
        testCookie.eatCookie();
    }



}
