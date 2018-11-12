package day02;

import java.util.Random;
import java.util.Scanner;

import javax.swing.text.html.CSS;

public class Test02 {

	public static void main(String[] args) {		
		/*
		 * 练习2
		 */
/*		Scanner cs=new Scanner(System.in);
		System.out.println("请输入你的会员号：");
		int account=cs.nextInt();
		int b=account%1000/100;
		int random=(int)(10*Math.random());
		
		System.out.println("会员号百位数是："+b);
		System.out.println("随机数是："+random);
		
		if(b==random)
		{
			System.out.println(account+"会员，您的幸运会员");
		}else {
			System.out.println(account+"，谢谢您的支持");
		}*/
		
		
		/*
		 * 会员登录练习题
		 */
/*		Scanner sc=new Scanner(System.in);
		System.out.println("请输入用户名：");
		String name=sc.next();
		System.out.println("请输入密码：");
		int password=sc.nextInt();

		if(name.equals("汪") && password ==123)
		{
			System.out.println("欢迎您，汪");
		}else{
			System.out.println("对不起，您不是会员");
		}*/
		
		
		/*
		 * 练习4
		 */
/*		int age=16;
		String sex="女";

		if(age>7)
		{
			System.out.println("可以搬桌子，满7岁");
		}else if(age>5 && sex.equals("男"))
		{
			System.out.println("可以搬桌子，满5岁且男生");
		}else{
			System.out.println("你太年轻了");
		}*/
		
/*		double r=4*(Math.random());
		double area=Math.PI*Math.pow(r, 2);
		double circle=2*Math.PI*r;
		System.out.println(r);
		System.out.println(area);
		System.out.println(circle);
		System.out.println(Math.PI);*/
		
/*		Scanner sc=new Scanner(System.in);
		System.out.println("请输入客户类型：1普通，2会员");
		int type=sc.nextInt();
		System.out.println("请输入购物金额：");
		int money=sc.nextInt();
		
		switch(type)
		{
		case 1:
			if(money>=100){
				int jine=(int)(money*0.9);
				System.out.println("普通打9折"+jine);
			}else {
				System.out.println("普通不打折"+money);
			}
			break;
		
		case 2:
			if(money>=200){
				int jine=(int)(money-(money*0.075));
				System.out.println("会员打9折"+jine);
			}else {
				System.out.println("会员不打折"+money);
			}
		break;
		
		default:
			System.out.println("你是外星人吧？");
		}*/
		
/*		if(type==1 && money>=100)
		{
			int jine=(int)(money*0.9);
			System.out.println("普通打9折"+jine);
		}else if(type==1 && money<100){
			System.out.println("普通不打折"+money);
		}
		
		if(type==2 && money>=200)
		{
			int jine=(int)(money-(money*0.075));
			System.out.println("会员打9折"+jine);
		}else if(type==2 && money<200){
			System.out.println("会员不打折"+money);
		}*/
		
/*		long money=10000000;
		if(money>=5000000)
		{
			System.out.println("凯迪拉克");	
		}else if (money>=1000000) {
			System.out.println("帕萨特");
		}else if(money>=500000)	{
			System.out.println("卡罗拉");
		}else if(money>=100000)	{
			System.out.println("奥托");
		}else {
			System.out.println("四驱赛车+四节南孚电池");
		}*/
		
/*		int i=4;
		switch(i)
		{
		case 1:
			System.out.println("奖励500块钱");
			break;
		
		case 2:
			System.out.println("奖励300块钱");
			break;
			
		case 3:
			System.out.println("奖励100块钱");
			break;
			
		case 4:
			System.out.println("往后要加上晚自习");
			break;
		}
			*/
			
		//随机生成字母
/*		char c=(char)(int)(Math.random()*26+97);
		System.out.println(c);
		
		switch(c){
		case 'a':
			System.out.println("元音字母");
			break;
		case 'e':
			System.out.println("元音字母");
			break;
		case 'i':
			System.out.println("元音字母");
			break;
		case 'o':
			System.out.println("元音字母");
			break;
		case 'u':
			System.out.println("元音字母");
			break;
			
		case 'y':
			System.out.println("半元音字母");
			break;
		case 'w':
			System.out.println("半元音字母");
			break;
			
			default:
				System.out.println("辅音字母");
		}*/
		
		/*
		 * Switch和if嵌套使用
		 */
/*		Scanner sc=new Scanner(System.in);
		System.out.println("请输入仓位，1表示头等舱，2表示经济舱");
		int Positions=sc.nextInt();
		System.out.println("请输入月份，4-10月为旺季，其他月份为淡季");
		int month=sc.nextInt();
		
		switch(Positions)
		{
		//头等舱
		case 1:
			//头等舱旺季
			if(month>=4 && month<=10)
			{
				int money=(int)(5000*0.9);
				System.out.println("头等舱+旺季："+money);
				break;
			//头等舱淡季
			}else{
				int money=(int)(5000*0.5);
				System.out.println("头等舱+淡季："+money);
				break;
			}
			
		//经济舱
		case 2:
			//经济舱旺季
			if(month>=4 && month<=10)
			{
				int money=(int)(5000*0.8);
				System.out.println("经济舱+旺季："+money);
				break;
			//经济舱淡季
			}else{
				int money=(int)(5000*0.4);
				System.out.println("经济舱+淡季："+money);
				break;
			}
				
		default:
			System.out.println("外星人来啦");
		}*/
		
		
		/**
		 * 用while和for循环分别计算100以内奇数和偶数的和，并输出。
		 */
		//while循环
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
		System.out.println("偶数和"+oushusum);
		System.out.println("奇数和"+jishusum);

		
		//for循环
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
		System.out.println("偶数和是："+oushusum);
		System.out.println("奇数和是："+jishusum);*/
		
		/**
		 * 用while和for循环输出1-1000之间能被5整除的数，且每行输出3个
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
		 * 循环录入某学生5门课的成绩并且计算平均分,如果分数录入为负数,重新录入
		 */
/*		double sum=0;
		double avg=0;
		
		for(int i=1;i<=5;i++)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("请输入第"+i+"门成绩：");
			double score=sc.nextDouble();
			if(score<0)
			{
				System.out.println("分数为负数，重新录入");
				
				//如果算错，则置为0，重新计算
				i=0;
				sum=0;
				avg=0;
				score=0;
			}
			sum+=score;
		}
		avg=sum/5;
		System.out.println("总成绩："+sum);
		System.out.println("平均分："+avg);
*/
		
//		编程求：1！+2！+……+10!
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
		 *九九乘法表 
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
		 * 生成0-100随机数，直到生成88为止，停止循环
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
		 * 把100~150之间不能被3整除的数输出
		 */
/*		for(int i=100;i<=150;i++){
			if(i%3!=0)
			{
				System.out.print(i+" ");
			}
		}*/
		
		
		
	}
}




