import java.text.*;
public class Examp3_4 {
        public static void main(String[] args){
        double original,money,interest;
        int years = 0;
        original = money= 10000;
        interest = 11.25 / 100;
        System.out.println("year  money");
        while (money < 2 * original) {
            years = years + 1;
            money = money + (interest * money);
            System.out.println(" " + years + "    " +
                                new DecimalFormat("0.00").format(money));
      }
      System.out.println();
      System.out.println(" �� " + years + " �����ﵽ " +
                       new DecimalFormat("0.00").format(money) + "Ԫ��");
    }
}
