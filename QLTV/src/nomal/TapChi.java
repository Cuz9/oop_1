package nomal;

public class TapChi extends TaiLieu {
	private int soPh;
	private int thangPh;

	public TapChi(String maTl, String tenNXB, int soBanphathanh, int soPh, int thangPh) {
		super(maTl, tenNXB, soBanphathanh);
		this.soPh = soPh;
		this.thangPh = thangPh;
	}

	public int getSoPh() {
		return soPh;
	}

	public void setSoPh(int soPh) {
		this.soPh = soPh;
	}

	public int getThangPh() {
		return thangPh;
	}

	public void setThangPh(int thangPh) {
		this.thangPh = thangPh;
	}

	@Override
	public void hienThi() {
		// TODO Auto-generated method stub
		super.hienThi();
		System.out.println("So Phat Hanh: " + soPh);
		System.out.println("Thang Phat Hanh: " + thangPh);
	}

	@Override
	public String toString() {
		return "TapChi [soPh=" + soPh + ", thangPh=" + thangPh + "]";
	}

}
