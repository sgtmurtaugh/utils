package de.ckraus.commons.mappers2;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;

@Component("characterMapper")
@Getter
@Setter(AccessLevel.PROTECTED)
@SuppressWarnings({ "javadoc", "unused" })
public class CharacterMapperImpl extends TypeMapperBase<Character> implements CharacterMapper {

    public static final boolean DEFAULT_EVALUATE_CODE_POINTS = Boolean.TRUE;

    private final boolean evaluateCodePoints;


    /**
     * Constructor
     */
    CharacterMapperImpl() {
        this(null);
    }

    /**
     * Constructor
     */
    CharacterMapperImpl(Character defaultValue) {
        this(defaultValue, DEFAULT_EVALUATE_CODE_POINTS);
    }

    /**
     * Constructor
     *
     * @param bIsEvaluateCodePoints
     */
    CharacterMapperImpl(boolean bIsEvaluateCodePoints) {
        this(null, bIsEvaluateCodePoints);
    }

    /**
     * Constructor
     *
     * @param defaultValue
     * @param bIsEvaluateCodePoints
     */
    CharacterMapperImpl(Character defaultValue, boolean bIsEvaluateCodePoints) {
        super(Character.class, defaultValue);
        this.evaluateCodePoints = bIsEvaluateCodePoints;
    }

    /**
     * Ermittelt eine Instanz per {@link TypeMapperUtils}
     */
    public static CharacterMapper getInstance() {
        return TypeMapperUtils.getCharacterMapper();
    }

    @Override
    public IntegerMapper getIntegerMapper() {
        return TypeMapperUtils.getIntegerMapper();
    }

    /**
     * isEvaluateCodePoints
     *
     * @return
     */
    public boolean isEvaluateCodePoints() {
        return Boolean.TRUE;
    }

    @Override
    public boolean isMappable(Object o) {
        boolean bIsMappable;

        if (o instanceof Character) {
            bIsMappable = true;
        }
        else if (o instanceof Integer) {
            bIsMappable = Character.isDefined((Integer) o);
        }
        else {
            bIsMappable = super.isMappable(o);
        }

        return bIsMappable;
    }

    /**
     * mapObject
     *
     * @param obj
     * @param defaultValue
     *
     * @return
     */
    @Override
    public Character mapObject(Object obj, Character defaultValue) {
        Character e;

        if (null == obj) {
            e = defaultValue;
        }
        else if (obj instanceof Character) {
            e = this.map((Character) obj, defaultValue);
        }
        else if (obj instanceof Integer) {
            e = this.map((Integer) obj, defaultValue);
        }
        else if (obj instanceof String) {
            e = this.map((String) obj, defaultValue);
        }
        else {
            e = this.map(obj.toString(), defaultValue);
        }
        return e;
    }

    /**
     * map
     *
     * @param c
     * @param defaultValue
     *
     * @return
     */
    @Override
    public Character map(Character c, Character defaultValue) {
        return (null != c
                        ? c
                        : defaultValue);
    }

    /**
     * map
     *
     * @param i
     *
     * @return
     */
    public Character map(Integer i) {
        return this.map(i, this.getDefaultValue());
    }

    /**
     * map
     *
     * @param i
     *
     * @return
     */
    public Character map(Integer i, Character defaultValue) {
        Character cRetVal = defaultValue;

        if (null != i && i >= 0 && this.isEvaluateCodePoints()) {
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
    public Character map(String s, boolean bTrim, boolean bEmptyIsNull, Character defaultValue) {
        return this.map(s, bTrim, bEmptyIsNull, this.isEvaluateCodePoints(), defaultValue);
    }

    /**
     * map
     *
     * @param s
     * @param bEvaluateCodePoints
     *
     * @return <p></p>
     */
    public Character map(String s, boolean bEvaluateCodePoints) {
        return this.map(s, bEvaluateCodePoints, this.getDefaultValue());
    }

    /**
     * map
     *
     * @param s
     * @param bEvaluateCodePoints
     * @param defaultValue
     *
     * @return <p></p>
     */
    public Character map(String s, boolean bEvaluateCodePoints, Character defaultValue) {
        return this.map(s, this.isTrimString(), this.isEmptyStringNull(), bEvaluateCodePoints, defaultValue);
    }

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
    public Character map(String s, boolean bTrim, boolean bEmptyIsNull, boolean bEvaluateCodePoints,
                         Character defaultValue) {
        Character cRetVal = defaultValue;
        String preparedString = this.prepare(s, bTrim, bEmptyIsNull);

        if (StringUtils.isNotEmpty(preparedString)) {
            Integer iVal = null;

            if (bEvaluateCodePoints) {
                // Pruefen, ob der String evtl ein Integerwert ist
                iVal = this.getIntegerMapper().map(preparedString, (String) null);
            }

            // ggf Int Wert mappen oder den ersten Character des prepared Strings verwenden
            cRetVal = this.map(iVal, preparedString.charAt(0));
        }
        return cRetVal;
    }
}
