public class Nguoi {
    private String hoTen;
    private int tuoi;
    private String ngheNghiep;
    private int soCMND;
    public Nguoi(String h, int t, String n, int s) {
        hoTen = h;
        tuoi = t;
        ngheNghiep = n;
        soCMND = s;
    }

    public int getSoCMND() {
        return soCMND;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public String toString(){
        return ("Ho ten: " + getHoTen() +" Tuoi: "+ getTuoi() + " Nghe nghiep: "+ getNgheNghiep() + " So CMND: " + getSoCMND());
    }
}

