package model;

public class KySu extends CanBo {
	private String nganhDaotao;

	public KySu(String hoTen, int tuoi, String gioiTinh, String diaChi, String nganhDaotao) {
		super(hoTen, tuoi, gioiTinh, diaChi);
		this.nganhDaotao = nganhDaotao;
	}

	public String getNganhDaotao() {
		return nganhDaotao;
	}

	public void setNganhDaotao(String nganhDaotao) {
		this.nganhDaotao = nganhDaotao;
	}

	@Override
	public void hienThiThongTin() {
		// TODO Auto-generated method stub
		super.hienThiThongTin();
		System.out.println("Nganh dao tao: " + nganhDaotao);
	}

	@Override
	public String toString() {
		return "KySu [nganhDaotao=" + nganhDaotao + "]";
	}

}
