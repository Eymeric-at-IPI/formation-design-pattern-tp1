package _1_decorator._99_exercice;

public class BaseDataSourceDecorator implements DataSource {

    protected DataSource m_dataSource;

    BaseDataSourceDecorator(DataSource dataSource) {
        m_dataSource = dataSource;
    }

    @Override
    public void writeData(String data) {
        m_dataSource.writeData(data);
    }

    @Override
    public String readData() {
        return m_dataSource.readData();
    }
}
