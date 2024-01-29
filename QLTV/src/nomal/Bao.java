package nomal;

public class Bao extends TaiLieu {
	private String ngayPh;

	public Bao(String maTl, String tenNXB, int soBanphathanh, String ngayPh) {
		super(maTl, tenNXB, soBanphathanh);
		this.ngayPh = ngayPh;
	}

	public String getNgayPh() {
		return ngayPh;
	}

	public void setNgayPh(String ngayPh) {
		this.ngayPh = ngayPh;
	}

	@Override
	public void hienThi() {
		// TODO Auto-generated method stub
		super.hienThi();
		System.out.println();
	}

	@Override
	public String toString() {
		return "Bao [ngayPh=" + ngayPh + "]";
	}

}
