package lianxi;

import java.util.Scanner;

public class Classwork {

	public static void main(String[] args) {
		/*
		 * int num = 2; int sum = 0; while (num <= 100) { sum = sum + num; num =
		 * num + 2;
		 * 
		 * } System.out.println("100����ż����Ϊ��" + sum);
		 */
		/*
		 * System.out.println("MyShopping����ϵͳ>�������"); System.out.println(
		 * "**************************************************");
		 * System.out.println("��ѡ�������Ʒ��ţ�\n1.T��\t2.������\t3.������");
		 * System.out.println(
		 * "***************************************************"); Scanner input
		 * = new Scanner(System.in);
		 * 
		 * 
		 * String answer = "y"; while ("y".contentEquals(answer)) {
		 * System.out.println("��������Ʒ��ţ�"); int num = input.nextInt();
		 * 
		 * switch (num) { case 1: System.out.println("T��\t��245.0");
		 * 
		 * break; case 2: System.out.println("������\t��570.0");
		 * 
		 * break; case 3: System.out.println("������\t��320.0");
		 * 
		 * break;
		 * 
		 * default:System.out.println("����������"); break;
		 * 
		 * } System.out.println("�Ƿ������y/n��"); answer = input.next();
		 * 
		 * } System.out.println("�������");
		 */

		/*
		 * System.out.println("********************");
		 * 
		 * System.out.println("��ѡ�������Ʒ��ţ�");
		 * System.out.println("1.T��(��245.0)  ����Ь(��570.0)  ������(��500.0)");
		 * System.out.println("********************");
		 * 
		 * double total = 0; String d; do { System.out.print("��������Ʒ��ţ�");
		 * Scanner input = new Scanner(System.in); int a = input.nextInt();
		 * 
		 * switch (a) {
		 * 
		 * case 1: System.out.print("�����빺��������"); int b = input.nextInt(); double
		 * c = 245 * b; System.out.println("T����245.0  ����:" + b + "  " + "�ϼ�:" +
		 * c); total = total + c;
		 * 
		 * break; case 2: System.out.print("�����빺��������"); b = input.nextInt(); c =
		 * 570 * b; System.out.println("T����245.0  ����:" + b + "  " + "�ϼ�:" + c);
		 * total = total + c; break; case 3: System.out.print("�����빺��������"); b =
		 * input.nextInt(); c = 500 * b; System.out.println("T����245.0  ����:" + b
		 * + "  " + "�ϼ�:" + c); total = total + c; break;
		 * 
		 * default:System.out.println("���������Ʒ������"); break; }
		 * System.out.print("�Ƿ����(y/n)"); d = input.next();
		 * System.out.println(); } while (d.equals("y")); double m = total *
		 * 0.8; System.out.println("�ۿۣ�0.8"); System.out.println("Ӧ����" + m);
		 * System.out.print("ʵ�ʽ�"); Scanner input = new Scanner(System.in);
		 * int x = input.nextInt(); System.out.println(); double p = x - m;
		 * System.out.println("��Ǯ��" + p);
		 */

		/*
		 * System.out.println("��ӭʹ��MyShopping����ϵͳ");
		 * System.out.println("**************************************");
		 * System.out.println("\t1.�ͻ�����ϵͳ\n\t2.�������\n\t3.�������\n\t4.ע��"); Scanner
		 * input = new Scanner(System.in); System.out.print("��ѡ���������֣�"); boolean
		 * pl; pl = true; do {
		 * 
		 * int num = input.nextInt(); switch (num) {
		 * 
		 * case 1: System.out.println("�ͻ���Ϣ����"); System.out.println("�������");
		 * break; case 2: System.out.println("�������");
		 * System.out.println("�������"); break; case 3:
		 * System.out.println("�������"); System.out.println("�������"); break; case
		 * 4: System.out.println("ע��"); System.out.println("�������"); break;
		 * default: System.out.println("�����������������룺"); pl = false; break;
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
		 * System.out.println("������һ������"); int num = input.nextInt(); int max =
		 * num; int min = num;
		 * 
		 * do {System.out.println("������һ������"); num = input.nextInt();
		 * 
		 * if (max < num) { max = num; }
		 * 
		 * if (min > num&&num!=0) { min = num; }
		 * 
		 * } while (!(num == 0)); System.out.println("���ֵ" + max + "��Сֵ" + min);
		 */
		/*
		 * Scanner input=new Scanner(System.in);
		 * 
		 * int num=0;
		 * 
		 * do{System.out.println("��ѡ�����֣�"); num=input.nextInt(); switch(num){
		 * 
		 * case 1:System.out.println("������MON"); break; case
		 * 2:System.out.println("������TUE"); break; case
		 * 3:System.out.println("������WED"); break; case
		 * 4:System.out.println("������THU"); break; case
		 * 5:System.out.println("������FRI"); break; case
		 * 6:System.out.println("������SAT"); break; case
		 * 7:System.out.println("������SUN"); break;
		 * default:if(num!=0){System.out.println("�����������������");
		 * 
		 * }
		 * 
		 * }
		 * 
		 * }while(num!=0);System.out.println("�������");
		 */
		/*
		 * int num=0; int sum=0; while(num<=100){ sum=sum+num; num++;
		 * }System.out.println("���Ϊ��"+sum);
		 */
		/*
		 * int num = 1; int sum = 1; while (num <= 10) { sum = sum*num; num++; }
		 * System.out.println("���Ϊ" + sum);
		 */
		/*
		 * double x=0.0008;
		 * 
		 * int n=0; while(x<=8848.13){ x=x*2;
		 * 
		 * n++;
		 * 
		 * }System.out.println("һ�����۶��ٴ�"+n);
		 */
		/*
		 * Scanner input=new Scanner(System.in);
		 * System.out.println("������һ����������"); int num=input.nextInt(); int num1=0;
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
		System.out.print("����һ����������");
		int num = input.nextInt();
		int num1 = 0;
		do {
			num1 = num % 10;
			System.out.print(num1);
			num = num / 10;

		} while (num != 0);*/

		/*
		 * Scanner input = new Scanner(System.in); System.out.println("������ݣ�");
		 * int year = input.nextInt(); System.out.println("�����·ݣ�"); int month =
		 * input.nextInt(); int sum = 0;
		 * 
		 * for (int i = 1900; i < year; i++) { if ((i % 4 == 0 && i % 100 != 0)
		 * || (i % 400 == 0)) { sum += 366; } else { sum += 365; } }
		 * 
		 * 
		 * for (int i = 1; i <= month; i++) { if (i == 1 || i == 3 || i == 5 ||
		 * i == 7 || i == 8) { sum += 31; } else if (i == 2) { if (year % 4 == 0
		 * && year % 100 != 0 || year % 400 == 0) { sum += 29; } else { sum +=
		 * 28; } } else { sum += 30; } } System.out.println("����1900��1��1�յ������ǣ�" +
		 * sum);
		 */
	}
}
