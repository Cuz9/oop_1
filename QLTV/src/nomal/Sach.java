package nomal;

public class Sach extends TaiLieu {
	private String tenTG;
	private int soTrang;

	public Sach(String maTl, String tenNXB, int soBanphathanh, String tenTG, int soTrang) {
		super(maTl, tenNXB, soBanphathanh);
		this.tenTG = tenTG;
		this.soTrang = soTrang;
	}

	public String getTenTG() {
		return tenTG;
	}

	public void setTenTG(String tenTG) {
		this.tenTG = tenTG;
	}

	public int getSoTrang() {
		return soTrang;
	}

	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}

	@Override
	public void hienThi() {
		// TODO Auto-generated method stub
		super.hienThi();
		System.out.println("Ten Tac Gia: " + tenTG);
		System.out.println("So Trang :" + soTrang);
	}

	@Override
	public String toString() {
		return "Sach [tenTG=" + tenTG + ", soTrang=" + soTrang + "]";
	}

}
