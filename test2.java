import java.util.Scanner;

public class test {
  public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      System.out.print("Введите имя: ");
      String name = scan.nextLine();
      if (name.equals("Вячеслав")) {
          System.out.print("Привет, Вячеслав");
      } else {
          System.out.print("Нет такого имени");
      }
  }
}