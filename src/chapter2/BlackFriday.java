package chapter2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class BlackFriday {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("������ʼ���");
		findBlackf(scanner.nextInt());
	}
	
	public static void findBlackf(int begin){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar calendar = Calendar.getInstance();
		System.out.println("���꿪ʼ��20���ڣ���ɫ�������У�");
		for(int i = begin;i < begin+20;i++){
			for(int j = 0;j < 12;j++){
				calendar.set(i,j+1,13);
				if(5 == calendar.get(Calendar.DAY_OF_WEEK)-1){
					System.out.println(sdf.format(calendar.getTime()));
				}
			}
		}
	}
}
