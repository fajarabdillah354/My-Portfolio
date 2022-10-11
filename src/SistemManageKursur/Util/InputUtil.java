package SistemManageKursur.Util;

import java.util.Scanner;

public class InputUtil {

  private static Scanner scanner = new Scanner(System.in);

  public static String input(String in){
    System.out.print(in+" : ");
    String result = scanner.nextLine();
    return result;
  }

  public static void main(String[] args) {
    input("silahkan pilih");
  }
}
