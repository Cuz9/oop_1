package nomal;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		QuanLyThuVien quanLySach = new QuanLyThuVien();
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.println("1. Them moi tai lieu");
			System.out.println("2. Xoa tai lieu");
			System.out.println("3. Hien thi thong tin tai lieu");
			System.out.println("4. Tim thong tin theo loai");
			System.out.println("5. Thoat");
			System.out.print("Chon chuc nang: ");
			int choice = scanner.nextInt();
			scanner.nextLine();

			switch (choice) {
			case 1:
				quanLySach.themMoiTaiLieu();
				break;
			case 2:
				System.out.print("Nhap ma tai lieu can xoa: ");
				String maTaiLieuCanXoa = scanner.nextLine();
				quanLySach.xoaTaiLieu(maTaiLieuCanXoa);
				break;
			case 3:
				quanLySach.hienThi();
				break;
			case 4:
				System.out.print("Nhap loai tai lieu can tim kiem (Sach/TapChi/Bao): ");
				String loaiTimKiem = scanner.nextLine();
				quanLySach.timKiemTheoLoai(loaiTimKiem);
				break;
			case 5:
				System.out.println("Thoat chuong trinh.");
				scanner.close();
				return;
			default:
				System.out.println("Chuc nang khong dung.");
			}
		}
	}

}
