package _1_decorator._99_exercice;

import java.util.Base64;

public class EncryptionDataSourceDecorator extends BaseDataSourceDecorator {
    private Encryptor m_encryptor;

    EncryptionDataSourceDecorator(DataSource dataSource) {
        super(dataSource);
        m_encryptor = new Encryptor();
    }

    @Override
    public void writeData(String data) {
        m_dataSource.writeData(m_encryptor.encode(data));
    }

    @Override
    public String readData() {
        return m_encryptor.decode(m_dataSource.readData());
    }
}
