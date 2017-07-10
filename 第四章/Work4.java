package work4;

import java.util.Scanner;

//上级练习1
/*public class Work4 {

	public static void main(String[] args) {
		System.out.println("\t欢迎来到我行我素购物管理系统\n\t\t1.登录系统\n\t\t2.退出");
		System.out.println("************************************************");
		System.out.print("请选择：");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		switch (num) {
		case 1:
			System.out.println("1.客户信息管理\n2.购物结算\n3.真情回馈\n4.注销");
			System.out.print("请选择：");
			int num1 = input.nextInt();
			switch (num1) {

			case 1:System.out.println("购物管理系统>客户信息管理\n1.显示所有客户信息\n2.添加客户信息\n3.修改客户信息\n4.查询客户信息");

				break;
			case 2:System.out.print("暂未开通");
				
				break;
			case 3:System.out.println("购物管理系统>真情回馈\n1.幸运大放送\n2.幸运大抽奖\n3.生日问候");
				
				break;
			case 4:System.out.println("暂未开通");
				
				break;

			default:
				System.out.print("输入有误，请重新输入");
				break;
			}

			break;
		case 2:
			System.out.println("谢谢你的使用");

			break;
		default:
			System.out.println("输入有误请重新输入");
			break;
		}input.close();
	}

}*/
//上级练习2
/*
 * public class Work4 {
 * 
 * public static void main(String[] args) { Scanner input = new
 * Scanner(System.in); System.out.print("请输入消费金额："); double money =
 * input.nextDouble(); System.out.println( "是否参加优惠换购活动?\n" +
 * "1：满50元，加2元换购百事可乐饮料1瓶\n" + "2：满100元，加3元换购500ml可乐一瓶\n" +
 * "3：满100元，加10元换购5公斤面粉\n" + "4：满200元，加10元可换购1个苏泊尔炒菜锅\n" +
 * "5：满200元，加20元可换购欧莱雅爽肤水一瓶\n" + "0：不换购\n" + "请选择："); int num = input.nextInt();
 * switch (num) { case 1: if (money >= 50) { System.out.println("本次消费金额：" +(
 * money + 2)); System.out.println("成功换购：一瓶可乐");
 * 
 * } else { System.out.println("你的金额不足"); }
 * 
 * break;
 * 
 * case 2: if (money >= 100) { System.out.println("本次消费金额：" + (money + 3));
 * System.out.println("成功换购：500ml可乐");
 * 
 * } else { System.out.println("你的金额不足"); }
 * 
 * break;
 * 
 * case 3: if (money >= 100) { System.out.println("本次消费金额：" + (money + 10));
 * System.out.println("成功换购：5kg面粉");
 * 
 * } else { System.out.println("你的金额不足"); }
 * 
 * break; case 4: if (money >= 200) { System.out.println("本次消费金额：" +( money +
 * 10)); System.out.println("成功换购：炒菜锅");
 * 
 * } else { System.out.println("你的金额不足"); }
 * 
 * break; case 5: if (money >= 200) { System.out.println("本次消费金额：" +( money +
 * 20)); System.out.println("成功换购：爽肤水");
 * 
 * } else { System.out.println("你的金额不足"); }
 * 
 * break;
 * 
 * case 0: System.out.println("不换购");
 * 
 * break;
 * 
 * default: System.out.println("输入错误，请重新输入"); break; } input.close(); } }
 */
// 简答题2
/*
 * public class Work4 {
 * 
 * public static void main(String[] args) { Scanner input=new
 * Scanner(System.in); System.out.print("请输入今天星期几："); String week=input.next();
 * switch (week) { case "星期一": case "星期三": case "星期五":
 * System.out.println("学习编程"); break; case"星期二": case "星期四": case "星期六":
 * System.out.println("学习英语"); break ; case"星期日": System.out.println("好好休息");
 * break; default: System.out.println("该日期不存在，请重新输入"); break; }
 * 
 * } }
 */
// 简答题3
/*
 * public class Work4 {
 * 
 * public static void main(String[] args) { Scanner input=new
 * Scanner(System.in); System.out.print("请输入刘珊珊的成绩："); int
 * score=input.nextInt(); switch (score/10) { case 10:
 * System.out.println("父亲买车"); break; case 9: System.out.println("妈妈买电脑");
 * break; case 8: case 7: case 6: System.out.println("妈妈买手机"); break; default:
 * System.out.println("没有礼物");
 * 
 * 
 * }input.close();
 * 
 * 
 * 
 * }
 * 
 * }
 */
// 简单题4
/*
 * public class Work4 {
 * 
 * public static void main(String[] args) { Scanner input=new
 * Scanner(System.in); System.out.print("请输入你出行的月份(1~12)："); int
 * mon=input.nextInt(); System.out.print("请输入你选择的机舱：头等舱or经济舱："); String
 * cabin=input.next(); int money=5000; switch(mon){ case 4: case 5: case 6: case
 * 7: case 8: case 9: case 10:
 * if(cabin.contentEquals("头等舱")){System.out.print("您的机票价格为："+money*0.9);
 * 
 * }else
 * if(cabin.contentEquals("经济舱")){System.out.println("您的机票价格为："+money*0.8);
 * 
 * } break; case 1: case 2: case 3: case 11: case 12:
 * if(cabin.contentEquals("头等舱")){System.out.println("您的机票价格："+money*0.5);
 * 
 * }else if(cabin.contentEquals("经济舱")){System.out.println("您的机票价格"+money*0.4);
 * 
 * }break;
 * 
 * }
 * 
 * 
 * } }
 */
/*public class Work4 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double res = 0.0;
		System.out.print("请输入第一个操作数：");
		double num1 = input.nextDouble();

		System.out.print("请选择你的操作符号：");
		char symbol = input.next().charAt(0);
		System.out.print("请输入第二个操作数：");
		
		if (input.hasNextDouble()) {
			
			double num2=input.nextDouble();
			
			switch (symbol) {
			case '+':
				res = num1 + num2;
				break;
			case '-':
				
				res = num1 - num2;
				break;
			case '*':
				res = num1 * num2;
				break;
			case '÷':
				res = num1 / num2;
				break;

			default:
				System.out.println("请输入正确的数字！！！");
				break;

			}
			System.out.print("结果为：" + num1 + "" + symbol + "" + num2 + "=" + res);

		} else {
			System.out.print("请输入正确的代码");

		}

	}
}*/