package work3;

//import java.util.Scanner;

// �ϻ���ϰ1
/*
 * public class Work3 { public static void main(String[] args) { Scanner
 * input=new Scanner(System.in); System.out.println("�������ع���ϵͳ>���˳齱");
 * System.out.println("\n��������λ��Ա��:"); int custNo=input.nextInt(); int
 * bw=custNo/100%10; int random=(int)(Math.random()*10);
 * if(bw==random){System.out.println(custNo+"�ͻ��������û�����þ���Mp3һ��"); }else{
 * System.out.println(custNo+"�ͻ���лл���֧��"); } input.close(); }
 * 
 * }
 */

// �ϻ���ϰ2
/*
 * public class Work3 { public static void main(String[] ages) { Scanner input =
 * new Scanner(System.in); System.out.println("�������ع������ϵͳ>�ͻ�������Ϣ>��ӿͻ���Ϣ");
 * System.out.print("\n�������Ա��<4λ����>:"); int custNo = input.nextInt();
 * System.out.print("�������Ա���գ���/������λ���ֱ�ʾ����"); String custBirth = input.next();
 * System.out.print("��������֣�"); int custScore = input.nextInt(); if (custNo >=
 * 1000 && custNo < 10000) { System.out.println("��¼��Ļ�Ա��Ϣ��" + "\n" + custNo +
 * "\t" + custBirth + "\t" + custScore); } else { System.out.println("��Ϣ¼��ʧ��");
 * } input.close(); } }
 */
// �ϻ���ϰ3
/*
 * public class Work3 { public static void main(String[] ages) { Scanner input =
 * new Scanner(System.in); System.out.print("�������Ƿ��ǻ�Ա���ǣ�y��/�������ַ���"); String ans
 * = input.next(); System.out.print("������:"); double money = input.nextDouble();
 * if (ans.equals("y")) { if (money >= 200) { double pay = money * 0.75;
 * System.out.println("ʵ��֧��:" + pay); } else { double pay = money * 0.8;
 * System.out.println("ʵ��֧����" + pay); } } else { if (money > 100) { double pay =
 * money * 0.9; System.out.println("ʵ��֧����" + pay); } else { double pay = money;
 * System.out.println("ʵ��֧��" + pay); } input.close(); }
 * 
 * } }
 */
// �ϻ���ϰ4
/*
 * public class Work3{ public static void main(String[]ages){ Scanner input=new
 * Scanner(System.in); System.out.print("�������Ա���֣�"); int score=input.nextInt();
 * if(score>=8000){System.out.println("�û�Ա���ܵ��ۿ��ǣ�����"); }else
 * if(score<8000&&score>=4000){System.out.println("�û�Ա���ܵ��ۿ��ǣ�����"); }else
 * if(score<4000&&score>=2000){System.out.println("�û�Ա���ܵ��ۿ��ǣ�����"); } else
 * {System.out.println("�û�Ա���ܵ��ۿ��Ǿ���"); } input.close(); } }
 */
// �κ�ϰ��1
/*
 * public class Work3{ public static void main(String[]ages){ Scanner input=new
 * Scanner(System.in); System.out.print("���������ͬ������"); char
 * name=input.next().charAt(0); System.out.print("������������룺"); int
 * password=input.nextInt();
 * if(name=='��'&&password==123){System.out.println("��ӭ�㣺��");
 * 
 * }else{ System.out.println("�Բ��� �㲻����"); } input.close(); }
 * 
 * }
 */
// �κ�ϰ��2
/*
 * public class Work3 { public static void main(String[] ages) { Scanner input =
 * new Scanner(System.in); System.out.print("������������䣺");
 * 
 * int age = input.nextInt();
 * 
 * if (age >= 7) { System.out.println("�����������");
 * 
 * } else { System.out.print("����������Ա�"); String sex = input.next(); if (age >=
 * 5 && sex.contentEquals("��")) { System.out.println("�ܰ�������");
 * 
 * } else { System.out.println("�᲻��������"); } } input.close(); } }
 */
// �κ�ϰ����

/*
 * public class Work3 { public static void main(String[] ages) { Scanner input =
 * new Scanner(System.in); int x = input.nextInt(); int y = input.nextInt(); int
 * z = input.nextInt(); int a = x; int b = y; int c = z; int m = 0;
 * System.out.println("�����������Ϊ��" + a + "," + b + "," + c); if (a > b) { m = a; a
 * = b; b = c; } if (a > c) { m = a; a = c; c = m;
 * 
 * } if (b > c) { m = b; b = c; c = m;
 * 
 * } System.out.println("����������ǣ�" + a + "," + b + "," + c);
 * 
 * input.close();
 * 
 * } }
 */

// �κ�ϰ����
/*
 * public class Work3{ public static void main(String[]ages){ Scanner input=new
 * Scanner(System.in); System.out.print("�ڼ�������һ������:"); int
 * integer=input.nextInt();
 * if(integer%3==0||integer%5==0){System.out.println("��������3��5�ı���");
 * 
 * }else{System.out.println("���������Ա�3��5�κ�һ��������");
 * 
 * } input.close(); } }
 */
// �κ�ϰ����
/*
 * public class Work3{ public static void main(String[]ages){ Scanner input=new
 * Scanner(System.in); System.out.print("��������ɺɺ�ĳɼ�:"); int
 * score=input.nextInt(); if(score>=100){System.out.println("�ְ���");
 * 
 * }else if(score>=90){System.out.println("������ʼǱ�");
 * 
 * }else if(score>=60){System.out.println("�������ֻ�");
 * 
 * }else{ System.out.println("û������"); } input.close(); } }
 */
// �κ�ϰ��6

/*
 * public class Work3 { public static void main(String[] ages) { Scanner input =
 * new Scanner(System.in); System.out.print("����������е��·ݣ�"); int price = 5000; int
 * mon = input.nextInt(); System.out.print("������ѡ��ͷ�Ȳջ��Ǿ��òգ�ͷ�Ȳ�����1�����ò�����2��");
 * String cab = input.next(); if (mon >= 4 && mon <= 10) {
 * 
 * if (cab.contentEquals("1")) { double pri = price * 0.9;
 * System.out.print("���Ļ�Ʊ�۸�" + pri);
 * 
 * } else { double pri = price * 0.8; System.out.print("���Ļ�Ʊ�۸�" + pri); }
 * 
 * } else {
 * 
 * if (cab.contentEquals("1")) { double pri = price * 0.5;
 * System.out.print("���Ļ�Ʊ�۸�" + pri);
 * 
 * } else { double pri = price * 0.4; System.out.print("���Ļ�Ʊ�۸�" + pri);
 * 
 * }
 * 
 * } input.close(); } }
 */

/*
 * public class Work3 { public static void main(String[] ages) { Scanner input =
 * new Scanner(System.in); System.out.println("�Ӽ�������������"); int a =
 * input.nextInt(); int b = input.nextInt(); int c = input.nextInt(); int m = 0;
 * if (a > b) { a = b; m = a; b = c;
 * 
 * } if (a > c) { m = a; a = c; c = m;
 * 
 * } if (b > c) { m = b; b = c; c = m;
 * 
 * } System.out.println("�������������" + a + "," + b + "," + c); input.close(); }
 * 
 * }
 */
