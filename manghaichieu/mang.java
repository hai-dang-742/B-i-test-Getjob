package manghaichieu;

import java.util.Scanner;

public class mang {
	private int cot;
	private int dong;
	private int a[][];
	
	public mang(int cot, int dong) {
		super();
		this.cot = cot;
		this.dong = dong;
	}
	public mang() {
		
	}
	
	public int getCot() {
		return cot;
	}
	public void setCot(int cot) {
		this.cot = cot;
	}
	public int getDong() {
		return dong;
	}
	public void setDong(int dong) {
		this.dong = dong;
	}
	
	public void nhap() {
		int soDong, soCot;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Nhap vao so dong: ");
		this.dong = scanner.nextInt();
		System.out.println("Nhap vao so cot: ");
		this.cot = scanner.nextInt();
		
		this.a = new int[dong][cot];
		
		for (int i = 0; i < dong ; i++) {
			for (int j = 0; j < cot; j++) {
				System.out.print("Nhap phan tu thu [" + i + ", " + j + "]: ");
				a[i][j] = scanner.nextInt();
			}
		}
	}
	
	public void xuat() {
		for (int i = 0; i < dong; i++) {
			for (int j = 0; j < cot; j++) {
				System.out.print(a[i][j] + "\t");
			}
			
			System.out.println("\n");	
		}
	}
	
	public void timdaymax() {
		// khai báo 1 dãy số lưu tổng của từng dòng;
		int[] sum = new int[dong];
		
		// tính tổng của từng dòng rồi dán vô trong mảng ở trên dòng 63
		for (int i = 0; i < dong; i++) {
			sum[i]=0;
			for (int j = 0; j < cot; j++) {
				sum[i]+=a[i][j];
			}
		}
		
		//sau thi có 1 mảng tổng của từng dòng tương ứng rồi thì
		// max là biến lưu giá trị tổng của dòng lớn nhất
		// index_max lưu giá trị số thứ tự của dòng lớn nhất
		int max = sum[0];
		int index_max = 0;
		
		//chạy vòng for để tìm dòng có tổng lớn nhất
		for(int i = 1; i<dong; i++) {
			if(sum[i]> max)
			{
				max=sum[i];
				index_max=i;
			}			
		}
	
		// xuất ra dòng lớn nhất 
		System.out.print("\n Hang co tong lon nhat: \n");
		for(int i = 0; i<cot; i++) {
			System.out.print(a[index_max][i] + "\t");
		}
	}
	
}
