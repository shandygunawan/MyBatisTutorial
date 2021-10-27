public class MainApp {

    public static void main(String[] args) {
        BarangDao barangDao = new BarangDao(MyBatisConnectionFactory.getSqlSessionFactory());

        barangDao.selectAll();

//        barangDao.insert(new Barang("137", "Test MyBatis 1", 111, 222));
//        barangDao.selectById("137");
//        barangDao.update(new Barang("137", "Test MyBatis 1", 111, 333));
//        barangDao.selectById("137");
//        barangDao.deleteById("137");
        barangDao.callProcedure("Show Barang");
    }
}
