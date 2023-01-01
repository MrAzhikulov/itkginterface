public class Hostel implements Functions {
    final String hostel = "Hostel";
    private String addres;
    private int numRoom;
    private int amount;

    public Hostel(String addres, int amount, int numRoom) {
        this.addres = addres;
        this.numRoom = numRoom;
        this.amount = amount;
    }

    @Override
    public void Function() {
        System.out.println("В отеле платят арендную плату");
    }

    @Override
    public void Quantity() {
        System.out.println("В номере: "+numRoom+"\n"+addres+" "+hostel+" Проживают: "+amount+" человек\n");
    }

    @Override
    public String toString() {
        return "Hostel{" +
                "hostel='" + hostel + '\'' +
                ", addres='" + addres + '\'' +
                ", numRoom=" + numRoom +
                ", amount=" + amount +
                '}';
    }
}
