package _1_decorator._99_exercice;

public class CompressorDataSourceDecorator extends BaseDataSourceDecorator {
    private Compressor m_compressor;

    CompressorDataSourceDecorator(DataSource dataSource) {
        super(dataSource);
        m_compressor = new Compressor();
    }

    @Override
    public void writeData(String data) {
        m_dataSource.writeData(m_compressor.compress(data));
    }

    @Override
    public String readData() {
        return m_compressor.decompress(m_dataSource.readData());
    }
}
