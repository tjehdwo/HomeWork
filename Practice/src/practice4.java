import java.util.Scanner;
public class practice4 {


	public static void main(String[] args) {
		/*
		 �� ������ ��� ���� �����ϳ�, 1 �̸��� ���ڰ� �Էµƴٸ� 
		 ��1 �̻��� ���ڸ� �Է����ּ��䡱�� ��µǸ鼭 �ٽ� ����ڰ� ���� �Է��ϵ��� �ϼ���.
		  */
Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��ϼ���.");//�� ���� ���� �Է� �޴´�.
		int num = sc.nextInt(); //����ڷκ��� �Է¹��� �� �ִ� ����
		boolean isTrue = true;
		while(isTrue) { //1. ���Ǹ����
			if(num < 1) {//���� 1 �̸��� ���ڰ� �Էµƴٸ� 
				//��1 �̻��� ���ڸ� �Է����ּ��䡰�� ���
				System.out.println("1 �̻��� ���ڸ� �Է����ּ���.");
			} else { //1 �̻��� ���ڸ� ���´�.
				//1���� �� ���ڱ����� ���ڵ��� ��� ����ϼ���.
				for (int i = 1; i >= 1; i--) {
					System.out.println(i);
				}
				//3. ���� false �����
				isTrue = false;
				break; //if�� switch���� ����� �� �ִ�.
			}
		}
		
	}
}