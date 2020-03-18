import java.util.Scanner;

public class QuanLyHoDanCuTester {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap so ho dan: ");
        int o = checkInput(1, Integer.MAX_VALUE);
        KhuPho k = new KhuPho(o);
        for (int i = 0; i<o; i++) {
            //System.out.print("Nhap so nguoi trong ho gia dinh: ");
            //int m = checkInput(1, Integer.MAX_VALUE);
            HoGiaDinh h = new HoGiaDinh();
            k[i] = h;
            int act;
            do {
                System.out.println("Chon thao tac can thuc hien:\n1. Them thanh vien\n2. Hoan thanh");
                act = checkInput(1, 2);
                if (act == 1) {
                    Nguoi n = nhapThanhVien();
                    h.addNguoi(n);
                }
            } while (act != 2);
        }
            System.out.println("Chon thao tac can thuc hien:\n1. Hien thi \n2.Thoat");
            int choice;
            do {
                choice = checkInput(1, 2);
                if (choice == 1)
                    k.hienThi();
            }while (choice!=2);
            return;



    }
    private static int checkInput(int a, int b){
        Scanner scan = new Scanner (System.in);
        int choice = scan.nextInt();

        while (choice<a || choice>b){
            System.out.println("Du lieu nhap khong phu hop voi yeu cau. Vui long nhap lai:");
            choice = scan.nextInt();
        }

        return choice;
    }

    private static Nguoi nhapThanhVien(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        String hoTen = scan.nextLine();
        System.out.print("Nhap tuoi: ");
        int tuoi = checkInput(1, Integer.MAX_VALUE);
        System.out.print("Nhap nghe nghiep: ");
        scan.nextLine();
        String ngheNghiep = scan.nextLine();
        System.out.print("Nhap so CMND: ");
        int soCMND = checkInput(1, Integer.MAX_VALUE);
        Nguoi n = new Nguoi(hoTen, tuoi, ngheNghiep, soCMND);
       return n;
    }

}
