package chapter2;

import java.util.Scanner;

public class ScoreQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ѡ������");
		String name = scanner.nextLine();
		doCompare(name);
	}

	public static void doCompare(String name) {
		int[] nums = new int[10];
		int k = 1;
		for (int i = 0; i < 10; i++) {
			nums[i] = (int) (Math.random() * 100);
			System.out.println("��ί" + k + "���Ϊ:\t" + nums[i]);
			k++;
		}

		int high = 0, low = 100;
		int highNum, lowNum;
		float ave = 0;
		for (int score : nums) {
			if (score > high) {
				high = score;
			} else if (score < low) {
				low = score;
			} else {
				ave += score;
			}
		}
		ave = ave / 8;
		System.out.println("ȥ��һ����߷�:\t" + high + "��");
		System.out.println("ȥ��һ����ͷ�:\t" + low + "��");
		System.out.println(name + "ƽ���÷�Ϊ:\t" + ave + "��");
	}

}
