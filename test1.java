import java.util.Scanner;
public class test {
      public static void main(String[] args) {
             
        Scanner in = new Scanner(System.in); 
        System.out.print("Введите число: ");
        int n = in.nextInt();
 
        if(n > 7){
            System.out.println("Привет");
        }
        in.close();
    }
}