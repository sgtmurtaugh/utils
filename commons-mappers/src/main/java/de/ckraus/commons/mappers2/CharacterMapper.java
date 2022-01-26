package de.ckraus.commons.mappers2;

@SuppressWarnings({ "javadoc" })
public interface CharacterMapper extends TypeMapper<Character> {

    /**
     * isTrimStrings
     *
     * @return
     */
    boolean isEvaluateCodePoints();

    @Override
    boolean isMappable(Object o);

    /**
     * mapObject
     *
     * @param obj
     * @param defaultValue
     *
     * @return
     */
    @Override
    Character mapObject(Object obj, Character defaultValue);

    /**
     * map
     *
     * @param c
     * @param defaultValue
     *
     * @return
     */
    @Override
    Character map(Character c, Character defaultValue);

    /**
     * map
     *
     * @param i
     *
     * @return
     */
    Character map(Integer i);

    /**
     * map
     *
     * @param i
     *
     * @return
     */
    Character map(Integer i, Character defaultValue);

    /**
     * map
     *
     * @param s
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValue
     */
    Character map(String s, boolean bTrim, boolean bEmptyIsNull, Character defaultValue);

    /**
     * map
     *
     * @param s
     * @param bEvaluateCodePoints
     *
     * @return <p></p>
     */
    Character map(String s, boolean bEvaluateCodePoints);

    /**
     * map
     *
     * @param s
     * @param bEvaluateCodePoints
     * @param defaultValue
     *
     * @return <p></p>
     */
    Character map(String s, boolean bEvaluateCodePoints, Character defaultValue);

    /**
     * map
     *
     * @param s
     * @param bTrim
     * @param bEmptyIsNull
     * @param bEvaluateCodePoints
     * @param defaultValue
     *
     * @return <p></p>
     */
    Character map(String s, boolean bTrim, boolean bEmptyIsNull, boolean bEvaluateCodePoints, Character defaultValue);

    /**
     * getIIntegerMapper
     *
     * @return
     */
    IntegerMapper getIntegerMapper();

}
