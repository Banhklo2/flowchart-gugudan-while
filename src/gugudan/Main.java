package gugudan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("프로그램을 시작합니다.");

        int num;

        while (true) {

            System.out.println("숫자를 입력하세요.");

            if (!sc.hasNextInt()) {
                System.out.println("정수를 입력하세요!");
                sc.next();
                continue;
            }

            num = sc.nextInt();

            if (num < 1) {
                System.out.println("1 이상 입력하세요!");
                continue;
            }
            break;
        }

        int i = 1;
        while (i <= 9) {
            System.out.println(num + "x" + i + " = " + num * i);
            i++;
        }

        sc.close();
    }
}
