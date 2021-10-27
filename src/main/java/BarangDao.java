import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.*;

import java.io.Reader;
import java.util.List;

public class BarangDao {

    private SqlSessionFactory sqlSessionFactory = null;

    public BarangDao(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    public void selectAll() {
        SqlSession session = sqlSessionFactory.openSession();

        List<Barang> barangList = session.selectList("Barang.selectAll");

        for (Barang barang : barangList) {
            System.out.printf("%-30s %-30s %-30s %-30s\n",
                    barang.getId_barang(), barang.getNama_barang(), barang.getJumlah(), barang.getHarga());
        }

        session.close();
    }

    public void selectById(String id_barang) {
        SqlSession session = sqlSessionFactory.openSession();

        Barang barang = session.selectOne("Barang.selectById", id_barang);
        System.out.printf("%-30s %-30s %-30s %-30s\n",
                barang.getId_barang(), barang.getNama_barang(), barang.getJumlah(), barang.getHarga());

        session.close();
    }

    public void insert(Barang barang) {

        SqlSession session = sqlSessionFactory.openSession();

        session.insert("Barang.insert", barang);
        session.commit();
        System.out.println("Record Inserted Successfully");
        session.close();
    }

    public void update(Barang barang) {
        SqlSession session = sqlSessionFactory.openSession();

        session.update("Barang.update", barang);
        session.commit();
        System.out.println("Record updated Successfully");
        session.close();
    }

    public void deleteById(String id_barang) {

        SqlSession session = sqlSessionFactory.openSession();

        session.delete("Barang.deleteById", id_barang);
        session.commit();
        System.out.println("Record deleted Successfully");
        session.close();
    }

    public void callProcedure(String command) {
        SqlSession session = sqlSessionFactory.openSession();

        List<Barang> barangList = session.selectList("Barang.callProcedure");

        for (Barang barang : barangList) {
            System.out.printf("%-30s %-30s %-30s %-30s\n",
                    barang.getId_barang(), barang.getNama_barang(), barang.getJumlah(), barang.getHarga());
        }

        session.close();
    }
}
