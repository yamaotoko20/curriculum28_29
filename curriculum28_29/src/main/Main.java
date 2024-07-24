package main;

import java.util.Scanner;

import process.Process;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scanner = new Scanner(System.in);
        System.out.println("コンソールに数字と昇順(asc)または降順(desc)の値を入力してください:");
        String input = scanner.nextLine();

        Process processor = new Process();
        processor.processPrefectures(input);
	}

}
