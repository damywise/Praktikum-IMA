import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nama: ");
		String nama = sc.nextLine();
		System.out.print("NIM: ");
		long nim = sc.nextLong();
		System.out.print("Kelas: ");
		String kelas = sc.next();
		System.out.print("IPK: ");
		double ipk = sc.nextDouble();
		
		System.out.println();
		System.out.println();
		System.out.println("Halo! Nama kamu adalah: " + nama + "\nNIM kamu: " + nim + "\nDi Tel-U, kamu ada di kelas: " + kelas + "\nIPK kamu sekarang adalah: " + ipk + "/4.0");
		
	}
}