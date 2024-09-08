package org.example;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    System.out.println("問題1");
    Scanner scanner = new Scanner(System.in);
    System.out.println("1番目の数字を入力してください:");
    int number = scanner.nextInt();
    System.out.println("演算子を入力してください (+, -, *, /):");
    String operator = scanner.next();
    System.out.println("2番目の数字を入力してください:");
    int number2 = scanner.nextInt();

    switch (operator) {
      case ("+"):
        //printfでフォーマットする方法もある。
        System.out.println("計算結果:" + number + "+" + number2 + "=" + (number + number2));
        break;
      case ("-"):
        System.out.println("計算結果:" + number + "-" + number2 + "=" + (number - number2));
        break;
      case ("*"):
        System.out.println("計算結果:" + number + "×" + number2 + "=" + number * number2);
        break;
      case ("/"):
        System.out.println("計算結果:" + number + "÷" + number2 + "=" + number / number2);
    }
  }
}

