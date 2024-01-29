package nomal;

public class TaiLieu {
	protected String maTl;
	protected String tenNXB;
	protected int soBanphathanh;

	public TaiLieu(String maTl, String tenNXB, int soBanphathanh) {
		super();
		this.maTl = maTl;
		this.tenNXB = tenNXB;
		this.soBanphathanh = soBanphathanh;
	}

	public void hienThi() {
		System.out.println("Ma Tai Lieu : " + maTl);
		System.out.println("Ten NXB : " + tenNXB);
		System.out.println("So Ban Phat Hanh : " + soBanphathanh);
	}

	@Override
	public String toString() {
		return "TaiLieu [maTl=" + maTl + ", tenNXB=" + tenNXB + ", soBanphathanh=" + soBanphathanh + "]";
	}

}
