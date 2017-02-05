package local.zone.weblibrary.util.parser;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.StringWriter;

/**
 * Created by artem on 5.2.17.
 */
public class XmlParser implements Parser {
    private boolean prettyPrint = true;

    public XmlParser() {
    }

    public XmlParser(boolean prettyPrint) {
        this.prettyPrint = prettyPrint;
    }

    @Override
    public Object parse(Reader reader, Class... clazz) {
        if (reader == null || clazz == null) {
            throw new IllegalArgumentException();
        }
        try {
            JAXBContext context = JAXBContext.newInstance(clazz);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            return unmarshaller.unmarshal(reader);
        } catch (JAXBException e) {
            throw new IllegalArgumentException("Cannot unmarshal. " + e.getMessage());
        }

    }

    @Override
    public String unparse(Object source) {
        if (source == null) {
            throw new IllegalArgumentException();
        }
        try {
            JAXBContext context = JAXBContext.newInstance(source.getClass());
            Marshaller marshaller = context.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, prettyPrint);
            try (StringWriter writer = new StringWriter()) {
                try (BufferedWriter buffer = new BufferedWriter(writer)) {
                    marshaller.marshal(source, buffer);
                }
                return writer.getBuffer().toString();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (JAXBException e) {
            throw new IllegalArgumentException("Cannot marshal. " + e.getMessage());
        }
    }
}
