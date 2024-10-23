
class Item {
        // Attributes
        private String name;
        private double price;
        private int quantity;

        //Constructor 
        public Item(String name, double price , int quantity){
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }

        //Method to get each item. (Getters)
        public String getName(){
            return name;
        }

        public double price(){
            return price;
        }

        public int getQuantity(){
            return quantity;
        }

//Method to calculate total_Value of Items in an array.
public static double calculateTotvalue(Item[] items){
    double total_Value = 0;
    for(Item item : items){
        total_Value += item.price() * item.getQuantity();
    }
    return total_Value;
}


public static void main(String[] args) {
// Students s = new Students();
Item[] items = {
    new Item("Laptop", 1500.00, 2),
    new Item("Smartphone", 800.00, 5),
    new Item("Headphones", 150.00, 10)};

   // Display the total value of the items.
    double totalvalue = Item.calculateTotvalue(items);
    System.out.println("Total Value of items = " + totalvalue);
}
    }