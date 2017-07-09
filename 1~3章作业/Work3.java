package work3;

//import java.util.Scanner;

// 上机练习1
/*
 * public class Work3 { public static void main(String[] args) { Scanner
 * input=new Scanner(System.in); System.out.println("我行我素管理系统>幸运抽奖");
 * System.out.println("\n请输入四位会员号:"); int custNo=input.nextInt(); int
 * bw=custNo/100%10; int random=(int)(Math.random()*10);
 * if(bw==random){System.out.println(custNo+"客户是幸运用户，获得精美Mp3一个"); }else{
 * System.out.println(custNo+"客户，谢谢你的支持"); } input.close(); }
 * 
 * }
 */

// 上机练习2
/*
 * public class Work3 { public static void main(String[] ages) { Scanner input =
 * new Scanner(System.in); System.out.println("我行我素购物管理系统>客户管理信息>添加客户信息");
 * System.out.print("\n请输入会员号<4位整数>:"); int custNo = input.nextInt();
 * System.out.print("请输入会员生日（月/日用两位数字表示）："); String custBirth = input.next();
 * System.out.print("请输入积分："); int custScore = input.nextInt(); if (custNo >=
 * 1000 && custNo < 10000) { System.out.println("已录入的会员消息：" + "\n" + custNo +
 * "\t" + custBirth + "\t" + custScore); } else { System.out.println("信息录入失败");
 * } input.close(); } }
 */
// 上机练习3
/*
 * public class Work3 { public static void main(String[] ages) { Scanner input =
 * new Scanner(System.in); System.out.print("请输入是否是会员：是（y）/否（其他字符）"); String ans
 * = input.next(); System.out.print("购物金额:"); double money = input.nextDouble();
 * if (ans.equals("y")) { if (money >= 200) { double pay = money * 0.75;
 * System.out.println("实际支付:" + pay); } else { double pay = money * 0.8;
 * System.out.println("实际支付：" + pay); } } else { if (money > 100) { double pay =
 * money * 0.9; System.out.println("实际支付：" + pay); } else { double pay = money;
 * System.out.println("实际支付" + pay); } input.close(); }
 * 
 * } }
 */
// 上机练习4
/*
 * public class Work3{ public static void main(String[]ages){ Scanner input=new
 * Scanner(System.in); System.out.print("请输入会员积分："); int score=input.nextInt();
 * if(score>=8000){System.out.println("该会员享受的折扣是：六折"); }else
 * if(score<8000&&score>=4000){System.out.println("该会员享受的折扣是：七折"); }else
 * if(score<4000&&score>=2000){System.out.println("该会员享受的折扣是：八折"); } else
 * {System.out.println("该会员享受的折扣是九折"); } input.close(); } }
 */
// 课后习题1
/*
 * public class Work3{ public static void main(String[]ages){ Scanner input=new
 * Scanner(System.in); System.out.print("请输入你的同户名："); char
 * name=input.next().charAt(0); System.out.print("请输入你的密码："); int
 * password=input.nextInt();
 * if(name=='青'&&password==123){System.out.println("欢迎你：青");
 * 
 * }else{ System.out.println("对不起 你不是青"); } input.close(); }
 * 
 * }
 */
// 课后习题2
/*
 * public class Work3 { public static void main(String[] ages) { Scanner input =
 * new Scanner(System.in); System.out.print("请输入你的年龄：");
 * 
 * int age = input.nextInt();
 * 
 * if (age >= 7) { System.out.println("搬得起来桌子");
 * 
 * } else { System.out.print("请输入你的性别："); String sex = input.next(); if (age >=
 * 5 && sex.contentEquals("男")) { System.out.println("能搬起桌子");
 * 
 * } else { System.out.println("搬不起来桌子"); } } input.close(); } }
 */
// 课后习题三

/*
 * public class Work3 { public static void main(String[] ages) { Scanner input =
 * new Scanner(System.in); int x = input.nextInt(); int y = input.nextInt(); int
 * z = input.nextInt(); int a = x; int b = y; int c = z; int m = 0;
 * System.out.println("输出的三个数为：" + a + "," + b + "," + c); if (a > b) { m = a; a
 * = b; b = c; } if (a > c) { m = a; a = c; c = m;
 * 
 * } if (b > c) { m = b; b = c; c = m;
 * 
 * } System.out.println("输出的数据是：" + a + "," + b + "," + c);
 * 
 * input.close();
 * 
 * } }
 */

// 课后习题四
/*
 * public class Work3{ public static void main(String[]ages){ Scanner input=new
 * Scanner(System.in); System.out.print("在键盘输入一个整数:"); int
 * integer=input.nextInt();
 * if(integer%3==0||integer%5==0){System.out.println("该整数是3或5的倍数");
 * 
 * }else{System.out.println("该数不可以被3或5任何一个数整除");
 * 
 * } input.close(); } }
 */
// 课后习题五
/*
 * public class Work3{ public static void main(String[]ages){ Scanner input=new
 * Scanner(System.in); System.out.print("请输入刘珊珊的成绩:"); int
 * score=input.nextInt(); if(score>=100){System.out.println("爸爸买车");
 * 
 * }else if(score>=90){System.out.println("妈妈买笔记本");
 * 
 * }else if(score>=60){System.out.println("妈妈买手机");
 * 
 * }else{ System.out.println("没有礼物"); } input.close(); } }
 */
// 课后习题6

/*
 * public class Work3 { public static void main(String[] ages) { Scanner input =
 * new Scanner(System.in); System.out.print("请输入你出行的月份："); int price = 5000; int
 * mon = input.nextInt(); System.out.print("请问你选择头等舱还是经济舱？头等舱输入1，经济舱输入2：");
 * String cab = input.next(); if (mon >= 4 && mon <= 10) {
 * 
 * if (cab.contentEquals("1")) { double pri = price * 0.9;
 * System.out.print("您的机票价格：" + pri);
 * 
 * } else { double pri = price * 0.8; System.out.print("您的机票价格：" + pri); }
 * 
 * } else {
 * 
 * if (cab.contentEquals("1")) { double pri = price * 0.5;
 * System.out.print("您的机票价格：" + pri);
 * 
 * } else { double pri = price * 0.4; System.out.print("您的机票价格：" + pri);
 * 
 * }
 * 
 * } input.close(); } }
 */

/*
 * public class Work3 { public static void main(String[] ages) { Scanner input =
 * new Scanner(System.in); System.out.println("从键盘输入三个数"); int a =
 * input.nextInt(); int b = input.nextInt(); int c = input.nextInt(); int m = 0;
 * if (a > b) { a = b; m = a; b = c;
 * 
 * } if (a > c) { m = a; a = c; c = m;
 * 
 * } if (b > c) { m = b; b = c; c = m;
 * 
 * } System.out.println("输出的三个数字" + a + "," + b + "," + c); input.close(); }
 * 
 * }
 */
