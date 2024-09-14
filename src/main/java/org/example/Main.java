package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    System.out.println("問題1");
    Scanner scanner = new Scanner(System.in);
    try {
      System.out.println("1番目の数字を入力してください:");
      int number = scanner.nextInt();
      System.out.println("演算子を入力してください (+, -, *, /):");
      String operator = scanner.next();
      System.out.println("2番目の数字を入力してください:");
      int number2 = scanner.nextInt();

      switch (operator) {
        case ("+"):
          System.out.printf("計算結果:%d+%d=%d%n", number, number2, number + number2);//%nは改行
          break;
        case ("-"):
          System.out.printf("計算結果:%d-%d=%d%n", number, number2, number - number2);
          break;
        case ("*"):
          System.out.printf("計算結果:%d×%d=%d%n", number, number2, number * number2);
          break;
        case ("/"):
          if (number2 != 0) {
            System.out.printf("計算結果:%d÷%d=%.2f%n", number, number2, (double) number / number2);
          } else {
            System.out.println("計算結果が正しくありません。");
          }
          break;
        default:
          System.out.println("計算結果が正しくありません。");
      }
    } catch (InputMismatchException e) {
      System.out.println("数字を入力してください。");
    } finally {
      scanner.close();
    }
  }
}



