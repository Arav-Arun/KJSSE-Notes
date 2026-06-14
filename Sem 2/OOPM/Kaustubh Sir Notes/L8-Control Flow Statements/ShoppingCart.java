public class ShoppingCart {
    public static void main(String[] args) {
        String[] itemNames = {"Laptop", "Smartphone", "Headphones", "Tablet", "Camera"};
        double[] itemPrices = {70000.00, 38000.00, 1500.00, 40000.00, 17000.00};
        boolean[] inStock = {true, true, false, true, true}; 

        double total = 0.0;
        String itemToDiscount = "Tablet";
        double discount = 0.10; 

        for (int i = 0; i < itemNames.length; i++) {
            // If the item is out of stock, skip it
            if (!inStock[i]) {
                System.out.println(itemNames[i] + " is out of stock, skipping...");
                continue;
            }

            // If we find the item to discount, apply the discount and stop searching
            if (itemNames[i].equals(itemToDiscount)) {
                total += itemPrices[i] * (1 - discount);
                System.out.println("Discount applied to " + itemNames[i] + ": INR " + itemPrices[i] * discount + " off");
                break; // Stop searching after applying the discount
            }

            total += itemPrices[i];
            System.out.println("Added " + itemNames[i] + " to the cart: INR " + itemPrices[i]);
        }

        System.out.println("Total amount to pay: INR " + total);
    }
}
