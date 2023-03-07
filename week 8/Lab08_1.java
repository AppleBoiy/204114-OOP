///**
// * @authur chaipat jainan 650510606
// */
//
//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class Lab08_1 {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        String orderId = sc.next();
//        String tableNo = sc.next();
//        // sc.nextLine();
//        int N = sc.nextInt();
//
//
//        // create a corresponding Order instance
//        Order order = new Order();
//        order.setData(orderId, tableNo, N);
//
//        for (int i = 0; i < N; ++i) {
//
//            //input an order item
//            String foodName = sc.next();
//            short price =  (short) sc.nextInt();
//            byte numDish = (byte)sc.nextInt();
//
//            // insert code here to initiate new orderItem and add to order
//            order.addItem(foodName, price, numDish);
//        }
//        //insert code here for summary after all input
//        System.out.println(order.get_orderId() + " " + order.get_tableNo());
//        order.showData();
//        System.out.println(order.get_totalPrice());
//
//    }
//}
//
//class Order {
//    private String _orderId;
//    private String _tableNo;
//    private int _totalPrice;
//    private int _N;
//    private final ArrayList<OrderItem> listItem = new ArrayList<OrderItem>();
//
//    public void setData(String orderId, String tableNo, int N) {
//        this._orderId = orderId;
//        this._tableNo = tableNo;
//        this._N = N;
//    }
//
//    public void addItem(String food, short price, byte numDish) {
//        OrderItem temp = new OrderItem(food, price, numDish);
//        listItem.add(temp);
//        _totalPrice += temp.getTotalPrice();
//    }
//
//    public void showData() {
//        for (int i = 0; i < _N; i++) {
//            System.out.printf("%d) %s = %d x %d = %d\n", (i+1),
//                    listItem.get(i).getFoodName(),
//                    listItem.get(i).getPrice(),
//                    listItem.get(i).getNumDish(),
//                    listItem.get(i).getTotalPrice());
//        }
//    }
//
//    public String get_orderId() {
//        return _orderId;
//    }
//
//    public String get_tableNo() {
//        return _tableNo;
//    }
//
//    public int get_totalPrice() {
//        return _totalPrice;
//    }
//
//}
//
//class OrderItem {
//    // attributes
//    private final String _foodName;
//    private final short _price;
//    private final byte _numDish;
//    private final int _totalPrice;
//
//    // methods
//    public OrderItem(String food, short price, byte numDish) {
//        this._foodName = food;
//        this._price = price;
//        this._numDish = numDish;
//        this._totalPrice = price * numDish;
//    }
//
//    public String getFoodName() {
//        return _foodName;
//    }
//
//    public short getPrice() {
//        return _price;
//    }
//
//    public byte getNumDish() {
//        return _numDish;
//    }
//
//    public int getTotalPrice() {
//        return _totalPrice;
//    }
//}
