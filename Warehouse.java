
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> priceMap;
    private Map<String, Integer> stockMap;

    public Warehouse() {
        this.priceMap = new HashMap<>();
        this.stockMap = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock){
        this.priceMap.put(product, price);
        this.stockMap.put(product, stock);
    }
    
    public int price(String product){
        if(this.priceMap.containsKey(product)){
            return this.priceMap.get(product);
        } else {
            return -99;
        }
    }
    
    public int stock(String product){
        if(this.stockMap.containsKey(product)){
            return this.stockMap.get(product);
        } else {
            return 0;
        }
    }
    
    public boolean take(String product){
        if(this.stock(product) == 0){
            return false;
        } else {
            int stock = this.stockMap.get(product);
            this.stockMap.put(product, stock - 1);
            return true;
        }
    }
    
    public Set<String> products(){
        return this.priceMap.keySet();
    }
}