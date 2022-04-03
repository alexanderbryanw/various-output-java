package id.web.alexanderbryanw;

public class Challenge_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String judul, t1, t2, t3;
		double psti, dasprog, eng1;
		judul = "Semester 1";
		t1 = "No.";
		t2 = "Nama Mata Kuliah";
		t3 = "Nilai";
		psti = 90.75;
		dasprog = 99.95;
		eng1 = 96.83;
		System.out.printf("%s\n", judul);
		System.out.printf("%s %s %35s", t1, t2, t3);
		System.out.println("\n--------------------------------------------------");
		System.out.printf("1 Pengantar Teknologi Sistem Informasi %10.2f\n", psti);
		System.out.printf("2 Dasar-Dasar Pemrograman %27.2f\n", dasprog);
		System.out.printf("3 Inggris 1 %52.2f", eng1);
	}

}
