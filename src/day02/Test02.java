package day02;

import java.util.Random;
import java.util.Scanner;

import javax.swing.text.html.CSS;

public class Test02 {

	public static void main(String[] args) {
		System.out.println("idea0001");
		/*
		 * ��ϰ2
		 */
/*		Scanner cs=new Scanner(System.in);
		System.out.println("��������Ļ�Ա�ţ�");
		int account=cs.nextInt();
		int b=account%1000/100;
		int random=(int)(10*Math.random());
		
		System.out.println("��Ա�Ű�λ���ǣ�"+b);
		System.out.println("������ǣ�"+random);
		
		if(b==random)
		{
			System.out.println(account+"��Ա���������˻�Ա");
		}else {
			System.out.println(account+"��лл����֧��");
		}*/
		
		
		/*
		 * ��Ա��¼��ϰ��
		 */
/*		Scanner sc=new Scanner(System.in);
		System.out.println("�������û�����");
		String name=sc.next();
		System.out.println("���������룺");
		int password=sc.nextInt();

		if(name.equals("��") && password ==123)
		{
			System.out.println("��ӭ������");
		}else{
			System.out.println("�Բ��������ǻ�Ա");
		}*/
		
		
		/*
		 * ��ϰ4
		 */
/*		int age=16;
		String sex="Ů";

		if(age>7)
		{
			System.out.println("���԰����ӣ���7��");
		}else if(age>5 && sex.equals("��"))
		{
			System.out.println("���԰����ӣ���5��������");
		}else{
			System.out.println("��̫������");
		}*/
		
/*		double r=4*(Math.random());
		double area=Math.PI*Math.pow(r, 2);
		double circle=2*Math.PI*r;
		System.out.println(r);
		System.out.println(area);
		System.out.println(circle);
		System.out.println(Math.PI);*/
		
/*		Scanner sc=new Scanner(System.in);
		System.out.println("������ͻ����ͣ�1��ͨ��2��Ա");
		int type=sc.nextInt();
		System.out.println("�����빺���");
		int money=sc.nextInt();
		
		switch(type)
		{
		case 1:
			if(money>=100){
				int jine=(int)(money*0.9);
				System.out.println("��ͨ��9��"+jine);
			}else {
				System.out.println("��ͨ������"+money);
			}
			break;
		
		case 2:
			if(money>=200){
				int jine=(int)(money-(money*0.075));
				System.out.println("��Ա��9��"+jine);
			}else {
				System.out.println("��Ա������"+money);
			}
		break;
		
		default:
			System.out.println("���������˰ɣ�");
		}*/
		
/*		if(type==1 && money>=100)
		{
			int jine=(int)(money*0.9);
			System.out.println("��ͨ��9��"+jine);
		}else if(type==1 && money<100){
			System.out.println("��ͨ������"+money);
		}
		
		if(type==2 && money>=200)
		{
			int jine=(int)(money-(money*0.075));
			System.out.println("��Ա��9��"+jine);
		}else if(type==2 && money<200){
			System.out.println("��Ա������"+money);
		}*/
		
/*		long money=10000000;
		if(money>=5000000)
		{
			System.out.println("��������");	
		}else if (money>=1000000) {
			System.out.println("������");
		}else if(money>=500000)	{
			System.out.println("������");
		}else if(money>=100000)	{
			System.out.println("����");
		}else {
			System.out.println("��������+�Ľ����ڵ��");
		}*/
		
/*		int i=4;
		switch(i)
		{
		case 1:
			System.out.println("����500��Ǯ");
			break;
		
		case 2:
			System.out.println("����300��Ǯ");
			break;
			
		case 3:
			System.out.println("����100��Ǯ");
			break;
			
		case 4:
			System.out.println("����Ҫ��������ϰ");
			break;
		}
			*/
			
		//���������ĸ
/*		char c=(char)(int)(Math.random()*26+97);
		System.out.println(c);
		
		switch(c){
		case 'a':
			System.out.println("Ԫ����ĸ");
			break;
		case 'e':
			System.out.println("Ԫ����ĸ");
			break;
		case 'i':
			System.out.println("Ԫ����ĸ");
			break;
		case 'o':
			System.out.println("Ԫ����ĸ");
			break;
		case 'u':
			System.out.println("Ԫ����ĸ");
			break;
			
		case 'y':
			System.out.println("��Ԫ����ĸ");
			break;
		case 'w':
			System.out.println("��Ԫ����ĸ");
			break;
			
			default:
				System.out.println("������ĸ");
		}*/
		
		/*
		 * Switch��ifǶ��ʹ��
		 */
/*		Scanner sc=new Scanner(System.in);
		System.out.println("�������λ��1��ʾͷ�Ȳգ�2��ʾ���ò�");
		int Positions=sc.nextInt();
		System.out.println("�������·ݣ�4-10��Ϊ�����������·�Ϊ����");
		int month=sc.nextInt();
		
		switch(Positions)
		{
		//ͷ�Ȳ�
		case 1:
			//ͷ�Ȳ�����
			if(month>=4 && month<=10)
			{
				int money=(int)(5000*0.9);
				System.out.println("ͷ�Ȳ�+������"+money);
				break;
			//ͷ�Ȳյ���
			}else{
				int money=(int)(5000*0.5);
				System.out.println("ͷ�Ȳ�+������"+money);
				break;
			}
			
		//���ò�
		case 2:
			//���ò�����
			if(month>=4 && month<=10)
			{
				int money=(int)(5000*0.8);
				System.out.println("���ò�+������"+money);
				break;
			//���òյ���
			}else{
				int money=(int)(5000*0.4);
				System.out.println("���ò�+������"+money);
				break;
			}
				
		default:
			System.out.println("����������");
		}*/
		
		
		/**
		 * ��while��forѭ���ֱ����100����������ż���ĺͣ��������
		 */
		//whileѭ��
		int oushusum=0;
		int jishusum=0;
		int i=0;
		while(i<=100)
		{
			if(i%2==0)
			{
				oushusum+=i;
			}else {
				jishusum+=i;
			}
			i++;
		}
		System.out.println("ż����"+oushusum);
		System.out.println("������"+jishusum);

		
		//forѭ��
/*		int jishusum=0;
		int oushusum=0;
		for(int i=0;i<=100;i++){
			if(i%2==0)
			{
				oushusum+=i;
			}else {
				jishusum+=i;
			}
		}
		System.out.println("ż�����ǣ�"+oushusum);
		System.out.println("�������ǣ�"+jishusum);*/
		
		/**
		 * ��while��forѭ�����1-1000֮���ܱ�5������������ÿ�����3��
		 */
		//for
/*		int y=0;
		for(int i=0;i<=1000;i++)
		{
			if(i%5==0)
			{
				System.out.print(i+" ");
				y++;
				if(y%3==0){
					System.out.println();
				}
			}
		}*/

		
		//while
/*		int y=0;
		int i=0;
		while(i<=1000)
		{
			if(i%5==0)
			{
				System.out.print(i+" ");
				y++;
				if(y%3==0){
					System.out.println();
				}
			}
			i++;
		}
*/
		
		/**
		 * ѭ��¼��ĳѧ��5�ſεĳɼ����Ҽ���ƽ����,�������¼��Ϊ����,����¼��
		 */
/*		double sum=0;
		double avg=0;
		
		for(int i=1;i<=5;i++)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("�������"+i+"�ųɼ���");
			double score=sc.nextDouble();
			if(score<0)
			{
				System.out.println("����Ϊ����������¼��");
				
				//����������Ϊ0�����¼���
				i=0;
				sum=0;
				avg=0;
				score=0;
			}
			sum+=score;
		}
		avg=sum/5;
		System.out.println("�ܳɼ���"+sum);
		System.out.println("ƽ���֣�"+avg);
*/
		
//		�����1��+2��+����+10!
/*		for(int i=1;i<=10;i++)
		{
			int sum=1;
			for(int j=1;j<=i;j++)
			{
				sum*=j;
			}
			System.out.println(i+"!="+sum);
		}
*/		

/*		int sum=1;
		for(int i=1;i<=10;i++)
		{
			sum*=i;
		}
		System.out.println(sum);
*/		
		
		
		
		/*
		 *�žų˷��� 
		 */
/*		for(int i=1;i<=9;i++)
		{
			int sum=0;
			for(int j=1;j<=i;j++)
			{
				sum=j*i;
				System.out.print(j+"*"+i+"="+sum+" ");
			}
			System.out.println();
		}
*/
		
		/*
		 * ����0-100�������ֱ������88Ϊֹ��ֹͣѭ��
		 */
/*		int y=0;
		for(int i=1;i<2;)
		{
			
				float datafloat=(float) (Math.random()*100);
				int dataint=Math.round(datafloat);
				y++;
				System.out.print(dataint+" ");
			if(dataint==88)
			{
				System.out.println("\n"+dataint+" ");
				break;
			}
		}
		System.out.println("y:"+y);
*/
		
		/*
		 * ��100~150֮�䲻�ܱ�3�����������
		 */
/*		for(int i=100;i<=150;i++){
			if(i%3!=0)
			{
				System.out.print(i+" ");
			}
		}*/
		
		
		
	}
}




