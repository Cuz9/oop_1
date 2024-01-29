package model;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		QuanLyCanBo qlcb = new QuanLyCanBo();
		Scanner scanner = new Scanner(System.in);
		int choice;
		do {
			System.out.println("MENU:");
			System.out.println("1. Them can bo.");
			System.out.println("2. Tim theo ten.");
			System.out.println("3. Hien thi can bo.");
			System.out.println("4. Thoat.");
			System.out.print("Nhap lua chon cua ban: ");
			choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 1:
				qlcb.Add();
				break;
			case 2:
				System.out.print("Nhap ho ten can tim: ");
				String searchName = scanner.nextLine();
				qlcb.Search(searchName);
				break;
			case 3:
				qlcb.Show();
				break;
			case 4:
				System.out.println("Da thoat.");
				break;
			default:
				System.out.println("Lua chon sai.");
			}
		} while (choice != 4);
		scanner.close();
	}

}
