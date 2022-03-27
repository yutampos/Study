package test;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		
		kadai1();
		
		kadai2();
		
		kadai3();
		
		kadai4();
		
		kadai5();
		
		kadai6();
		
	}
	public static void kadai1() {
		/* 課題１　*/
		String greeting;
		greeting="HelloWorld";
		System.out.println(greeting);
		}
	
	public static void kadai2() {
		/* 課題２　if文で変数sumに１を１０回足した後、出力しています*/
		int sum=0;
		for (int i = 0; i < 10; i++) {
			sum = +i;
			}
		System.out.println(sum);
	}
	public static void kadai3() {
		/* 課題３　plusDateとDayOfWeekを使い3年後の曜日を出力しています*/
		LocalDateTime LDT=LocalDateTime.now();
		LocalDateTime plusDate =LDT.plusYears(3);
		DayOfWeek  dw= plusDate.getDayOfWeek();
		System.out.println(dw);
	}
	public static void kadai4() {
		/*  課題４　trueOrFalseメソッドに乱数0or1を渡し、if文の条件に沿って真か偽を返しています*/
		TrueOrFalse TOF =new TrueOrFalse();
		
		Random random=new Random();
		int Num=random.nextInt(1);
		
		String result=TOF.trueOrFalse(Num);
		
		System.out.println(result);
	}
	public static void kadai5() {
		/** 課題５　Personクラスのフィールド、personData（List型）に各苗字を代入しています
		 * 最後配列数を取得しfor文で全要素を出力しています */
		Person person=new Person();
		
		System.out.println("名前を入力してください");
		
		Scanner sc =new Scanner(System.in);
		String Name =sc.nextLine();
		
		person.setPersonData("藤木");
		person.setPersonData("玉木");
		person.setPersonData(Name);
		
		sc.close();
		
		List<String>Data=person.getPersonData();
		for(int i =0 ;i<Data.size();i++) {
			System.out.println(Data.get(i));
		}
		
	}
	public static void kadai6() {
		/*課題6 例外を起こしてみました。*/
		//String age ="26";
		//age="26"/34;
		//System.out.println(age);
		
	}
}
