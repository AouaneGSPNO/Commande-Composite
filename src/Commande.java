public class Commande  {

    private Boite mainBox = new Boite();

    public void addComponent(CompositionCommande component) {
        mainBox.addComponent(component);
    }

    public double calculateTotalPrice() {
        return mainBox.getPrice();
    }


}