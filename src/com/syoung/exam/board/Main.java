package com.syoung.exam.board;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("== 게시판 v.01 ==");
    System.out.println("== 프로그램 시작 ==");
    System.out.printf("명령 ) ");
    String str = scan.nextLine();
    System.out.println("입력된 명령어 : " + str);
    System.out.println("== 프로그램 종료 ==");
    scan.close();
  }

}
