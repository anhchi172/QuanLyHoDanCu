import java.util.ArrayList;

public class KhuPho {
    private HoGiaDinh[] arr;
    public KhuPho(int n){
        arr = new HoGiaDinh[n];
    }

    public void hienThi(){
        int count = 1;
        for (HoGiaDinh h: arr){
            System.out.println("Ho Gia Dinh " + count + "gom cac thanh vien: ");
            h.getHoGiaDinh();
            count++;
        }
    }
}
