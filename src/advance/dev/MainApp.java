package advance.dev;
import java.util.Iterator;
import java.util.Scanner;
public class MainApp {

	static Person[] input() {
		// TODO Auto-generated method stub
		Person[] persons = new Person[10];
		for(int i = 0; i < 4; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("--Nhap vao thong tin giao vien--");
			System.out.println("Nhap vao ten giao vien: ");
			String ten = sc.next();
			System.out.println("Nhap tuoi: ");
			int tuoi = sc.nextInt();
			System.out.println("Nhap so dien thoai");
			String numberPhone = sc.next();
			System.out.println("Nhap vao ma giao vien");
			String maGV = sc.next();
			System.out.println("Nhap vao he so luong:");
			float heSL = sc.nextFloat();
			Teacher tea = new Teacher(ten, tuoi, numberPhone, maGV, heSL);	
			persons[i] = tea;
		}
		for(int i = 4; i < 10; i++) {
			Scanner sc = new Scanner(System.in);
			System.out.println("--Nhap vao thong tin sinh vien-- ");
			System.out.println("Nhap ten sinh vien");
			String tenSV = sc.next();
			System.out.println("Nhap tuoi:");
			int old = sc.nextInt();
			System.out.println("Nhap so dien thoai: ");
			String sdt = sc.next();
			System.out.println("Nhap diem toan:");
			float toan = sc.nextFloat();
			System.out.println("Nhap diem ly:");
			float ly = sc.nextFloat();
			System.out.println("Nhap diem hoa:");
			float hoa = sc.nextFloat();
			System.out.println("Nhap ma sinh vien:");
			String maSinhVien = sc.next();
			System.out.println("Nhap lop:");
			String lop = sc.next();
			Student std = new Student(tenSV, old, sdt, toan, ly, hoa, maSinhVien, lop);	
			persons[i] = std;
		}
		return persons;
	}
		static void print(Person[] persons) {
			for (int i = 0; i < 10; i++) {
				System.out.println(persons[i].toString());
			}
			
		}
		public static void findMaxLuong(Person[] persons) {
			Teacher max = (Teacher) persons[0];
			for (int i = 0; i < 4; i++) {
				Teacher tea = (Teacher) persons[i];
				if(tea.heSoLuong > max.heSoLuong) {
					max = tea;
				}
			}	
			System.out.println("Giao vien co luong cao nhat la: ");		
			System.out.println(String.format("Ten GV: %s, Tuoi: %d, Sdt: %s, Ma giao vien: %s, He so luong: %f, Luong: %f", max.name, max.age, max.number, max.maGiaoVien, max.heSoLuong, max.tinhLuong()));		
		}
		public static void findMaxDTB(Person[] persons) {
			Student max = (Student) persons[4];
			for (int i = 4; i < 10; i++) {
				Student std = (Student) persons[i];
				if(std.diemTrungBinh() > max.diemTrungBinh()) {
					max = std;
				}
			}
			System.out.println("Hoc sinh có diem trung binh cao nhat la:");
			System.out.println(String.format("Ten SV: %s, Tuoi: %d, Sdt: %s, Ma sinh vien: %s, Lop: %s, DTB: %f", max.name, max.age, max.number, max.maSinhVien, max.lop, max.diemTrungBinh()));	
		}
				
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person[] persons = new Person[10];
		persons = input();
		print(persons);
		findMaxLuong(persons);
		findMaxDTB(persons);
	}

}
