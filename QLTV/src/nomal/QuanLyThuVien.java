package nomal;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyThuVien {
	Scanner scanner = new Scanner(System.in);
	private ArrayList<TaiLieu> danhSachTaiLieu;

	public QuanLyThuVien() {
		danhSachTaiLieu = new ArrayList<>();
	}

	private boolean kiemTraMaTaiLieuTonTai(String maTl) {
		for (TaiLieu tl : danhSachTaiLieu) {
			if (tl.maTl.equals(maTl)) {
				return true;
			}
		}
		return false;
	}

	public void themMoiTaiLieu() {

		System.out.println("Nhap loai tai lieu (1: sach; 2: tap chi; 3: bao): ");
		int type = scanner.nextInt();
		scanner.nextLine();
		String maTl;
		boolean nhapLaiMaTl;
		do {
			nhapLaiMaTl = false;
			System.out.print("Nhap ma tai lieu: ");
			maTl = scanner.nextLine();
			if (kiemTraMaTaiLieuTonTai(maTl)) {
				System.out.println("Ma tai lieu da ton tai.");
				nhapLaiMaTl = true;
			}
		} while (nhapLaiMaTl);
		System.out.print("Nhap ten nha xuat ban: ");
		String tenNXB = scanner.nextLine();
		System.out.print("Nhap so ban phat hanh: ");
		int soBanphathanh = scanner.nextInt();
		scanner.nextLine();
		switch (type) {
		case 1:
			System.out.println("Nhap vao ten tac gia: ");
			String tenTG = scanner.nextLine();
			System.out.print("Nhap vao so trang: ");
			int soTrang = scanner.nextInt();
			danhSachTaiLieu.add(new Sach(maTl, tenNXB, soBanphathanh, tenTG, soTrang));
			System.out.println("Them moi sach thanh cong.");
			break;
		case 2:
			System.out.print("Nhap vao so phat hanh: ");
			int soPhatHanh = scanner.nextInt();
			System.out.print("Nhap vao thang phat hanh: ");
			int thangPhatHanh = scanner.nextInt();
			danhSachTaiLieu.add(new TapChi(maTl, tenNXB, soBanphathanh, soPhatHanh, thangPhatHanh));
			System.out.println("Them moi tap chi thanh cong.");
			break;
		case 3:
			System.out.println("Nhap ngay phat hanh: ");
			String ngayPhatHanh = scanner.nextLine();
			danhSachTaiLieu.add(new Bao(maTl, tenNXB, soBanphathanh, ngayPhatHanh));
			System.out.println("Them moi bao thanh cong.");
			break;
		default:
			System.out.println("Loai tai lieu khong hop le.");
			break;
		}
	}

	public void xoaTaiLieu(String maTaiLieu) {
		for (int i = 0; i < danhSachTaiLieu.size(); i++) {
			if (danhSachTaiLieu.get(i).maTl.equals(maTaiLieu)) {
				danhSachTaiLieu.remove(i);
				System.out.println("Da xoa tai lieu co ma " + maTaiLieu);
				return;
			}
		}
		System.out.println("Khong tim thay tai lieu co ma" + maTaiLieu);
	}

	public void hienThi() {
		for (TaiLieu taiLieu : danhSachTaiLieu) {
			taiLieu.hienThi();
			System.out.println();
		}
	}

	public void timKiemTheoLoai(String loai) {
		for (TaiLieu taiLieu : danhSachTaiLieu) {
			if (taiLieu instanceof Sach && loai.equals("Sach")) {
				taiLieu.hienThi();
			} else if (taiLieu instanceof TapChi && loai.equals("TapChi")) {
				taiLieu.hienThi();
			} else if (taiLieu instanceof Bao && loai.equals("Bao")) {
				taiLieu.hienThi();
			}
		}
	}

}
