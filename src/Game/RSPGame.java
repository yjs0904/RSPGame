package Game;

import java.util.Scanner;
import java.util.Random;

public class RSPGame {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		String[] str =new String[] {"가위","바위","보"};
		
		int user, com;
		int score = 0;
		int score1 = 0;
		System.out.println("점수 | 플레이어: "+ score + ", 컴퓨터: "+ score1);
		while(true) {		
		System.out.println("--------------------------");
		System.out.println("가위 :1");
		System.out.println("바위 :2");
		System.out.println("보   :3");
		System.out.println("점수: 4");
		System.out.println("--------------------------\n");
		
		user=sc.nextInt();
		if(user < 0 || 4< user) {
			System.out.println("잘 못 선택\n");
			System.out.println("점수 | 플레이어: "+ score +", 컴퓨터: "+ score1);
			continue;
		}
		if(user==4) {

			System.out.println("점수 | 플레이어: "+ score + ", 컴퓨터: "+ score1+ "\n");
			continue;
		}
		if(user==0) {			
			break;
		}
		
		com = rand.nextInt(3)+1;		
		if(user==1 && com==2) {
			System.out.println("\n플레이어: "+str[user-1]+", 컴퓨터: "+str[com-1]);
			System.out.println("컴퓨터의 승리\n");
			score1 += 1;
		}
		else if(user==2 && com==3) {
			System.out.println("\n플레이어: "+str[user-1]+", 컴퓨터: "+str[com-1]);
			System.out.println("컴퓨터의 승리\n");
			score1 += 1;
		}
		else if(user==3 && com==1) {
			System.out.println("\n플레이어: "+str[user-1]+", 컴퓨터: "+str[com-1]);
			System.out.println("컴퓨터의 승리\n");
			score1 += 1;
		}
		else if(user==2 && com==1) {
			System.out.println("\n플레이어: "+str[user-1]+", 컴퓨터: "+str[com-1]);
			System.out.println("플레이어의 승리\n");
			score += 1;
		}
		else if(user==3 && com==2) {
			System.out.println("\n플레이어: "+str[user-1]+", 컴퓨터: "+str[com-1]);
			System.out.println("플레이어의 승리\n");
			score += 1;
		}
		else if(user==1 && com==3) {
			System.out.println("\n플레이어: "+str[user-1]+", 컴퓨터: "+str[com-1]);
			System.out.println("플레이어의 승리\n");
			score += 1;
		}
		else {
			System.out.println("\n플레이어: "+str[user-1]+", 컴퓨터: "+str[com-1]);
			System.out.println("비겼습니다.\n");
		} 
		}
	}
}