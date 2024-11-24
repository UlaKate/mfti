import java.util.Scanner;

public class Money {

    static String amountMoney = "Введите количество денег: ";
    static String availableProducts = " доступно для покупки";
    static String notEnoughMoney = "Внесите еще деньги, пока ни на что не хватает";

    public static void main(String[] args) {
        //System.out.println("Вендинговый аппарат");

        System.out.println(amountMoney);
        Scanner sc = new Scanner(System.in);
        Integer moneySum = sc.nextInt();

        int[] prices = {89, 150, 66, 75};
        String[] products = {"Сникерс", "Баунти", "Кола"};
        Double[] weight = {50.07};

        boolean canBuy = false;

        int length = Math.min(prices.length, products.length);
        int length3th = weight.length;
        int lengthTotal = Math.min(length, length3th);
        System.out.println(length);
        System.out.println(length3th);
        for(int i = 0; i < lengthTotal; i++){
            if(moneySum >= prices[i]){
                System.out.println(products[i] + " " + "(" + weight[i] + " гр) - "  + availableProducts);
                canBuy = true;
            }
        }
        if(!canBuy){
            System.out.println(notEnoughMoney);
        }
}
}

