package advance.dev;

public class Teacher extends Person {
	public Teacher(String ten, int tuoi, String sdt) {
		super(ten, tuoi, sdt);
		// TODO Auto-generated constructor stub
	}

	String maGiaoVien;
	float heSoLuong;
	public Teacher(String name, int age, String number, String maGiaoVien, float heSoLuong) {
		super(name, age, number);
		this.maGiaoVien = maGiaoVien;
		this.heSoLuong = heSoLuong;
	}
	public float tinhLuong() {
		return 1200000 * heSoLuong;
	}
	@Override
	public String toString() {
		return String.format("Ten giao vien: %s, Ma giao vien la: %s, He so luong la: %f, Luong la: %f", name, maGiaoVien, heSoLuong, tinhLuong());
		}
}
