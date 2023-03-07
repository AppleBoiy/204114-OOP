/**
 * author: chaipat jainan 650510606
 */

import java.text.DecimalFormat;
import java.util.Scanner;
public class Lab07_3 {

    public static void computeProfit( LandForHouse house [] , int N,  LandForSale lands[], int M ){
        DecimalFormat df = new  DecimalFormat("0.00");
        double profit = 0;
        //insert code here
  for(int i=0 ; i<N; i++){
      for(int j=0; j<M;j++){
          if(lands[j].getSaleStatus()==0 && lands[j].getLandSize()>=house[i].getLandSize()){
              lands[j].setSaleStatus(1);
              int evp = lands[j].getevaluatePrice();
              double sp = evp+0.1 *evp+0.05*house[i].getHousePrice();
              lands[j].setSalePrice(sp);

              profit += sp-evp;
              break;
          }//end if
      }//end for j
  }//end for i
      for(int j=0;j<M;j++){
          if(lands[j].getSaleStatus()==1){
              System.out.println(lands[j].getTitleDeed()+" "+df.format(lands[j].getSalePrice()));
          }
      }




        System.out.print(df.format(profit));
    }


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();

        LandForHouse[] house = new LandForHouse[N];
        LandForSale[] lands = new LandForSale[M];

        for (int i = 0; i < N; i++) {
            house[i] = new LandForHouse();

            int LandSize = in.nextInt();
            int housePrice = in.nextInt();
            house[i].setData(LandSize,housePrice);
        }

        for (int i = 0; i < M; i++) {
            //insert code here
            lands[i] = new LandForSale();
            int LandSize = in.nextInt();
            String titleDeed = in.next();
            int evaluatePrice = in.nextInt();

            lands[i].setData(LandSize,titleDeed,evaluatePrice);

        }
        computeProfit( house, N, lands,  M );

    }

}


class Land {
    protected int landSize;
    //insert code here
    public int getLandSize(){
        return landSize;
    }
}

class LandForSale extends Land {
    private String titleDeed;
    private int evaluatePrice;
    //insert code here
    private int saleStatus;
    private double salePrice;

    public void setData(int LandSize,String titleDeed,int evaluatePrice){
        landSize = LandSize;
        this.titleDeed =titleDeed;
        this.evaluatePrice = evaluatePrice;
        saleStatus =0;

    }
    public void setSaleStatus(int value){saleStatus = value;}
    public int getSaleStatus(){return saleStatus;}

    public void setSalePrice(double value){salePrice=value;}
    public double getSalePrice(){return salePrice;}

    public String getTitleDeed(){return titleDeed;}

    public int getevaluatePrice(){return evaluatePrice;}

}

class LandForHouse extends Land {
    private int housePrice;

    //insert code here
    public void setData(int LandSize, int housePrice){
        landSize=LandSize;
        this.housePrice = housePrice;
    }
    public int getHousePrice(){
        return housePrice;
    }

}
/*
4 3
150 50 
200 100
500 500
50 30
100
A111
10
200
B222
20
300
C333
30
*/