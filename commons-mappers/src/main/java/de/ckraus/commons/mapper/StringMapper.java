package de.ckraus.commons.mapper;

public interface StringMapper extends TypeMapper<String> {

    /**
     * map
     *
     * @param s
     *         - string to map
     * @param bTrim
     *         - default flag for string handling
     * @param bEmptyIsNull
     *         - default flag for empty string handling
     * @param defaultValue
     *         - The default value
     *
     * @return <p>TODO
     */
    @Override
    default String map( String s, boolean bTrim, boolean bEmptyIsNull, String defaultValue ) {
        String sRetVal = defaultValue;
        String sPrepared = this.prepare( s, bTrim, bEmptyIsNull );

        if ( sPrepared != null ) {
            sRetVal = sPrepared;
        }
        return sRetVal;
    }

}
