package de.ckraus.commons.mappers2;

import java.util.Properties;

@SuppressWarnings({ "javadoc" })
public interface CharArrayMapper extends TypeMapper<char[]> {

    char[] map(Properties props, String key, boolean bRemoveCharDelimiters, char[] defaultValue);

    char[] map(String key, boolean bTrim, boolean bEmptyIsNull, boolean bRemoveCharDelimiters, char[] defaultValue);

}
