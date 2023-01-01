public class Family implements Functions {
    final String flat = "Flat";
    private String addres;
    private int amount;
    public Family(String addres, int amount) {
        this.addres = addres;
        this.amount = amount;
    }

    @Override
    public void Function() {
        System.out.println("В квартире платят за ком. услуги");

    }

    @Override
    public void Quantity() {
        System.out.println("Addres: "+addres+"\nКолличество людей в квартире: "+amount+'\n');
    }
}
