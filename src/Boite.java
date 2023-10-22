import java.util.ArrayList;
import java.util.List;

class Boite implements CompositionCommande {
    private List<CompositionCommande> compositions = new ArrayList<>();

    public void addComponent(CompositionCommande component) {
        compositions.add(component);
    }

    @Override
    public double getPrice() {
        double totalPrice = 0;
        for (CompositionCommande composition : compositions) {
            totalPrice += composition.getPrice();
        }
        return totalPrice;
    }
}
