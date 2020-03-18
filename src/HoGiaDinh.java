import java.util.ArrayList;

public class HoGiaDinh {
    private ArrayList<Nguoi> al;
    public HoGiaDinh() {
        al = new ArrayList<Nguoi>();
    }

    public void getHoGiaDinh (){
        for (Nguoi n: al)
            System.out.println(n.toString());
    }



    public void addNguoi(Nguoi n){
        al.add(n);
    }

}
