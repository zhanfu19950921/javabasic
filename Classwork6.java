package lianxi;

import java.util.Scanner;

public class Classwork6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		 * System.out.println("我行我素购物系统》用户登录");
		 * 
		 * int count=3; for (int i = 0; i < 3; i++) {
		 * System.out.println("请输入用户名"); String usename=input.next();
		 * System.out.println("请输入密码："); String password=input.next();
		 * if(usename.contentEquals("占富")&&password.contentEquals("123456")){
		 * System.out.println("登录成功，欢迎占富登录我行我素购物管理系统"); }else{
		 * System.out.println("用户名或者密码错误，你还有"+--count+"次输入机会"); }
		 * }System.out.println("欢迎使用我行我素系统");
		 */
		/*
		 * int count = 0; for (int i = 1; i <= 10; i++) {
		 * System.out.print("请输入第"+i+"名顾客的年龄:"); int year=input.nextInt();
		 * if(year>30){ count++; }
		 * }System.out.println("30岁以下的年龄比例"+count/10.0*100+"%");
		 * System.out.println("30岁及以上的年龄比例"+(1-count/10.0)*100+"%");
		 */
		/*
		 * int num=0; String bir; int score=0; for (int i = 1; i <=3; i++) {
		 * System.out.print("请输入会员号《四位整数》："); num=input.nextInt();
		 * if(num<1000||num>9999){ System.out.println("输入错误！！！录入信息失败。");
		 * continue; } System.out.print("请输入会员生日："); bir=input.next();
		 * System.out.print("请输入会员积分"); score=input.nextInt();
		 * System.out.println("你录入的会员信息是"+num+"\t"+bir+"\t"+score); }
		 * System.out.println("程序结束");
		 */
		/*int sum = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.print("请输入第" + i + "次学习时间：");
			int time = input.nextInt();
			if (time < 0 || time > 24) {
				System.out.println("不符合实际");
				break;

			}
			sum = sum + time;

		}
		double avg = sum / 5;
		System.out.println("周一至周五的平均学习时间：" + avg);*/
		
		/*int RabbitNum;
		for (int chookNum=0;chookNum>=0&&chookNum<=35 ;chookNum++) {
			
			RabbitNum=35-chookNum;
			if(chookNum*2+RabbitNum*4==94){
			System.out.println("鸡有"+chookNum+"兔有"+RabbitNum);}
			}*/
		/*System.out.println("FlipFlop小游戏");
		for (int i = 1; i <= 100; i++) {
			if(i%3==0){System.out.println("Flip");
			}
			else if(i%5==0){System.out.println("Flop");
			}
			else if(i%3==0&&i%5==0){System.out.println("Flipflop");	
			}
			else if(!(i%3==0&&i%5==0)){System.out.println(i);
				
			}
			
		}*/
		/*int woman=0;int kid=0;
		for (int man = 0; man <=10&&man>=0 ; man++) {
			woman=20-2*man;
			kid=30-woman-man;
			System.out.println("man有:\t"+man+"woman有:\t"+woman+"kid有:\t"+kid);
		}*/
		/*int num; int num1; int num2;
		for (int i = 100; i < 999; i++) {	
		num=i%10;
		
		num1=i/10%10;
		
		num2=i/100%10;
		if(i==num*num*num+num1*num1*num1+num2*num2*num2){
			System.out.println(i);
		}
			
		}*/
	/*System.out.print("请输入一个正整数：");
	int num=input.nextInt();boolean pd=true;
	for (int i = 2; i <num; i++) {
		if(num%i==0){
		pd=false;
			break;
		}
	}
	if(pd=false){
		System.out.println(+num+"不是质数");
		}else{
			System.out.println(+num+"是质数");
		}*/
		/*int n=0;boolean pd=true;
		for (int i=0;i<=7; ) {
		i=i+3;
		if(i>=7){
			pd=true; break;
			}
		i=i-2;
		n++;

		}	if(pd=true){
			System.out.println("一共花了"+(n+1)+"天爬出了深井");
		}else{System.out.println("一共花了"+n+"天爬出了深井");}*/
		/*int a=2; int s=0;
		for (int i = 0; i< 7; i++) {
			a=a*10+2;
			s=s+a;
			
		}System.out.println("前八项是"+s);*/
		
	}
}
