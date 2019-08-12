package A17;

import java.util.Scanner;

public class AA17 {

	public static void main(String[] args) {
		
		/*int a=3;
		int b=5;
		int c=6;
		int max=a>b? a:b ;
		int max2=b>c? b:c;
		
		System.out.print("最大数为："+max);
		
		*/
		
		/*Scanner sc=new Scanner(System.in);
		while(true){
		System.out.print("请任意输入一个数");
		int a=sc.nextInt();
		int b=2;
		String c=a%b==0 ?  "是偶数\n":"是基数\n";
		System.out.print(c);*/
		
		/*System.out.print("请任意输入一个数字");
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		a=a%2;
		String b=a!=0 ?  "是偶数" :"是基数";
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
		System.out.print("请任意输入一个数");
		double a =sc.nextDouble();
		if(a%2==0){
			System.out.println(a+"是偶数");
		}
		else{
			System.out.println(a+"是奇数");
		}
		}*/
		//三个数求最大值
		/*int a = 10;
		int b = 8;
		int c = 12;
		if (a > b && a > c) {
			System.out.print("最大数为：" + a);
		} else if (b > c) {
			System.out.print("最大数为：" + b);
		} else {
			System.out.print("最大数为：" + c);
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
			System.out.println("您选择的课程是java");

			break;

		case 2:
			System.out.println("您选择的课程是sql");

			break;

		case 3:
			System.out.println("您选择的课程是mysql");

			break;

		default:
			System.out.println("没有您选择的课程");
			break;

		}

	}

}

		
	
