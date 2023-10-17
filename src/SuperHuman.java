public class SuperHuman extends Human{
    String superPower = "secret superpower";
//    SuperHuman(){
//    }
    SuperHuman(Human human, String superPower) {
        super(human);
        this.superPower = superPower;
    }
    void showOff(){
        System.out.println(this.superPower);
    }
}
