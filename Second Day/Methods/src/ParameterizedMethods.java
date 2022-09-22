public class ParameterizedMethods {

    public static void add() {
        System.out.println("Added");
    }

    public static void remove() {
        System.out.println("Removed");
    }

    public static void update() {
        System.out.println("Update");
    }

    public static int sum(int number1, int number2) {
        return number1 + number2;
    }

    public static int sum2(int... numbers) {
        int total = 0;
        for (int number : numbers) {
            total +=number;
        }
        return total;
    }

    public static String showCity() {
        return "İzmir";
    }

    public static void main(String[] args) {

        String message = "What a beautiful day!!!";
        String newMessage = message.substring(0,4);
        String newMessage2 = showCity();
        System.out.println(newMessage);
        int number = sum(21,14);
        System.out.println(number);
        int total = sum2(21,35,34,6);
        System.out.println(total);
    }
}