package day02;

import java.util.Scanner;
import org.omg.CORBA.INTERNAL;

public class Task {

	public static void main(String[] args) {
		/*
		 * 第一题
		 */
/*		Scanner cs=new Scanner(System.in);
		
		//接收姓名
		System.out.println("Please input your name here:");
		String name=cs.next();
		
		//接收年龄
		System.out.println("Please input your age here:");
		int age=cs.nextInt();
		
		//接收性别
		System.out.println("Please input your gender here:");
		String gender=cs.next();
		
		//输出
		System.out.println("The computer recorded that:");
		System.out.println("Your name is:"+name);
		System.out.println("Your age is："+age);
		System.out.println("Your age is："+gender);*/
		
		
		
		/*
		 * 第二题
		 */
		
/*		Scanner cs=new Scanner(System.in);
		System.out.println("请输入圆的半径：");
		double r=cs.nextFloat();
		
		//计算周长
		double perimeter =2*3.14*r;
		
		//计算面积
		double area=3.14*r*r;
		
		//输出
		System.out.println("该圆的半径为：R="+r);
		System.out.println("该圆的周长为：C=2*3.14*"+r+"="+perimeter);
		System.out.println("该圆的面积为：S=3.14*"+r+"*"+r+"="+area);*/
		
		
		
		/*
		 * 第三题
		 */
		
/*		int i=10000;
		System.out.println("本金："+i);
		
		//活期一年
		double CurrentOneYearOld=i+(i*0.0035);
		double CurrentOneYear=Math.rint(CurrentOneYearOld);
		System.out.println("活期1年本金总计："+Math.round(CurrentOneYear));
		
		//定期一年
		double RegularIntervalsOneYearOld=i+(i*0.015);
		double RegularIntervalsOneYear=Math.rint(RegularIntervalsOneYearOld);
		System.out.println("定期1年本金总计："+Math.round(RegularIntervalsOneYear));
		
		//活期两年
		double CurrentTwoYearOld=i+((i*0.0035)*2);
		double CurrentTwoYear=Math.rint(CurrentTwoYearOld);
		System.out.println("活期2年本金总计："+Math.round(CurrentTwoYear));
		
		//定期两年
		double RegularIntervalsTwoYearOld=i+((i*0.021)*2);
		double RegularIntervalsTwoYear=Math.rint(RegularIntervalsTwoYearOld);
		System.out.println("活期2年本金总计："+Math.round(RegularIntervalsTwoYear));*/
		
		
		
		/*
		 * 第四题
		 */
	/*	Scanner sc=new Scanner(System.in);
		System.out.print("请输入一个4位正整数：");
		int data=sc.nextInt();
		
		//拆分具体的每一个数
		//个位数
		int g=data%10;
		//十位数
		int s=data%100/10;
		//百位数
		int b=data%1000/100;
		//千位数
		int q=data/1000;
		
		//每个数加5
		//个位数
		int Addg=(g+5)%10;
		//十位数
		int Adds=(s+5)%10;
		//百位数
		int Addb=(b+5)%10;
		//千位数
		int Addq=(q+5)%10;
		
		//第一次交换
		int temp=Addq;
		Addq=Addg;
		Addg=temp;
		
		//第二次交换
		temp=Adds;
		Adds=Addb;
		Addb=temp;
		
		System.out.println("加密后的数字为："+Addq+Addb+Adds+Addg);*/
		
		/*
		 * 可选题
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("输入文字");
		String text=sc.nextLine();
		
		/*
		 * 取出每一个数
		 */
		char yi=text.charAt(0);
		char er=text.charAt(1);
		char san=text.charAt(2);
		char si=text.charAt(3);
		
		//秘钥
		int i=8;
		
		//对每个数加密
		char encryptionyi=(char) (yi^8);
		char encryptioner=(char) (er^8);
		char encryptionsan=(char) (san^8);
		char encryptionsi=(char) (si^8);
		
		//对每个数解密
		char decodeyi=(char) (encryptionyi^8);
		char decodeer=(char) (encryptioner^8);
		char decodesan=(char) (encryptionsan^8);
		char decodesi=(char) (encryptionsi^8);
		
		//拼接输出
		System.out.println("加密前原文："+text);
		System.out.println("密文："+encryptionyi+encryptioner+encryptionsan+encryptionsi);
		System.out.println("解密后原文："+decodeyi+decodeer+decodesan+decodesi);
		
		
	}
}



