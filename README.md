# OnlineShop-Exercise

Part 1: Warehouse
Create the class Warehouse with the following methods:
   - public void addProduct(String product, int price, int stock), which adds a product to the warehouse with the price and stock balance given as parameters.
   - public int price(String product), which returns the price of the product it received as a parameter. If the product hasn't been added to the warehouse, the method must return -99.

Part 2: Products stock balance
Save the stock balance of products in a variable with the Map<String, Integer> type, in the same way the prices were stored. Supplement the warehouse with the following methods:
   - public int stock(String product) returns the current remaining stock of the product in the warehouse. If the product hasn't been added to the warehouse, the method must return 0.
   - public boolean take(String product) reduces the stock remaining for the product it received as a parameter by one, and returns true if there was stock remaining. If the product was not available in the warehouse the method returns false. A products stock can't go below zero.

Part 3: Listing the products
Let's add one more method to the warehouse:
   - public Set<String> products() returns the names of the products in the warehouse as a Set

Part 4: Item
Items can be added to the shopping cart (which we'll add soon). An item is a product with a quantity. You for example add an item representing one bread to the cart, or add an item representing 24 coffees.

Create the class Item with the following methods:
   - public Item(String product, int qty, int unitPrice); a constructor that creates an item corresponding to the product given as a parameter. qty tells us how many of the product are in the item, while unitPrice is the price of a single product.
   - public int price() return the price of the item. You get the items price by multiplying its unit price by its quantity(qty).
   - public void increaseQuantity increases the quantity by one.
   - public String toString() returns the string representation of the item. which must match the format shown in the example below.

Part 5: Shopping Cart
First let's give ShoppingCart a constructor with no parameters and these methods:
   - public void add(String product, int price) adds an item to the cart that matches the product given as a parameter, with the price given as a parameter.
   - public int price() returns the total price of the shopping cart.

Part 6: Printing the cart
Implement the method public void print() for the shopping cart. The method prints the Item-objects in the cart. The order they are printed in is irrelevant.

Part 7: One item per product
Let's change our cart so that if a product is being added thats already in the cart, we don't add a new item, but instead update item already in the cart by calling its increaseQuantity() method.

Part 8: Store
We now have all the parts we need for our "online store", except the store itself. Let's make that next. Our store has a warehouse that includes all our products. For each 'visit' we have a shopping cart. Every time the customer chooses a product its added to their cart if its available in the warehouse. At the same time, the stock in the warehouse is reduced by one.
