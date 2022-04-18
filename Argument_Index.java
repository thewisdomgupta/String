//Argument Index: The argument index is a decimal integer starting after “%” sign and ending with “$” sign.
// The position of the argument in the argument list is decided based on the value of the integer.
public class Argument_Index {
    public static void main(String [] args){
        int x=10;
        float y=35.78f;
        char A='V';
        System.out.println("Data are:");
        System.out.printf("%3$s %2$d %1$f",y,x,A);

    }
}
