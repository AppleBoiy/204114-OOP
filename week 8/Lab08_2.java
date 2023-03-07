///**
// * @author chaipat jainan 650510606
// */
//
//import java.util.Scanner;
//public class Lab08_2 {
//    private static final Scanner sc = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        int k, allSale = 0;
//        int M = sc.nextInt();
//
//        Food [] foodList = new Food[M];
//        for (int i = 0; i < M; i++){
//            String foodName = sc.next();
//            short fPrice = sc.nextShort();
//
//            foodList[i] = new Food(foodName,fPrice);
//        }
//
//        int K = sc.nextInt();
//        Order [] orderList = new Order[K];
//
//        for (k = 0; k < K;k ++){
//            String orderId = sc.next();
//            String tableNo = sc.next();
//
//            int N = sc.nextInt();
//            orderList[k] = new Order(orderId,tableNo,N);
//            for(int i = 0; i < N; i++){
//                String foodName2 = sc.next();
//                byte numDish = sc.nextByte();
//
//                orderList[k].addOrder(foodName2,numDish,foodList);
//            }
//        }
//
//        for(int i = 0; i < K; i++){
//            orderList[i].showTotal();
//        }
//
//        for(int i = 0; i < M; i++){
//
//            foodList[i].printMenuTotalSale();
//            allSale += foodList[i].getTotalSale();
//        }
//        System.out.println(allSale);
//    }
//}
//class Order {
//    // attributes
//    private final String orderId;
//    private final String tableNo;
//    private int totalPrice = 0;
//    private int N = 0;
//    private final int order_list;
//
//    private final OrderItem[] items = new OrderItem[100];
//    // list of orderItems
//
//    // methods
//    public Order(String orderId,String tableNo, int orderList){
//        this.orderId = orderId;
//        this.tableNo = tableNo;
//        this.order_list = orderList;
//    }
//
//    public void addOrder(String foodName, byte numDish, Food[] foods){
//           OrderItem orderItems = new OrderItem(foodName,numDish,foods);
//           items[N] = orderItems;
//           N++;
//    }
//
//    public void showTotal() {
//        for(int i = 0; i < order_list; i++){
//            items[i].findPrice();
//            totalPrice += items[i].get_totalPrice();
//        }
//        System.out.printf("%s %s %d\n", this.orderId, this.tableNo, this.totalPrice);
//    }
//}
//
//class OrderItem {
//    // attributes
//    private final Food[] _food;
//    private final byte _numDish;
//    private int _totalPrice;
//
//    private short _price;
//    private final String _foodName;
//
//    // methods
//    public OrderItem(String foodName, byte numDish,Food[] foods){
//        this._foodName = foodName;
//        this._numDish = numDish;
//        _food = foods;
//    }
//    public void findPrice(){
//        for (Food value : _food) {
//            if ((value.getFoodName()).equals(_foodName)) {
//                _price = value.getPrice();
//                calTotal();
//                value.setNumDish(_numDish);
//            }
//        }
//    }
//
//
//    public void calTotal(){
//        _totalPrice = _numDish * _price;
//    }
//    public int get_totalPrice(){
//        return _totalPrice;
//    }
//}
//class Food {
//    String foodName;
//    short price;
//    int totalSale = 0;
//    private byte numDish;
//    // methods
//
//    public Food(String foodName,short foodPrice){
//        this.foodName = foodName;
//        this.price = foodPrice;
//    }
//    public String getFoodName(){
//        return foodName;
//    }
//    public short getPrice(){
//        return price;
//    }
//
//    public void setNumDish(byte numDish){
//        this.numDish += numDish;
//    }
//    public int getTotalSale(){
//        totalSale = numDish*price;
//        return totalSale;
//    }
//    public void printMenuTotalSale(){
//        System.out.println(foodName+" "+ getTotalSale());
//    }
//}
