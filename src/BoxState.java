import java.util.ArrayList;
import java.util.List;

class BoxState implements State {
  private List<State> items = new ArrayList<> ();

  public void addState(State state) {
    items.add (state);
  }

  @Override
  public double calculatePrice() {
    double totalPrice = 0;
    for (State item : items) {
      totalPrice += item.calculatePrice ();
    }
    return totalPrice;
  }
}
