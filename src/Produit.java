class Produit implements CompositionCommande{
    private String name;
    private double price;

    public Produit(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice() {

        return price;
    }
}
