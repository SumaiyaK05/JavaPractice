public class SquareEquation {
    public static void main(String[] args) {
        for(int i= 1; i<=5; i++){
            int result = getSquare(i);
            System.out.println("Square of "+ i+ " is: " + result);
        }

        System.out.println("The (a+b)^2 equation's result is: "+ equationSquare(2,3));
    }

    private static int getSquare(int x){
        return x*x;
    }

    public static int equationSquare(int a, int b){
        return a*a+2*a*b+b*b;
    }
}
