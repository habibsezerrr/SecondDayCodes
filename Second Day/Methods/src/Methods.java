public class Methods {

    public static void numberFind() {

        int[] numbers = new int[]{1,2,3,4,5,6,7};
        int wanted = 6;
        boolean isThere = false;

        for (int number : numbers) {

            if (number == wanted) {

                isThere = true;
                break;
            }
        }

        String message = "";

        if (isThere) {
            message = "The number is available: " + wanted;
            showMessage(message);
        }
        else {
            showMessage("The number is not available: " + wanted);
        }
    }

    public static void showMessage(String message) {

        System.out.println(message);
    }

    public static void main(String[] args) {

        numberFind();
    }
}