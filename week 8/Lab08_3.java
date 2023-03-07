/**
 * @author chaipat jainan 650510606
 */

import java.util.Scanner;

import static java.lang.System.*;

public class Lab08_3 {
    private static final Scanner sc = new Scanner(in);

    public static void main(String[] args) {

        int i, k, allSale = 0;

        int M = sc.nextInt();
        Food [] foodList = new Food[M];

        for (i =0 ;i<M;i++){
            String foodName = sc.next();
            short fPrice = sc.nextShort();
            foodList[i] = new Food(foodName,fPrice);
        }

        int K = sc.nextInt();
        Order [] orderList = new Order[K];

        for (k = 0;k< K;k++){
            String orderId = sc.next();
            String tableNo = sc.next();

            int N = sc.nextInt();
            orderList[k] = new Order(orderId,tableNo,N);
            for(i=0;i<N;i++){
                String foodName2 = sc.next();
                byte numDish = sc.nextByte();
                orderList[k].addOrder(foodName2,numDish,foodList);
            }
        }
        String repeated_menu = sc.next();
        for(i=0;i<K;i++){
            orderList[i].set_duplicatedMenu(repeated_menu);
        }

        for(i=0 ; i<K;i++){
            orderList[i].showTotal();
        }
        for(i=0;i<M;i++){
            foodList[i].printMenuTotalSale();
            allSale += foodList[i].getTotalSale();
        }
        out.println(allSale);

        int counter =0;
        for( i=0;i<K;i++){
            if (orderList[i].find_repeated()){
                out.println(orderList[i].get_orderId());
                counter++;
            }
        }if(counter==0)
            out.print("Null");
    }
}
class Order {
    // attributes
    private final String _orderId;
    private final String _tableNo;
    private int _totalPrice = 0;
    private int N = 0;
    private final int _orderList;
    private String _duplicatedMenu;
    private boolean repeated;

    public String get_orderId(){
        return _orderId;
    }
    private final OrderItem[] items = new OrderItem[100];

    public Order(String orderId, String tableNo, int orderList){
        this._orderId = orderId;
        this._tableNo = tableNo;
        this._orderList = orderList;
    }
    public void set_duplicatedMenu(String repeated){
        _duplicatedMenu = repeated;
        find_repeated();
    }

    public void addOrder(String fName,byte numDish,Food[] foods){
        OrderItem orderItems =new OrderItem(fName,numDish,foods);
        items[N] = orderItems;
        N++;
    }
    public boolean find_repeated(){
        for(int i = 0; i< _orderList; i++){
            if( (items[i].getFoodName()).equals(_duplicatedMenu)){
                repeated = true;
                break;
            }
            else
                repeated = false;
        }
        return repeated;
    }
    public void showTotal() {
        for(int i = 0; i< _orderList; i++){
            items[i].findPrice();
            _totalPrice += items[i].getTotalPrice();
        }
        out.printf("%s %s %d\n", this._orderId, this._tableNo, this._totalPrice);
    }
}

class OrderItem {
    // attributes
    private final Food[] food;
    private final byte numDish;
    private int totalPrice;

    private short price;
    private final String foodName;

    // methods
    public OrderItem(String foodName, byte numDish,Food[] foods){
        this.foodName = foodName;
        this.numDish = numDish;
        food = foods;
    }
    public void findPrice(){
        for (Food value : food) {
            if ((value.getFoodName()).equals(foodName)) {
                price = value.getPrice();
                calTotal();
                value.setNumDish(numDish);
            }
        }
    }
    public String getFoodName(){
        return foodName;
    }

    public void calTotal(){
        totalPrice = numDish * price;
    }
    public int getTotalPrice(){
        return totalPrice;
    }
}
class Food {
    String foodName;
    short price;
    int totalSale = 0;
    private byte numDish;

    public Food(String foodName,short foodPrice){
        this.foodName = foodName;
        this.price = foodPrice;
    }
    public String getFoodName(){
        return foodName;
    }
    public short getPrice(){
        return price;
    }

    public void setNumDish(byte numDish){
        this.numDish += numDish;
    }
    public int getTotalSale(){
        totalSale = numDish*price;
        return totalSale;
    }
    public void printMenuTotalSale(){
        out.println(foodName+" "+ getTotalSale());
    }
    
}


