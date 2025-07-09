public class Average {
    public static void main (String[] args) {
        int elements[] = {38, 83, 58, 85, 11};
        int sum = 0;
        for (int i=0; i < elements.length; i++) {
            sum = sum + elements[i];
        }
        double average = sum / elements.length;
        System.out.println("Average value of array elements is : " + average);
    }
}
