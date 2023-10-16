public class Human {
    Name name;
    Address address;
    public String toString() {
        return "Numele este " + this.name.print() + "\n" + "Adresa este " + this.address.print();
    }
    //#1
    // Dad
    Human (Name name, Address address) {
        this.address = address;
        this.name = new Name(name);
    }
    //#2
    //Dad
    Human (Address address, Name name) {
        this.address = address;
        this.name = name;
    }
    //#3
    // Child
    Human (Human human) {
        this.name = new Name(human.name);
        this.address = new Address(human.address);
    }

}
class Address{
    public String street;
    public int number;
    public String print() {
        return this.street + ", numarul " + this.number;
    }

    public Address(String street, int number) {
        this.street = street;
        this.number = number;
    }
    public Address (Address address){
        this.number = address.number;
        this.street = address.street;
    }
}

class Name{
    public String firstName;
    public String lastName;
    public String print() {
        return this.firstName + " " +this.lastName;
    }

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public Name (Name name){
        this.firstName = name.firstName;
        this.lastName = name.lastName;
    }
}
