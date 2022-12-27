
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here
        int compared = number1 > number2 ? number1 : number2;
        return compared > number3 ? compared : number3;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}
