package de.ckraus.commons.mappers2;

@SuppressWarnings({ "javadoc" })
public interface BooleanMapper extends TypeMapper<Boolean> {


    /**
     * isMappable
     *
     * @param o
     *
     * @return
     */
    @Override
    boolean isMappable(Object o);

    /**
     * map
     *
     * @param obj
     * @param defaultValue
     *
     * @return
     */
    @Override
    Boolean mapObject(Object obj, Boolean defaultValue);

    /**
     * map
     *
     * @param s - string to map
     * @param bTrim - default flag for string handling
     * @param bEmptyIsNull - default flag for empty string handling
     *
     * @return
     */
    @Override
    Boolean map(String s, boolean bTrim, boolean bEmptyIsNull);

    /**
     * map
     *
     * @param s - string to map
     * @param bTrim - default flag for string handling
     * @param bEmptyIsNull - default flag for empty string handling
     * @param defaultValue - The default value
     *
     * @return
     */
    Boolean map(String s, boolean bTrim, boolean bEmptyIsNull, Boolean defaultValue);

    /**
     * map
     *
     * @param b - boolean to map
     */
    Boolean map(Boolean b);

    /**
     * map
     *
     * @param b - boolean to map
     * @param defaultValue - The default value
     *
     * @return
     */
    Boolean map(Boolean b, Boolean defaultValue);

    /**
     * map
     *
     * @param c - character to map
     */
    Boolean map(Character c);

    /**
     * map
     *
     * @param c - character to map
     * @param defaultValue - The default value
     *
     * @return
     */
    Boolean map(Character c, Boolean defaultValue);

    /**
     * map
     *
     * @param i - integer to map
     *
     * @return
     */
    Boolean map(Integer i);

    /**
     * map
     *
     * @param i - integer to map
     * @param defaultValue - The default value
     *
     * @return
     */
    Boolean map(Integer i, Boolean defaultValue);

    /**
     * isFalse
     *
     * @param c
     *
     * @return
     */
    boolean isFalse(Character c);

    /**
     * isFalse
     *
     * @param i
     *
     * @return
     */
    boolean isFalse(Integer i);

    /**
     * isFalse
     *
     * @param o
     *
     * @return
     */
    boolean isFalse(Object o);

    /**
     * isFalse
     *
     * @param s
     *
     * @return
     */
    boolean isFalse(String s);

    /**
     * isTrue
     *
     * @param c
     *
     * @return
     */
    boolean isTrue(Character c);

    /**
     * isTrue
     *
     * @param i
     *
     * @return
     */
    boolean isTrue(Integer i);

    /**
     * isTrue
     *
     * @param o
     *
     * @return
     */
    boolean isTrue(Object o);

    /**
     * isTrue
     *
     * @param s
     *
     * @return
     */
    boolean isTrue(String s);

}
