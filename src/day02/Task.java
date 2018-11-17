package day02;

import java.util.Scanner;
import org.omg.CORBA.INTERNAL;

public class Task {

	public static void main(String[] args) {
		System.out.println("1");
		System.out.println("1");
		System.out.println("1ides");

		/*
		 * ��һ��
		 */
/*		Scanner cs=new Scanner(System.in);
		
		//��������
		System.out.println("Please input your name here:");
		String name=cs.next();
		
		//��������
		System.out.println("Please input your age here:");
		int age=cs.nextInt();
		
		//�����Ա�
		System.out.println("Please input your gender here:");
		String gender=cs.next();
		
		//���
		System.out.println("The computer recorded that:");
		System.out.println("Your name is:"+name);
		System.out.println("Your age is��"+age);
		System.out.println("Your age is��"+gender);*/
		
		
		
		/*
		 * �ڶ���
		 */
		
/*		Scanner cs=new Scanner(System.in);
		System.out.println("������Բ�İ뾶��");
		double r=cs.nextFloat();
		
		//�����ܳ�
		double perimeter =2*3.14*r;
		
		//�������
		double area=3.14*r*r;
		
		//���
		System.out.println("��Բ�İ뾶Ϊ��R="+r);
		System.out.println("��Բ���ܳ�Ϊ��C=2*3.14*"+r+"="+perimeter);
		System.out.println("��Բ�����Ϊ��S=3.14*"+r+"*"+r+"="+area);*/
		
		
		
		/*
		 * ������
		 */
		
/*		int i=10000;
		System.out.println("����"+i);
		
		//����һ��
		double CurrentOneYearOld=i+(i*0.0035);
		double CurrentOneYear=Math.rint(CurrentOneYearOld);
		System.out.println("����1�걾���ܼƣ�"+Math.round(CurrentOneYear));
		
		//����һ��
		double RegularIntervalsOneYearOld=i+(i*0.015);
		double RegularIntervalsOneYear=Math.rint(RegularIntervalsOneYearOld);
		System.out.println("����1�걾���ܼƣ�"+Math.round(RegularIntervalsOneYear));
		
		//��������
		double CurrentTwoYearOld=i+((i*0.0035)*2);
		double CurrentTwoYear=Math.rint(CurrentTwoYearOld);
		System.out.println("����2�걾���ܼƣ�"+Math.round(CurrentTwoYear));
		
		//��������
		double RegularIntervalsTwoYearOld=i+((i*0.021)*2);
		double RegularIntervalsTwoYear=Math.rint(RegularIntervalsTwoYearOld);
		System.out.println("����2�걾���ܼƣ�"+Math.round(RegularIntervalsTwoYear));*/
		
		
		
		/*
		 * ������
		 */
	/*	Scanner sc=new Scanner(System.in);
		System.out.print("������һ��4λ��������");
		int data=sc.nextInt();
		
		//��־����ÿһ����
		//��λ��
		int g=data%10;
		//ʮλ��
		int s=data%100/10;
		//��λ��
		int b=data%1000/100;
		//ǧλ��
		int q=data/1000;
		
		//ÿ������5
		//��λ��
		int Addg=(g+5)%10;
		//ʮλ��
		int Adds=(s+5)%10;
		//��λ��
		int Addb=(b+5)%10;
		//ǧλ��
		int Addq=(q+5)%10;
		
		//��һ�ν���
		int temp=Addq;
		Addq=Addg;
		Addg=temp;
		
		//�ڶ��ν���
		temp=Adds;
		Adds=Addb;
		Addb=temp;
		
		System.out.println("���ܺ������Ϊ��"+Addq+Addb+Adds+Addg);*/
		
		/*
		 * ��ѡ��
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("��������");
		String text=sc.nextLine();
		
		/*
		 * ȡ��ÿһ����
		 */
		char yi=text.charAt(0);
		char er=text.charAt(1);
		char san=text.charAt(2);
		char si=text.charAt(3);
		
		//��Կ
		int i=8;
		
		//��ÿ��������
		char encryptionyi=(char) (yi^8);
		char encryptioner=(char) (er^8);
		char encryptionsan=(char) (san^8);
		char encryptionsi=(char) (si^8);
		
		//��ÿ��������
		char decodeyi=(char) (encryptionyi^8);
		char decodeer=(char) (encryptioner^8);
		char decodesan=(char) (encryptionsan^8);
		char decodesi=(char) (encryptionsi^8);
		
		//ƴ�����
		System.out.println("����ǰԭ�ģ�"+text);
		System.out.println("���ģ�"+encryptionyi+encryptioner+encryptionsan+encryptionsi);
		System.out.println("���ܺ�ԭ�ģ�"+decodeyi+decodeer+decodesan+decodesi);
		
		
	}
}



