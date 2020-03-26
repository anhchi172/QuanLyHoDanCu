import java.io.Serializable;
import java.util.ArrayList;

public class HoGiaDinh implements Serializable {
    private ArrayList<Nguoi> al;
    public HoGiaDinh() {
        al = new ArrayList<Nguoi>();
    }

    public void getHoGiaDinh (){
        for (Nguoi n: al)
            System.out.println(n.toString());
    }

    public int getSoNguoi(){
        return al.size();
    }

    public void addNguoi(Nguoi n){
        al.add(n);
    }

}
