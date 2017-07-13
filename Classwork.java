package lianxi;

import java.util.Scanner;

public class Classwork {

	public static void main(String[] args) {
		/*
		 * int num = 2; int sum = 0; while (num <= 100) { sum = sum + num; num =
		 * num + 2;
		 * 
		 * } System.out.println("100以内偶数和为：" + sum);
		 */
		/*
		 * System.out.println("MyShopping管理系统>购物结算"); System.out.println(
		 * "**************************************************");
		 * System.out.println("请选择购买的商品编号：\n1.T恤\t2.网球拍\t3.网球拍");
		 * System.out.println(
		 * "***************************************************"); Scanner input
		 * = new Scanner(System.in);
		 * 
		 * 
		 * String answer = "y"; while ("y".contentEquals(answer)) {
		 * System.out.println("请输入商品编号："); int num = input.nextInt();
		 * 
		 * switch (num) { case 1: System.out.println("T恤\t￥245.0");
		 * 
		 * break; case 2: System.out.println("网球拍\t￥570.0");
		 * 
		 * break; case 3: System.out.println("网球拍\t￥320.0");
		 * 
		 * break;
		 * 
		 * default:System.out.println("请重新输入"); break;
		 * 
		 * } System.out.println("是否继续（y/n）"); answer = input.next();
		 * 
		 * } System.out.println("程序结束");
		 */

		/*
		 * System.out.println("********************");
		 * 
		 * System.out.println("请选择购买的商品编号：");
		 * System.out.println("1.T恤(￥245.0)  网球鞋(￥570.0)  网球拍(￥500.0)");
		 * System.out.println("********************");
		 * 
		 * double total = 0; String d; do { System.out.print("请输入商品编号：");
		 * Scanner input = new Scanner(System.in); int a = input.nextInt();
		 * 
		 * switch (a) {
		 * 
		 * case 1: System.out.print("请输入购买数量："); int b = input.nextInt(); double
		 * c = 245 * b; System.out.println("T恤￥245.0  数量:" + b + "  " + "合计:" +
		 * c); total = total + c;
		 * 
		 * break; case 2: System.out.print("请输入购买数量："); b = input.nextInt(); c =
		 * 570 * b; System.out.println("T恤￥245.0  数量:" + b + "  " + "合计:" + c);
		 * total = total + c; break; case 3: System.out.print("请输入购买数量："); b =
		 * input.nextInt(); c = 500 * b; System.out.println("T恤￥245.0  数量:" + b
		 * + "  " + "合计:" + c); total = total + c; break;
		 * 
		 * default:System.out.println("你输入的商品不存在"); break; }
		 * System.out.print("是否继续(y/n)"); d = input.next();
		 * System.out.println(); } while (d.equals("y")); double m = total *
		 * 0.8; System.out.println("折扣：0.8"); System.out.println("应付金额：" + m);
		 * System.out.print("实际金额："); Scanner input = new Scanner(System.in);
		 * int x = input.nextInt(); System.out.println(); double p = x - m;
		 * System.out.println("找钱：" + p);
		 */

		/*
		 * System.out.println("欢迎使用MyShopping管理系统");
		 * System.out.println("**************************************");
		 * System.out.println("\t1.客户管理系统\n\t2.购物结算\n\t3.真情回馈\n\t4.注销"); Scanner
		 * input = new Scanner(System.in); System.out.print("请选择输入数字："); boolean
		 * pl; pl = true; do {
		 * 
		 * int num = input.nextInt(); switch (num) {
		 * 
		 * case 1: System.out.println("客户信息管理"); System.out.println("程序结束");
		 * break; case 2: System.out.println("购物结算");
		 * System.out.println("程序结束"); break; case 3:
		 * System.out.println("真情回馈"); System.out.println("程序结束"); break; case
		 * 4: System.out.println("注销"); System.out.println("程序结束"); break;
		 * default: System.out.println("输入有误，请重新输入："); pl = false; break;
		 * 
		 * }
		 * 
		 * } while (pl ==false);
		 */
		/*
		 * int num=100;
		 * 
		 * while(num>5){
		 * 
		 * num=num-5; System.out.println(num);
		 * 
		 * }
		 */

		/*
		 * int num=0; int sum=0;
		 * 
		 * do{ num++; if(num%7==0){ sum=sum+num;
		 * 
		 * }
		 * 
		 * }while(num<=50); System.out.println(sum);
		 */
		/*
		 * Scanner input = new Scanner(System.in);
		 * 
		 * System.out.println("请输入一个整数"); int num = input.nextInt(); int max =
		 * num; int min = num;
		 * 
		 * do {System.out.println("请输入一个整数"); num = input.nextInt();
		 * 
		 * if (max < num) { max = num; }
		 * 
		 * if (min > num&&num!=0) { min = num; }
		 * 
		 * } while (!(num == 0)); System.out.println("最大值" + max + "最小值" + min);
		 */
		/*
		 * Scanner input=new Scanner(System.in);
		 * 
		 * int num=0;
		 * 
		 * do{System.out.println("请选择数字："); num=input.nextInt(); switch(num){
		 * 
		 * case 1:System.out.println("今天是MON"); break; case
		 * 2:System.out.println("今天是TUE"); break; case
		 * 3:System.out.println("今天是WED"); break; case
		 * 4:System.out.println("今天是THU"); break; case
		 * 5:System.out.println("今天是FRI"); break; case
		 * 6:System.out.println("今天是SAT"); break; case
		 * 7:System.out.println("今天是SUN"); break;
		 * default:if(num!=0){System.out.println("输入错误，请重新输入");
		 * 
		 * }
		 * 
		 * }
		 * 
		 * }while(num!=0);System.out.println("程序结束");
		 */
		/*
		 * int num=0; int sum=0; while(num<=100){ sum=sum+num; num++;
		 * }System.out.println("结果为："+sum);
		 */
		/*
		 * int num = 1; int sum = 1; while (num <= 10) { sum = sum*num; num++; }
		 * System.out.println("结果为" + sum);
		 */
		/*
		 * double x=0.0008;
		 * 
		 * int n=0; while(x<=8848.13){ x=x*2;
		 * 
		 * n++;
		 * 
		 * }System.out.println("一共对折多少次"+n);
		 */
		/*
		 * Scanner input=new Scanner(System.in);
		 * System.out.println("请输入一个正整数："); int num=input.nextInt(); int num1=0;
		 * while(num!=0){ num1=num%10; System.out.print(num1); num=num/10; }
		 */
		/*
		 * int i=1;int sum=0; do{ sum=sum+i; i++;
		 * 
		 * }while(i<=100);System.out.println(sum);
		 */
		/*
		 * int i=1;int sum=1; do{ sum=sum*i; i++;
		 * 
		 * }while(i<=10);System.out.println(sum);
		 */

		/*
		 * double h=0.0008;int n=0; do{ h=h*2; n++; }while(h<=8848.13);
		 * System.out.println(n);
		 */

		/*Scanner input = new Scanner(System.in);
		System.out.print("输入一个正整数：");
		int num = input.nextInt();
		int num1 = 0;
		do {
			num1 = num % 10;
			System.out.print(num1);
			num = num / 10;

		} while (num != 0);*/

		/*
		 * Scanner input = new Scanner(System.in); System.out.println("输入年份：");
		 * int year = input.nextInt(); System.out.println("输入月份："); int month =
		 * input.nextInt(); int sum = 0;
		 * 
		 * for (int i = 1900; i < year; i++) { if ((i % 4 == 0 && i % 100 != 0)
		 * || (i % 400 == 0)) { sum += 366; } else { sum += 365; } }
		 * 
		 * 
		 * for (int i = 1; i <= month; i++) { if (i == 1 || i == 3 || i == 5 ||
		 * i == 7 || i == 8) { sum += 31; } else if (i == 2) { if (year % 4 == 0
		 * && year % 100 != 0 || year % 400 == 0) { sum += 29; } else { sum +=
		 * 28; } } else { sum += 30; } } System.out.println("距离1900年1月1日的天数是：" +
		 * sum);
		 */
	}
}
