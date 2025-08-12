class CoffeeOrder {
    String size;
    int price;

    // Constructor
    CoffeeOrder(String size) {
        this.size = size;
        if (size.equalsIgnoreCase("Small")) {
            this.price = 50;
        } else if (size.equalsIgnoreCase("Medium")) {
            this.price = 70;
        } else if (size.equalsIgnoreCase("Large")) {
            this.price = 90;
        } else {
            this.price = 0;
            System.out.println("Invalid size!");
        }
    }

    void displayOrder() {
        System.out.println("Coffee Size: " + size);
        System.out.println("Price: ₹" + price);
    }

    public static void main(String[] args) {
        CoffeeOrder order1 = new CoffeeOrder("Medium");
        order1.displayOrder();
    }
}
