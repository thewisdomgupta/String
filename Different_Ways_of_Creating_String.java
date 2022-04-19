public class Different_Ways_of_Creating_String {
    public static void main(String [] args){
        System.out.println("Type 1:");
        String str="Vivek kumar Gupta";
        System.out.println(str);
        System.out.println("Type 2:");
        String str2=new String("Vijay Sharma");
        System.out.println(str2);
        System.out.println("Type 3:");
        char [] c={'V', 'I','N','A', 'Y'};
        String str3=new String(c);
        System.out.println(c);
        System.out.println("Type 4:");
        byte b []={65, 66, 67, 68, 69, 70};
        String str4=new String(b);
        System.out.println(str4);
    }
}
//This Code is Contributed by Vivek Kumar Gupta
