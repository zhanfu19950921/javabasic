package work4;

import java.util.Scanner;

//�ϼ���ϰ1
/*public class Work4 {

	public static void main(String[] args) {
		System.out.println("\t��ӭ�����������ع������ϵͳ\n\t\t1.��¼ϵͳ\n\t\t2.�˳�");
		System.out.println("************************************************");
		System.out.print("��ѡ��");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		switch (num) {
		case 1:
			System.out.println("1.�ͻ���Ϣ����\n2.�������\n3.�������\n4.ע��");
			System.out.print("��ѡ��");
			int num1 = input.nextInt();
			switch (num1) {

			case 1:System.out.println("�������ϵͳ>�ͻ���Ϣ����\n1.��ʾ���пͻ���Ϣ\n2.��ӿͻ���Ϣ\n3.�޸Ŀͻ���Ϣ\n4.��ѯ�ͻ���Ϣ");

				break;
			case 2:System.out.print("��δ��ͨ");
				
				break;
			case 3:System.out.println("�������ϵͳ>�������\n1.���˴����\n2.���˴�齱\n3.�����ʺ�");
				
				break;
			case 4:System.out.println("��δ��ͨ");
				
				break;

			default:
				System.out.print("������������������");
				break;
			}

			break;
		case 2:
			System.out.println("лл���ʹ��");

			break;
		default:
			System.out.println("������������������");
			break;
		}input.close();
	}

}*/
//�ϼ���ϰ2
/*
 * public class Work4 {
 * 
 * public static void main(String[] args) { Scanner input = new
 * Scanner(System.in); System.out.print("���������ѽ�"); double money =
 * input.nextDouble(); System.out.println( "�Ƿ�μ��Żݻ����?\n" +
 * "1����50Ԫ����2Ԫ�������¿�������1ƿ\n" + "2����100Ԫ����3Ԫ����500ml����һƿ\n" +
 * "3����100Ԫ����10Ԫ����5�������\n" + "4����200Ԫ����10Ԫ�ɻ���1���ղ������˹�\n" +
 * "5����200Ԫ����20Ԫ�ɻ���ŷ����ˬ��ˮһƿ\n" + "0��������\n" + "��ѡ��"); int num = input.nextInt();
 * switch (num) { case 1: if (money >= 50) { System.out.println("�������ѽ�" +(
 * money + 2)); System.out.println("�ɹ�������һƿ����");
 * 
 * } else { System.out.println("��Ľ���"); }
 * 
 * break;
 * 
 * case 2: if (money >= 100) { System.out.println("�������ѽ�" + (money + 3));
 * System.out.println("�ɹ�������500ml����");
 * 
 * } else { System.out.println("��Ľ���"); }
 * 
 * break;
 * 
 * case 3: if (money >= 100) { System.out.println("�������ѽ�" + (money + 10));
 * System.out.println("�ɹ�������5kg���");
 * 
 * } else { System.out.println("��Ľ���"); }
 * 
 * break; case 4: if (money >= 200) { System.out.println("�������ѽ�" +( money +
 * 10)); System.out.println("�ɹ����������˹�");
 * 
 * } else { System.out.println("��Ľ���"); }
 * 
 * break; case 5: if (money >= 200) { System.out.println("�������ѽ�" +( money +
 * 20)); System.out.println("�ɹ�������ˬ��ˮ");
 * 
 * } else { System.out.println("��Ľ���"); }
 * 
 * break;
 * 
 * case 0: System.out.println("������");
 * 
 * break;
 * 
 * default: System.out.println("�����������������"); break; } input.close(); } }
 */
// �����2
/*
 * public class Work4 {
 * 
 * public static void main(String[] args) { Scanner input=new
 * Scanner(System.in); System.out.print("������������ڼ���"); String week=input.next();
 * switch (week) { case "����һ": case "������": case "������":
 * System.out.println("ѧϰ���"); break; case"���ڶ�": case "������": case "������":
 * System.out.println("ѧϰӢ��"); break ; case"������": System.out.println("�ú���Ϣ");
 * break; default: System.out.println("�����ڲ����ڣ�����������"); break; }
 * 
 * } }
 */
// �����3
/*
 * public class Work4 {
 * 
 * public static void main(String[] args) { Scanner input=new
 * Scanner(System.in); System.out.print("��������ɺɺ�ĳɼ���"); int
 * score=input.nextInt(); switch (score/10) { case 10:
 * System.out.println("������"); break; case 9: System.out.println("���������");
 * break; case 8: case 7: case 6: System.out.println("�������ֻ�"); break; default:
 * System.out.println("û������");
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
// ����4
/*
 * public class Work4 {
 * 
 * public static void main(String[] args) { Scanner input=new
 * Scanner(System.in); System.out.print("����������е��·�(1~12)��"); int
 * mon=input.nextInt(); System.out.print("��������ѡ��Ļ��գ�ͷ�Ȳ�or���òգ�"); String
 * cabin=input.next(); int money=5000; switch(mon){ case 4: case 5: case 6: case
 * 7: case 8: case 9: case 10:
 * if(cabin.contentEquals("ͷ�Ȳ�")){System.out.print("���Ļ�Ʊ�۸�Ϊ��"+money*0.9);
 * 
 * }else
 * if(cabin.contentEquals("���ò�")){System.out.println("���Ļ�Ʊ�۸�Ϊ��"+money*0.8);
 * 
 * } break; case 1: case 2: case 3: case 11: case 12:
 * if(cabin.contentEquals("ͷ�Ȳ�")){System.out.println("���Ļ�Ʊ�۸�"+money*0.5);
 * 
 * }else if(cabin.contentEquals("���ò�")){System.out.println("���Ļ�Ʊ�۸�"+money*0.4);
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
		System.out.print("�������һ����������");
		double num1 = input.nextDouble();

		System.out.print("��ѡ����Ĳ������ţ�");
		char symbol = input.next().charAt(0);
		System.out.print("������ڶ�����������");
		
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
			case '��':
				res = num1 / num2;
				break;

			default:
				System.out.println("��������ȷ�����֣�����");
				break;

			}
			System.out.print("���Ϊ��" + num1 + "" + symbol + "" + num2 + "=" + res);

		} else {
			System.out.print("��������ȷ�Ĵ���");

		}

	}
}*/