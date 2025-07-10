public class CnB {
    public static void main(String[] args) {
        /* for (int i = 0; i<= 10; i++) {
            if (i == 5){
                continue;
            }
            System.out.println(i);
        } */
        int[] prices = {9, 99, 199, 299, 399, 499, 599, 699,799,899,999};
        for (int price : prices) {
            if (price > 500) {
                break;
            }
            System.out.println(price);
        }
    }
    
}
