import Calculator.*;

public class UserCompute{
    public static void compute(Calculate compute, int num1, int num2) {
        int result = compute.computer(num1, num2);
        System.out.println(result);
    }

    public static void main(String args[]){
        UserCompute.compute(new DivideOper(),25,5);
        UserCompute.compute(new SubOper(),25,5);
        UserCompute.compute(new AddOper(),25,5);
        UserCompute.compute(new TimesOper(),25,5);
    }
}