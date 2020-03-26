import java.util.ArrayList;

public class KhuPho {
    private ArrayList<HoGiaDinh> al;
    private HoDanCuDAO hoDanCuDAO;

    public KhuPho() {

       hoDanCuDAO = new HoDanCuDAO();
       al = (ArrayList<HoGiaDinh>) hoDanCuDAO.read();

    }

    public void addHoGiaDinh(HoGiaDinh h) {
        if (h != null) {
            al.add(h);
            hoDanCuDAO.write(al);

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
