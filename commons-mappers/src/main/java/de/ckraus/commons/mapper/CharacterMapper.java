package de.ckraus.commons.mapper;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;

@SuppressWarnings({"javadoc"})
public interface CharacterMapper extends TypeMapper<Character> {

    /**
     * isTrimStrings
     *
     * @return
     */
    default boolean isEvaluateCodePoints() {
        return Boolean.TRUE;
    }

    @Override
    default boolean isMappable(Object o) {
        boolean bIsMappable;

        if (o instanceof Character) {
            bIsMappable = true;
        } else if (o instanceof Integer) {
            bIsMappable = Character.isDefined((Integer) o);
        } else {
            bIsMappable = TypeMapper.super.isMappable(o);
        }

        return bIsMappable;
    }

    /**
     * mapObject
     *
     * @param obj
     * @param defaultValue
     * @return
     */
    @Override
    default Character mapObject(Object obj, Character defaultValue) {
        Character e;

        if (null == obj) {
            e = defaultValue;
        } else if (obj instanceof Character) {
            e = this.map((Character) obj, defaultValue);
        } else if (obj instanceof Integer) {
            e = this.map((Integer) obj, defaultValue);
        } else if (obj instanceof String) {
            e = this.map((String) obj, defaultValue);
        } else {
            e = this.map(obj.toString(), defaultValue);
        }
        return e;
    }

    /**
     * map
     *
     * @param c
     * @param defaultValue
     * @return
     */
    @Override
    default Character map(Character c, Character defaultValue) {
        return (null != c
                ? c
                : defaultValue);
    }

    /**
     * map
     *
     * @param i
     * @return
     */
    default Character map(Integer i) {
        return this.map(i, this.getDefaultValue());
    }

    /**
     * map
     *
     * @param i
     * @return
     */
    default Character map(Integer i, Character defaultValue) {
        Character cRetVal = defaultValue;

        if ( this.isEvaluateCodePoints() ) {
            char[] acVals = Character.toChars(i);

            if (!ArrayUtils.isEmpty(acVals)) {
                cRetVal = acVals[0];
            }
        }

        return cRetVal;
    }

    /**
     * map
     *
     * @param s
     * @param bTrim
     * @param bEmptyIsNull
     * @param defaultValue
     */
    default Character map(String s, boolean bTrim, boolean bEmptyIsNull, Character defaultValue) {
        return this.map(s, bTrim, bEmptyIsNull, this.isEvaluateCodePoints(), defaultValue);
    }

    /**
     * map
     *
     * @param s
     * @param bEvaluateCodePoints
     * @return <p></p>
     */
    default Character map(String s, boolean bEvaluateCodePoints) {
        return this.map(s, bEvaluateCodePoints, this.getDefaultValue());
    }

    /**
     * map
     *
     * @param s
     * @param bEvaluateCodePoints
     * @param defaultValue
     * @return <p></p>
     */
    default Character map(String s, boolean bEvaluateCodePoints, Character defaultValue) {
        return this.map(s, this.isTrimStrings(), this.isEmptyStringNull(), bEvaluateCodePoints, defaultValue);
    }

    /**
     * map
     *
     * @param s
     * @param bTrim
     * @param bEmptyIsNull
     * @param bEvaluateCodePoints
     * @param defaultValue
     * @return <p></p>
     */
    default Character map(String s, boolean bTrim, boolean bEmptyIsNull, boolean bEvaluateCodePoints,
                          Character defaultValue) {
        Character cRetVal = defaultValue;
        var preparedString = this.prepare(s, bTrim, bEmptyIsNull);

        if (StringUtils.isNotEmpty(preparedString)) {
            Integer iVal = null;

            if (bEvaluateCodePoints) {
                // Pruefen, ob der String evtl ein Integerwert ist
                iVal = this.getIntegerMapper().map(preparedString, (String) null);
            }

            // ggf Int Wert mappen oder den ersten Character des prepared Strings verwenden
            cRetVal = this.map( iVal, preparedString.charAt(0) );
        }
        return cRetVal;
    }

    /**
     * getIIntegerMapper
     *
     * @return
     */
    default IntegerMapper getIntegerMapper() {
        return TypeMapperUtils.getDefaults().getIntegerMapper();
    }

}
