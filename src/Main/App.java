package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
	private Scanner sc;

	public App(Scanner sc) {
		this.sc = sc;
	}

	wiseSaying wiseSaying = new wiseSaying();

	public void run() {
		System.out.println("== 명언 앱 실행 ==");

		int lastId = 1;

		while (true) {
			System.out.print("명령어 ) ");
			String cmd = sc.nextLine().trim();

			if (cmd.equals("종료")) {
				break;
			} else if (cmd.equals("등록")) {
				System.out.print("명언 : ");
				String content = sc.nextLine().trim();
				System.out.print("작가 : ");
				String author = sc.nextLine().trim();
				System.out.printf(lastId + "번 명언이 등록되었습니다.");
				lastId++;
			}if(cmd.equals("목록")) {
				System.out.println("번호 / 작가 / 명언");
				System.out.printf("=");
				
				
			
				
			}
		}

	}

}