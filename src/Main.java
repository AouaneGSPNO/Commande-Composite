public class Main {
    public static void main(String[] args) {
        Commande cmd = new Commande();

        cmd.addComponent(new Produit("PA", 4.0));
        cmd.addComponent(new Produit("PB", 2.0));

        Boite boite1 = new Boite();
        boite1.addComponent(new Produit("PC", 1.0));
        boite1.addComponent(new Produit("PD", 3.0));

        // Add la boite1 à la commande
        cmd.addComponent(boite1);

        // Cal le prix total de la commande
        double totalPrice = cmd.calculateTotalPrice();
        System.out.println("************ Prix total de la commande : ***************");
        System.out.println(" \n ====> Prix =  " + totalPrice);
    }
}
