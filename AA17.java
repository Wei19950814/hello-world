package A17;

import java.util.Scanner;

public class AA17 {

	public static void main(String[] args) {
		
		/*int a=3;
		int b=5;
		int c=6;
		int max=a>b? a:b ;
		int max2=b>c? b:c;
		
		System.out.print("�����Ϊ��"+max);
		
		*/
		
		/*Scanner sc=new Scanner(System.in);
		while(true){
		System.out.print("����������һ����");
		int a=sc.nextInt();
		int b=2;
		String c=a%b==0 ?  "��ż��\n":"�ǻ���\n";
		System.out.print(c);*/
		
		/*System.out.print("����������һ������");
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		a=a%2;
		String b=a!=0 ?  "��ż��" :"�ǻ���";
		System.out.print(b);*/
		
		/*int a = 10;
		int b = 12;
		if (a < b) {
			System.out.print(a);
		} else {
			System.out.print(b);
			

		}
*/
		/*Scanner sc=new Scanner(System.in);
		while(true){
		System.out.print("����������һ����");
		double a =sc.nextDouble();
		if(a%2==0){
			System.out.println(a+"��ż��");
		}
		else{
			System.out.println(a+"������");
		}
		}*/
		//�����������ֵ
		/*int a = 10;
		int b = 8;
		int c = 12;
		if (a > b && a > c) {
			System.out.print("�����Ϊ��" + a);
		} else if (b > c) {
			System.out.print("�����Ϊ��" + b);
		} else {
			System.out.print("�����Ϊ��" + c);
		}
*/
		
		System.out.println("*************");
		System.out.println("1.java");
		System.out.println("2.sql");
		System.out.println("3.mysql");
		System.out.println("*************");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		switch (i) {
		case 1:
			System.out.println("��ѡ��Ŀγ���java");

			break;

		case 2:
			System.out.println("��ѡ��Ŀγ���sql");

			break;

		case 3:
			System.out.println("��ѡ��Ŀγ���mysql");

			break;

		default:
			System.out.println("û����ѡ��Ŀγ�");
			break;

		}

	}

}

		
	
