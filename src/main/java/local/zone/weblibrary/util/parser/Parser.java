package local.zone.weblibrary.util.parser;

import java.io.Reader;

/**
 * Created by artem on 5.2.17.
 */
public interface Parser {
    Object parse(Reader reader, Class... clazz);
    String unparse(Object source);
}
