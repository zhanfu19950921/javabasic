package work2;
//import java.util.Scanner;

public class work2 {

	// �ϻ���ϰ1
	
	 /*public static void main(String[] args) { int shirtPrice=245; int
	  shoePrice=570; int padPrice=320; int shirtNo=2; int shoeNo=1; int
	  padNo=1; double discount=0.8; double
	  finalPay=(shirtPrice*shirtNo+shoePrice*shoeNo+padPrice*padNo)*discount;
	  System.out.println("�����ܽ��"+finalPay);
	  
	  }*/
	 
	// �ϻ���ϰ2
	/*
	 * public static void main(String[] args){ int shirtPrice=245; int
	 * shoePrice=570; int padPrice=320; int shirtNo=2; int shoeNo=1; int
	 * padNo=1; double discount=0.8; double
	 * finalPay=(shirtPrice*shirtNo+shoePrice*shoeNo+padPrice*padNo)*discount;
	 * double returnMoney=1500-finalPay; int score=(int)finalPay*3/100;
	 * System.out.println(
	 * "************���ѵ�***********\n������Ʒ\t����\t����\t���\nT��\t��245\t2\t��490\n����Ь\t��570\t1\t��570\n������\t��320\t1\t��320"
	 * ); System.out.println("\n\n�ۿۣ�8��"); System.out.println("�����ܽ��"+finalPay);
	 * System.out.println("ʵ�ʽ��ѣ���1500"); System.out.println("��Ǯ��"+returnMoney);
	 * System.out.println("���ι�������õĻ���"+score); }
	 */
	// �ϻ���ϰ3

	/*
	 * public static void main(String[] args){ Scanner input=new
	 * Scanner(System.in); System.out.println("��������λ��Ա���ţ�"); int
	 * num1=input.nextInt(); int gw=num1%10; int sw=num1/10%10; int
	 * bw=num1/100%10; int qw=num1/1000; int all=gw+sw+bw+qw;
	 * System.out.println("��Ա����"+num1+"��λ֮��"+all); boolean dk=all>20;
	 * System.out.println("�Ƿ�Ϊ���˹˿ͣ�"+dk); input.close();
	 * 
	 * }
	 */

	// �ϻ���ϰ4
	/*
	 * public static void main(String[] args) { Scanner input = new
	 * Scanner(System.in); System.out.println("�������ۿۣ�"); double score =
	 * input.nextDouble();
	 * 
	 * int shirtPrice = 245; int shoePrice = 570; int padPrice = 320; double
	 * shirtPricedis=shirtPrice*score; double shoePricedis=shoePrice*score;
	 * double padPricedis=padPrice*score; boolean dk=shirtPricedis<100; boolean
	 * dk1=shoePricedis<100; boolean dk2=shoePricedis<100;
	 * System.out.println("T���ۿۼ۸����100��"+dk);
	 * System.out.println("����Ь�ۿۼ۸����100��"+dk1);
	 * System.out.println("�������ۿۼ۸����100��"+dk2); input.close();
	 * 
	 * 
	 * }
	 */

	// �κ�ϰ��1

	/*
	 * public static void main(String[] args) { int first = 10; int second = 8;
	 * 
	 * 
	 * 
	 * 
	 * System.out.println("�������ǰ���е�ֽ�ƣ�"); System.out.println("�����е�ֽ��" + first);
	 * System.out.println("�����е�ֽ��" + second); int third=first; first=second;
	 * second=third; System.out.println("����������ֽ�ƣ�");
	 * 
	 * System.out.println("�����е�ֽ��" + first);
	 * 
	 * System.out.println("�����е�ֽ��" + second); }
	 */

	// �κ�ϰ��2
	/*
	 * public static void main(String[] args) { Scanner input=new
	 * Scanner(System.in); double t=input.nextDouble();
	 * System.out.println("�����뻪���¶�"+t); double y=5/9.0*(t-32);
	 * System.out.println("���϶�ΪΪ:"+y); System.out.println("\n��ʽ��Ϊ��"+t);
	 * System.out.println("���϶�Ϊ��"+y); input.close();
	 * 
	 * }
	 */
	// �κ�ϰ��3

	/*public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double capital = input.nextDouble();
		System.out.println("�����뱾��" + capital);
		System.out.println("����Ϊ" + capital);
		double one = capital * (1 + 0.025);
		double two = capital * 0.027 * 2 + capital;
		double three = capital * 0.0324 * 3 + capital;
		double five = capital * 0.036 * 5 + capital;
		System.out.println("��ȡһ���ı�Ϣ" + one);
		System.out.println("��ȡ�����ı�Ϣ" + two);
		System.out.println("��ȡ�����ı�Ϣ" + three);
		System.out.println("��ȡ�����ı�Ϣ" + five);
		input.close();
	}*/

}
