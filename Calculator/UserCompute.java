package Calculator;

public class UserCompute {
    public int computer(Calculate compute,int num1,int num2){
        int result = compute.computer(num1,num2);
        return result;
    }

    public static void main(String[] args){
        System.out.println(new DivideOper().computer(25,0));
        System.out.println(new SubOper().computer(25,5));
        System.out.println(new AddOper().computer(25,5));
        System.out.println(new TimesOper().computer(25,5));
    }
}
