package lianxi;

import java.util.Scanner;

public class Classwork6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		/*
		 * System.out.println("�������ع���ϵͳ���û���¼");
		 * 
		 * int count=3; for (int i = 0; i < 3; i++) {
		 * System.out.println("�������û���"); String usename=input.next();
		 * System.out.println("���������룺"); String password=input.next();
		 * if(usename.contentEquals("ռ��")&&password.contentEquals("123456")){
		 * System.out.println("��¼�ɹ�����ӭռ����¼�������ع������ϵͳ"); }else{
		 * System.out.println("�û���������������㻹��"+--count+"���������"); }
		 * }System.out.println("��ӭʹ����������ϵͳ");
		 */
		/*
		 * int count = 0; for (int i = 1; i <= 10; i++) {
		 * System.out.print("�������"+i+"���˿͵�����:"); int year=input.nextInt();
		 * if(year>30){ count++; }
		 * }System.out.println("30�����µ��������"+count/10.0*100+"%");
		 * System.out.println("30�꼰���ϵ��������"+(1-count/10.0)*100+"%");
		 */
		/*
		 * int num=0; String bir; int score=0; for (int i = 1; i <=3; i++) {
		 * System.out.print("�������Ա�š���λ��������"); num=input.nextInt();
		 * if(num<1000||num>9999){ System.out.println("������󣡣���¼����Ϣʧ�ܡ�");
		 * continue; } System.out.print("�������Ա���գ�"); bir=input.next();
		 * System.out.print("�������Ա����"); score=input.nextInt();
		 * System.out.println("��¼��Ļ�Ա��Ϣ��"+num+"\t"+bir+"\t"+score); }
		 * System.out.println("�������");
		 */
		/*int sum = 0;
		for (int i = 1; i <= 5; i++) {
			System.out.print("�������" + i + "��ѧϰʱ�䣺");
			int time = input.nextInt();
			if (time < 0 || time > 24) {
				System.out.println("������ʵ��");
				break;

			}
			sum = sum + time;

		}
		double avg = sum / 5;
		System.out.println("��һ�������ƽ��ѧϰʱ�䣺" + avg);*/
		
		/*int RabbitNum;
		for (int chookNum=0;chookNum>=0&&chookNum<=35 ;chookNum++) {
			
			RabbitNum=35-chookNum;
			if(chookNum*2+RabbitNum*4==94){
			System.out.println("����"+chookNum+"����"+RabbitNum);}
			}*/
		/*System.out.println("FlipFlopС��Ϸ");
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
			System.out.println("man��:\t"+man+"woman��:\t"+woman+"kid��:\t"+kid);
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
	/*System.out.print("������һ����������");
	int num=input.nextInt();boolean pd=true;
	for (int i = 2; i <num; i++) {
		if(num%i==0){
		pd=false;
			break;
		}
	}
	if(pd=false){
		System.out.println(+num+"��������");
		}else{
			System.out.println(+num+"������");
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
			System.out.println("һ������"+(n+1)+"���������");
		}else{System.out.println("һ������"+n+"���������");}*/
		/*int a=2; int s=0;
		for (int i = 0; i< 7; i++) {
			a=a*10+2;
			s=s+a;
			
		}System.out.println("ǰ������"+s);*/
		
	}
}
