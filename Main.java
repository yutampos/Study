package test;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		
		/* 課題１*/
		String greeting;
		greeting="HelloWorld";
		System.out.println(greeting);
		
		/* 課題２*/
		int sum=0;
		for (int i = 0; i < 10; i++) {
			sum = +i;
			}
		System.out.println(sum);
		
		/* 課題３*/
		LocalDateTime LDT=LocalDateTime.now();
		LocalDateTime plusDate =LDT.plusYears(3);
		DayOfWeek  dw= plusDate.getDayOfWeek();
		System.out.println(dw);
		
		/*  課題４　trueOrFalseメソッドに乱数0or1を渡し、if文で条件に沿った文字列を返している*/
		TrueOrFalse TOF =new TrueOrFalse();
		
		Random random=new Random();
		int Num=random.nextInt(1);
		
		String result=TOF.trueOrFalse(Num);
		
		System.out.println(result);
		
		/** 課題５　Personクラスのフィールド、personData（List型）に各苗字を代入している 
		 * 最後配列数を取得しfor文で全要素を出力 */
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
		
		
		/*課題6 例外を起こしてみました。処理文は念の為コメントアウト*/
		//String age ="26";
		//age="26"/34;
		//System.out.println(age);
		
		
		
		
	}
}
