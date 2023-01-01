public class Obshaga implements Functions{
    final String hotel = "Obshaga";
    private String addres;
    private int numRoom;
    private int amount;

    public Obshaga(String addres, int amount, int numRoom) {
        this.addres = addres;
        this.numRoom = numRoom;
        this.amount = amount;
    }

    @Override
    public void Function() {
        System.out.println("В общагах платят арендную плату");
    }

    @Override
    public void Quantity() {
        System.out.println("В номере: "+numRoom+"\n"+addres+" "+hotel+" Проживают: "+amount+" человек\n");
    }

    @Override
    public String toString() {
        return "Obshaga{" +
                "Obshaga='" + hotel + '\'' +
                ", addres='" + addres + '\'' +
                ", numRoom=" + numRoom +
                ", amount=" + amount +
                '}';
    }
}
