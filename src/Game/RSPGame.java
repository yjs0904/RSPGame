package Game;

import java.util.Scanner;
import java.util.Random;

public class RSPGame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		String[] str =new String[] {"����","����","��"};
		
		int user, com;
		int score = 0;
		int score1 = 0;
		System.out.println("���� | �÷��̾�: "+ score + ", ��ǻ��: "+ score1);
		while(true) {		
		System.out.println("--------------------------");
		System.out.println("���� :1");
		System.out.println("���� :2");
		System.out.println("��   :3");
		System.out.println("����: 4");
		System.out.println("--------------------------\n");
		
		user=sc.nextInt();
		if(user < 0 || 4< user) {
			System.out.println("�� �� ����\n");
			System.out.println("���� | �÷��̾�: "+ score +", ��ǻ��: "+ score1);
			continue;
		}
		if(user==4) {

			System.out.println("���� | �÷��̾�: "+ score + ", ��ǻ��: "+ score1+ "\n");
			continue;
		}
		if(user==0) {			
			break;
		}
		
		com = rand.nextInt(3)+1;		
		if(user==1 && com==2) {
			System.out.println("\n�÷��̾�: "+str[user-1]+", ��ǻ��: "+str[com-1]);
			System.out.println("��ǻ���� �¸�\n");
			score1 += 1;
		}
		else if(user==2 && com==3) {
			System.out.println("\n�÷��̾�: "+str[user-1]+", ��ǻ��: "+str[com-1]);
			System.out.println("��ǻ���� �¸�\n");
			score1 += 1;
		}
		else if(user==3 && com==1) {
			System.out.println("\n�÷��̾�: "+str[user-1]+", ��ǻ��: "+str[com-1]);
			System.out.println("��ǻ���� �¸�\n");
			score1 += 1;
		}
		else if(user==2 && com==1) {
			System.out.println("\n�÷��̾�: "+str[user-1]+", ��ǻ��: "+str[com-1]);
			System.out.println("�÷��̾��� �¸�\n");
			score += 1;
		}
		else if(user==3 && com==2) {
			System.out.println("\n�÷��̾�: "+str[user-1]+", ��ǻ��: "+str[com-1]);
			System.out.println("�÷��̾��� �¸�\n");
			score += 1;
		}
		else if(user==1 && com==3) {
			System.out.println("\n�÷��̾�: "+str[user-1]+", ��ǻ��: "+str[com-1]);
			System.out.println("�÷��̾��� �¸�\n");
			score += 1;
		}
		else {
			System.out.println("\n�÷��̾�: "+str[user-1]+", ��ǻ��: "+str[com-1]);
			System.out.println("�����ϴ�.\n");
		} 
		}
	}
}