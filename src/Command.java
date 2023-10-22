class Command {
    private BoxState mainBox = new BoxState();

    public void addState(State state) {
        mainBox.addState(state);
    }

    public double calculateTotalPrice() {
        return mainBox.calculatePrice();
    }
}
