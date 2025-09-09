package pekan1;

public class MembuatKue {

	public static void main(String[] args) {
		makebatter();
		memanggang();
		memanggang();
		menghias();
	}
	public static void makebatter() {
		System.out.println("campur bahan kering");
		System.out.println("krim mentega dan gula");
		System.out.println("kocok telurnya");
		System.out.println("masukkan bahan kering");
	}
	public static void memanggang(){
		System.out.println("setel suhu oven");
		System.out.println("setel pengatur waktu");
		System.out.println("masukkan kue ke dalam oven");
		System.out.println("biarkan cookie untuk di panggang");
	}
	public static void menghias() {
		System.out.println("campur bahan untuk frosting");
		System.out.println("taburkan frosting dan taburan");
	}
}
