public class Main {

    public static void main(String[] args) {

        CustomerManager customerManager = new CustomerManager();
        customerManager.add();
        customerManager.remove();
        customerManager.update();

        int number1 = 10;
        int number2 = 10;
        number2 = number1;
        number1 = 30;
        System.out.println(number2);

        int[] numbers1 = new int[]{2,4,6};
        int[] numbers2 = new int[]{5,10,15};
        numbers2 = numbers1;
        numbers1[0] = 10;
        System.out.println(numbers2[0]);
    }
}