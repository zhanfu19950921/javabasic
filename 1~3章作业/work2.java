package work2;
//import java.util.Scanner;

public class work2 {

	// 上机练习1
	
	 /*public static void main(String[] args) { int shirtPrice=245; int
	  shoePrice=570; int padPrice=320; int shirtNo=2; int shoeNo=1; int
	  padNo=1; double discount=0.8; double
	  finalPay=(shirtPrice*shirtNo+shoePrice*shoeNo+padPrice*padNo)*discount;
	  System.out.println("消费总金额"+finalPay);
	  
	  }*/
	 
	// 上机练习2
	/*
	 * public static void main(String[] args){ int shirtPrice=245; int
	 * shoePrice=570; int padPrice=320; int shirtNo=2; int shoeNo=1; int
	 * padNo=1; double discount=0.8; double
	 * finalPay=(shirtPrice*shirtNo+shoePrice*shoeNo+padPrice*padNo)*discount;
	 * double returnMoney=1500-finalPay; int score=(int)finalPay*3/100;
	 * System.out.println(
	 * "************消费单***********\n购买物品\t单价\t个数\t金额\nT恤\t￥245\t2\t￥490\n网球鞋\t￥570\t1\t￥570\n网球拍\t￥320\t1\t￥320"
	 * ); System.out.println("\n\n折扣：8折"); System.out.println("消费总金额"+finalPay);
	 * System.out.println("实际交费：￥1500"); System.out.println("找钱："+returnMoney);
	 * System.out.println("本次购物所获得的积分"+score); }
	 */
	// 上机练习3

	/*
	 * public static void main(String[] args){ Scanner input=new
	 * Scanner(System.in); System.out.println("请输入四位会员卡号："); int
	 * num1=input.nextInt(); int gw=num1%10; int sw=num1/10%10; int
	 * bw=num1/100%10; int qw=num1/1000; int all=gw+sw+bw+qw;
	 * System.out.println("会员卡号"+num1+"各位之和"+all); boolean dk=all>20;
	 * System.out.println("是否为幸运顾客？"+dk); input.close();
	 * 
	 * }
	 */

	// 上机练习4
	/*
	 * public static void main(String[] args) { Scanner input = new
	 * Scanner(System.in); System.out.println("请输入折扣："); double score =
	 * input.nextDouble();
	 * 
	 * int shirtPrice = 245; int shoePrice = 570; int padPrice = 320; double
	 * shirtPricedis=shirtPrice*score; double shoePricedis=shoePrice*score;
	 * double padPricedis=padPrice*score; boolean dk=shirtPricedis<100; boolean
	 * dk1=shoePricedis<100; boolean dk2=shoePricedis<100;
	 * System.out.println("T恤折扣价格低于100？"+dk);
	 * System.out.println("网球鞋折扣价格低于100？"+dk1);
	 * System.out.println("网球拍折扣价格低于100？"+dk2); input.close();
	 * 
	 * 
	 * }
	 */

	// 课后习题1

	/*
	 * public static void main(String[] args) { int first = 10; int second = 8;
	 * 
	 * 
	 * 
	 * 
	 * System.out.println("输出互换前手中的纸牌："); System.out.println("左手中的纸牌" + first);
	 * System.out.println("右手中的纸牌" + second); int third=first; first=second;
	 * second=third; System.out.println("输出互换后的纸牌：");
	 * 
	 * System.out.println("左手中的纸牌" + first);
	 * 
	 * System.out.println("右手中的纸牌" + second); }
	 */

	// 课后习题2
	/*
	 * public static void main(String[] args) { Scanner input=new
	 * Scanner(System.in); double t=input.nextDouble();
	 * System.out.println("请输入华氏温度"+t); double y=5/9.0*(t-32);
	 * System.out.println("摄氏度为为:"+y); System.out.println("\n华式度为："+t);
	 * System.out.println("摄氏度为："+y); input.close();
	 * 
	 * }
	 */
	// 课后习题3

	/*public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double capital = input.nextDouble();
		System.out.println("请输入本金" + capital);
		System.out.println("本金为" + capital);
		double one = capital * (1 + 0.025);
		double two = capital * 0.027 * 2 + capital;
		double three = capital * 0.0324 * 3 + capital;
		double five = capital * 0.036 * 5 + capital;
		System.out.println("存取一年后的本息" + one);
		System.out.println("存取两年后的本息" + two);
		System.out.println("存取三年后的本息" + three);
		System.out.println("存取四年后的本息" + five);
		input.close();
	}*/

}
