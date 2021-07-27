public class PlacingOrder {
    public static void main(String[] args) {
        PlacingOrder Pizza = new PlacingOrder();
        Pizza.OrderPizza();
        Pizza.AddJalapenos();
        Pizza.AddOlives();
        Pizza.AddGarlic();
        Pizza.ExtraCheese();

    }
    public void OrderPizza() {
        boolean IsOrderPlacedForPizza = true; //if i change this to false it wont run
        // because ifelse statement is only valid when the situation is true
        if (IsOrderPlacedForPizza) { //if i put false above in boolean then i will have to add
            // ! infront of the (IsOrderPlacedForPizza) which will look like this
            // (!IsOrderPlacedForPizza)
            System.out.println("Place an order via Uber For Cheese Pizza");
            System.out.println("Order Placed for cheese Pizza");
            System.out.println("Instructions for Pizza");
        } else {
            System.out.println("Cheese Pizza Out of Stock");
        }

        }
        public void AddGarlic(){
            System.out.println("Add Garlic Crust On the Bread");
        }
        public void AddJalapenos(){
            System.out.println("Add Jalapenos on right half of the pizza");

        }
    public void AddOlives(){
        System.out.println("Add Olives on Left half of the pizza");

    }
    public void ExtraCheese(){
        System.out.println("Add Extra Cheese on the pizza");

    }
    }
