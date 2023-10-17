public class Main {
    public static void main(String[] args) {

        Address address = new Address("Bd Maniu", 100);
        Name name = new Name("Ana", "Popescu");


        Human mom = new Human(name, address);

        Human dad = new Human(mom.name, mom.address);
//        Human dad = new Human(mom.address, mom.name);
        Human child = new Human(mom);


        child.name = new Name("Andrei", "Popescu");
        dad.name.firstName = "Vasile";


        System.out.println(child);
        System.out.println("----------");
        System.out.println(dad);
        System.out.println("----------");
        System.out.println(mom);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        mom.address.number = 10;

        System.out.println(child);
        System.out.println("----------");
        System.out.println(dad);
        System.out.println("----------");
        System.out.println(mom);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

//        SuperHuman superMan = new SuperHuman();
//        superMan.showOff();
        SuperHuman superMan = new SuperHuman(dad, "Can repair anything");
        superMan.showOff();
    }
}