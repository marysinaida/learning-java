import java.util.function.IntFunction;

public class Operators {
    public static void main(String[] args) {
        int valueA = 10;
        int valueB = 20;
        int examScore = 80;
        valueB = 2; 
        valueB += 33; // or else valueB = valueB + 33;
        valueB -= 33; // or else valueB = valueB + 33;

        if (examScore >= 70){

        System.out.println("Passed with A");
        }else if (examScore >= 60){
            System.out.println("Passed with B");
        }else{
            System.out.println("Failed");
        }
    }
}
