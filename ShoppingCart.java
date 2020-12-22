
import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item> itemList;

    public ShoppingCart() {
        this.itemList = new HashMap<>();
    }
    
    public void add(String product, int price){
        if(this.itemList.containsKey(product)){
            this.itemList.get(product).increaseQuantity();
        } else {
            Item item = new Item(product, 1, price);
            this.itemList.put(product, item);
        }
    }
    
    public int price(){
        int sum = 0;
        for(Item item: this.itemList.values()){
            sum += item.price();
        }
        return sum;
    }
    
    public void print(){
        for(Item item: this.itemList.values()){
            System.out.println(item);
        }
    }
}
