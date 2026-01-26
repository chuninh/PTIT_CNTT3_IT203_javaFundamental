import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong sach tra: ");
        int book =Integer.parseInt(sc.nextLine());
        System.out.print("Nhap so ngay tre: ");
        int day =Integer.parseInt(sc.nextLine());
        double money = 0;
        for (int i =0;i<day;i++){
            if(day>=1 && day <=5){
                money += 2000*book;
            }else {
                money += 5000*book;
            }
        }
        System.out.println("so tien can tra la :"+ money);

        System.out.print("nhap tuoi");
        int age = Integer.parseInt(sc.nextLine());
        System.out.print("so sach da muon trong thang qua");


    }
}