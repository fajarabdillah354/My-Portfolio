package LatihanMembuatTodolist.InputUtil;

import java.util.Scanner;

public class InputUtil {

  private static Scanner scanner = new Scanner(System.in);

  public static String inputUser(String pilih){
    System.out.println(pilih+" : ");
    String input = scanner.nextLine();
    return input;
  }



}
