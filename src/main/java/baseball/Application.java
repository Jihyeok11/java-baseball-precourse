package baseball;

import java.util.LinkedList;
import java.util.Scanner;
import utils.RandomUtils;
// ctrl + alt + L : 자동 포맷터(들여쓰기와 띄어쓰기 자동으로)

public class Application {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int computer = RandomUtils.nextInt(100,999);
        LinkedList<Integer> computerList = new LinkedList<Integer>();
        while (computer>0){
            computerList.push(computer%10);
            computer /= 10;
        }

        while (true){
            System.out.println("숫자를 입력해주세요");
            int a = scanner.nextInt();
            Checking.CompareNumber(computerList,a);
        }
    }
}
