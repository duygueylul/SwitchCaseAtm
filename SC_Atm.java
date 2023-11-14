package SwitchCaseAtm;
import java.util.Scanner;

public class SC_Atm {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		int balance = 1000;
		System.out.println("Bakiyeniz: " + balance);
		System.out.println("\n****İSİMLER****\n");
		System.out.println("1. Para Çekme: ");
		System.out.println("2. Para Yatırma: ");
		System.out.println("3. Bakiye Sorgulama: ");
		System.out.println("4. Kart İade: ");
		
		
		System.out.println("İşleminizi Seçiniz: ");
		int process = scan.nextInt();		
		
		
		switch(process) {
		case 1:
			System.out.println("Çekmek İstediğiniz Tutarı Giriniz: ");
			int amount = scan.nextInt();
			if(amount > balance) {
				System.out.println("Yetersiz Bakiye!! ---> Lütfen Tekrar Deneyiniz!!");
				amount = scan.nextInt();
			}
			balance -= amount;
			System.out.println("Para Çekme İşleminiz Başarılı Bir Şekilde Gerçekleşti.");
			System.out.println("Yeni Bakiyeniz: " + balance);
			break;
		case 2: 
			System.out.println("Bakiyeniz: " + balance);
			System.out.println("Yatırmak İstediğiniz Tutarı Giriniz: ");
			amount = scan.nextInt();
			balance += amount;
			System.out.println("Yeni Bakiyeniz: " + balance);
			break;
		case 3:
			System.out.println("Bakiyeniz: " + balance);
			break;
		case 4:
			System.out.println("Kartınızı Alamayı Unutmayınız !!!");
			default:
				System.out.println("Yanlış İşlem Seçtiniz Tekrar Giriniz!!!");
		}

	}

}
