import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class HoDanCuDAO {
    private static final String FILE_NAME = "HoDanCu.txt";
    public void write(List<HoGiaDinh> s){
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        try{
            File file = new File(FILE_NAME);
            if (!file.exists()){
                file.createNewFile();
            }
            fos = new FileOutputStream(file);
            oos = new ObjectOutputStream(fos);
            oos.writeObject(s);
        } catch (IOException ioe){
            ioe.printStackTrace();
        }finally {
            closeStream(fos);
            closeStream(oos);
        }
    }

    private void closeStream(OutputStream os){
        if (os!= null){
            try{
                os.close();
            } catch (IOException ioe){
                ioe.printStackTrace();
            }
        }
    }

    public List<HoGiaDinh> read(){
        List<HoGiaDinh> al = new ArrayList<>();
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try{
            fis = new FileInputStream(new File(FILE_NAME));
            ois = new ObjectInputStream(fis);
            al = (List<HoGiaDinh>)ois.readObject();

        } catch (FileNotFoundException e){
            System.out.print("List is empty");
        } catch (IOException ioe){
            ioe.printStackTrace();
        } catch (ClassNotFoundException c){
            c.printStackTrace();
        }finally {
            closeStream(fis);
            closeStream(ois);

        }
        return al;
    }

    private void closeStream(InputStream is){
        if (is!= null){
            try{
                is.close();
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
