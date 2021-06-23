package _1_decorator._99_exercice;


public class DemoAvecDecorator {
    public static void main(String[] args) {
        // exemple de données à sauvegarder encrypter et compressé
        String salaryRecords = "Name,Salary\nJohn Smith,100000\nSteven Jobs,912000";

        FileDataSource fileDataSource = new FileDataSource("OutputDemo.txt");

        DataSource dataSource = new EncryptionDataSourceDecorator(new CompressorDataSourceDecorator(new NoneDataSourceDecorator(fileDataSource)));
        dataSource.writeData(salaryRecords);
        System.out.println("# 2 : " + dataSource.readData() + " #");
    }
}