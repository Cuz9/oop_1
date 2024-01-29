package model;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyCanBo {
	Scanner scanner = new Scanner(System.in);
	private ArrayList<CanBo> dscanbo;

	public QuanLyCanBo() {
		dscanbo = new ArrayList<>();
	}

	public void Add() {

		System.out.print("Nhap can bo(1: Cong nhan; 2: Ky su; 3: Nhan Vien: ");
		int type = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Nhap ho ten: ");
		String hoTen = scanner.nextLine();
		System.out.print("Nhap tuoi: ");
		int tuoi = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Nhap gioi tinh: ");
		String gioiTinh = scanner.nextLine();
		System.out.print("Nhap dia chi: ");
		String diaChi = scanner.nextLine();
		switch (type) {
		case 1:
			int bac;
			do {
				System.out.print("Nhap bac( tu 1 den 10): ");
				bac = scanner.nextInt();
				scanner.nextLine();
			} while (bac < 1 || bac > 10);
			dscanbo.add(new CongNhan(hoTen, tuoi, gioiTinh, diaChi, bac));
			break;
		case 2:
			System.out.print("Nhap nganh dao tao ");
			String nganhDaoTao = scanner.nextLine();
			dscanbo.add(new KySu(hoTen, tuoi, gioiTinh, diaChi, nganhDaoTao));
			break;
		case 3:
			System.out.print("Nhap cong viec ");
			String congViec = scanner.nextLine();
			dscanbo.add(new NhanVien(hoTen, tuoi, gioiTinh, diaChi, congViec));
			break;
		default:
			System.out.println("Lua chon sai.");
		}
	}

	public void Search(String hoTen) {
		boolean a = false;
		for (CanBo canbo : dscanbo) {
			if (canbo.hoTen.equalsIgnoreCase(hoTen)) {
				canbo.hienThiThongTin();
				a = true;
				break;
			}
		}
		if (a == false) {
			System.out.println(" Khong tim thay can bo co ten la " + hoTen);
		}
	}

	public void Show() {
		for (CanBo canbo : dscanbo) {
			canbo.hienThiThongTin();
			System.out.println("---------------------------------------------------------------");
		}
	}

}
