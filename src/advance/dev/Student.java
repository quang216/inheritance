package advance.dev;

public class Student extends Person {
	float diemToan;
	float diemLy;
	float diemHoa;
	String maSinhVien;
	String lop;
	public Student(String name, int age, String number, float diemToan, float diemLy, float diemHoa, String maSinhVien,
			String lop) {
		super(name, age, number);
		this.diemToan = diemToan;
		this.diemLy = diemLy;
		this.diemHoa = diemHoa;
		this.maSinhVien = maSinhVien;
		this.lop = lop;
	}
	public float diemTrungBinh() {
		return (diemToan + diemLy+ diemHoa)/3;
	}
	@Override
	public String toString() {
		return String.format("Ten sinh vien: %s, Diem toan la: %f, Diem ly la: %f, Diem hoa la: %f, Ma Sinh Vien: %s, Lop: %s, Diem trung binh la: %f", name, diemToan, diemLy, diemHoa, maSinhVien, lop, diemTrungBinh());

	}
}