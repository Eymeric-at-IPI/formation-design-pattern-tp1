package _1_decorator._99_exercice;

public class NoneDataSourceDecorator implements DataSource {

    protected FileDataSource m_fileDataSource;

    NoneDataSourceDecorator(FileDataSource fileDataSource) {
        this.m_fileDataSource = fileDataSource;
    }

    @Override
    public void writeData(String data) {
        m_fileDataSource.writeData(data);
    }

    @Override
    public String readData() {
        return m_fileDataSource.readData();
    }
}
