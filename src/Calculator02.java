public class Calculator02 {


    static int answer;
    static Calculator02 calculator02 =new Calculator02();
    public static void addition(int a, int b){
        answer = a + b;
        System.out.println("Addition of "+ a + " and " + b  + " = " + answer);
    }

    public void subtraction(int a, int b){

        answer = a - b;
        System.out.println("Subtraction of " + a + " and " + b + " = " + answer);
    }
    public static void main(String[] args) {
       addition(45,67);
       calculator02.subtraction(45, 67);
       addition(85, 38);
       calculator02.subtraction(85,38);



    }
}
