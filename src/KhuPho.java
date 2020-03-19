import java.util.ArrayList;

public class KhuPho {
    private ArrayList<HoGiaDinh> al;

    public KhuPho() {
        al = new ArrayList<HoGiaDinh>();
    }

    public void addHoGiaDinh(HoGiaDinh h) {
        if (h != null) {
            al.add(h);
        }
        else{
                System.out.println("Loi: ho gia dinh = null");
            }
        }

        public void hienThi () {
            int count = 1;
            for (HoGiaDinh h : al) {
                System.out.println("Ho Gia Dinh " + count + " gom cac thanh vien: ");
                h.getHoGiaDinh();
                count++;
            }
        }
    }
