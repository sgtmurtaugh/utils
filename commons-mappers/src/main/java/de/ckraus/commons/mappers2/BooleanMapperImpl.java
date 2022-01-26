package de.ckraus.commons.mappers2;

// TODO: Java 8+ aktionen notwendig (s. Kommentare unten)

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component("booleanMapper")
@Getter
@Setter
@SuppressWarnings({ "javadoc", "unused", "WeakerAccess" })
public class BooleanMapperImpl extends TypeMapperBase<Boolean> implements BooleanMapper {

    private static final Character FALSE_CHAR_0 = '0';
    private static final Character FALSE_CHAR_N = 'N';
    private static final Character FALSE_CHAR_N_LOWERCASE = 'n';
    private static final Character TRUE_CHAR_1 = '1';
    private static final Character TRUE_CHAR_Y = 'Y';
    private static final Character TRUE_CHAR_Y_LOWERCASE = 'y';

    private static final Integer FALSE_INT_0 = 0;
    private static final Integer TRUE_INT_1 = 1;

    private static final String FALSE_STRING_0 = "0";
    private static final String FALSE_STRING_FALSE = "false";
    private static final String FALSE_STRING_N = "n";
    //    private static final String FALSE_STRING_NEIN = "nein";
    private static final String FALSE_STRING_NO = "no";
    private static final String TRUE_STRING_1 = "1";
    private static final String TRUE_STRING_TRUE = "true";
    //    private static final String TRUE_STRING_JA = "ja";
    private static final String TRUE_STRING_Y = "y";
    private static final String TRUE_STRING_YES = "yes";

    private List<Character> falseCharacterValues;
    private List<Character> trueCharacterValues;
    private List<Integer> falseIntegerValues;
    private List<Integer> trueIntegerValues;
    private List<String> falseStringValues;
    private List<String> trueStringValues;


    /**
     * Constructor
     */
    BooleanMapperImpl() {
        super(Boolean.class);
    }

    /**
     * Constructor
     *
     * @param defaultValue
     */
    BooleanMapperImpl(Boolean defaultValue) {
        super(Boolean.class, defaultValue);
    }

    /**
     * Ermittelt eine Instanz per {@link TypeMapperUtils}
     */
    public static BooleanMapper getInstance() {
        return TypeMapperUtils.getBooleanMapper();
    }

    /**
     * getFalseCharacterValues
     *
     * @return
     */
    @SuppressWarnings("Duplicates")
    public List<Character> getFalseCharacterValues() {
        if (null == falseCharacterValues) {
            falseCharacterValues = new ArrayList<>();
            falseCharacterValues.add(FALSE_CHAR_0);
            falseCharacterValues.add(FALSE_CHAR_N);
            falseCharacterValues.add(FALSE_CHAR_N_LOWERCASE);
        }
        return falseCharacterValues;
    }

    /**
     * getFalseIntegerValues
     *
     * @return
     */
    @SuppressWarnings("Duplicates")
    public List<Integer> getFalseIntegerValues() {
        if (null == falseIntegerValues) {
            falseIntegerValues = new ArrayList<>();
            falseIntegerValues.add(FALSE_INT_0);
        }
        return falseIntegerValues;
    }

    /**
     * getFalseStringValues
     *
     * @return
     */
    @SuppressWarnings("Duplicates")
    public List<String> getFalseStringValues() {
        if (null == falseStringValues) {
            falseStringValues = new ArrayList<>();
            falseStringValues.add(FALSE_STRING_0);
            falseStringValues.add(FALSE_STRING_FALSE);
            falseStringValues.add(FALSE_STRING_N);
            //            falseStringValues.add( FALSE_STRING_NEIN );
            falseStringValues.add(FALSE_STRING_NO);
        }
        return falseStringValues;
    }

    /**
     * getTrueCharacterValues
     *
     * @return
     */
    @SuppressWarnings("Duplicates")
    public List<Character> getTrueCharacterValues() {
        if (null == trueCharacterValues) {
            trueCharacterValues = new ArrayList<>();
            trueCharacterValues.add(TRUE_CHAR_1);
            trueCharacterValues.add(TRUE_CHAR_Y);
            trueCharacterValues.add(TRUE_CHAR_Y_LOWERCASE);
        }
        return trueCharacterValues;
    }

    /**
     * getTrueIntegerValues
     *
     * @return
     */
    public List<Integer> getTrueIntegerValues() {
        if (null == trueIntegerValues) {
            trueIntegerValues = new ArrayList<>();
            trueIntegerValues.add(TRUE_INT_1);
        }
        return trueIntegerValues;
    }

    /**
     * getTrueStringValues
     *
     * @return
     */
    @SuppressWarnings("Duplicates")
    public List<String> getTrueStringValues() {
        if (null == trueStringValues) {
            trueStringValues = new ArrayList<>();
            trueStringValues.add(TRUE_STRING_1);
            trueStringValues.add(TRUE_STRING_TRUE);
            trueStringValues.add(TRUE_STRING_Y);
            //            trueStringValues.add( TRUE_STRING_JA );
            trueStringValues.add(TRUE_STRING_YES);
        }
        return trueStringValues;
    }


    /**
     * isFalse
     *
     * @param c
     *
     * @return
     */
    public boolean isFalse(Character c) {
        boolean bIsFalse = false;

        if (null != c) {
            // TODO: Mit Java 8+ wieder einkommentieren und den "alten" Block entfernen!
            //            bIsFalse = this.getFalseCharacterValues().stream().anyMatch( character -> character.equals( c ) );
            for (Character charFalse : this.getFalseCharacterValues()) {
                if (null != charFalse) {
                    bIsFalse = charFalse.equals(c);

                    if (bIsFalse) {
                        break;
                    }
                }
            }
        }
        return bIsFalse;
    }

    /**
     * isFalse
     *
     * @param i
     *
     * @return
     */
    public boolean isFalse(Integer i) {
        boolean bIsFalse = false;

        if (null != i) {
            // TODO: Mit Java 8+ wieder einkommentieren und den "alten" Block entfernen!
            //            bIsFalse = this.getFalseIntegerValues().stream().anyMatch( integer -> integer.equals( i ) );
            for (Integer intFalse : this.getFalseIntegerValues()) {
                if (null != intFalse) {
                    bIsFalse = intFalse.equals(i);

                    if (bIsFalse) {
                        break;
                    }
                }
            }
        }
        return bIsFalse;
    }

    /**
     * isFalse
     *
     * @param s
     *
     * @return
     */
    public boolean isFalse(String s) {
        boolean bIsFalse = false;

        if (null != s) {
            // TODO: Mit Java 8+ wieder einkommentieren und den "alten" Block entfernen!
            //            bIsFalse = this.getFalseStringValues().stream()
            //                           .anyMatch( string -> string.trim().equalsIgnoreCase( s.trim() ) );
            for (String stringFalse : this.getFalseStringValues()) {
                if (null != stringFalse) {
                    bIsFalse = stringFalse.trim().equalsIgnoreCase(s.trim());

                    if (bIsFalse) {
                        break;
                    }
                }
            }
        }
        return bIsFalse;
    }

    /**
     * isTrue
     *
     * @param c
     *
     * @return
     */
    public boolean isTrue(Character c) {
        boolean bIsTrue = false;

        if (null != c) {
            // TODO: Mit Java 8+ wieder einkommentieren und den "alten" Block entfernen!
            //            bIsTrue = this.getTrueCharacterValues().stream().anyMatch( character -> character.equals( c ) );
            for (Character charTrue : this.getTrueCharacterValues()) {
                if (null != charTrue) {
                    bIsTrue = charTrue.equals(c);

                    if (bIsTrue) {
                        break;
                    }
                }
            }
        }
        return bIsTrue;
    }

    /**
     * isTrue
     *
     * @param i
     *
     * @return
     */
    public boolean isTrue(Integer i) {
        boolean bIsTrue = false;

        if (null != i) {
            // TODO: Mit Java 8+ wieder einkommentieren und den "alten" Block entfernen!
            //            bIsTrue = this.getTrueIntegerValues().stream().anyMatch( integer -> integer.equals( i ) );
            for (Integer integerTrue : this.getTrueIntegerValues()) {
                if (null != integerTrue) {
                    bIsTrue = integerTrue.equals(i);

                    if (bIsTrue) {
                        break;
                    }
                }
            }
        }
        return bIsTrue;
    }

    /**
     * isTrue
     *
     * @param s
     *
     * @return
     */
    public boolean isTrue(String s) {
        boolean bIsTrue = false;

        if (null != s) {
            // TODO: Mit Java 8+ wieder einkommentieren und den "alten" Block entfernen!
            //            bIsTrue = this.getTrueStringValues().stream()
            //                          .anyMatch( string -> string.trim().equalsIgnoreCase( s.trim() ) );
            for (String stringTrue : this.getTrueStringValues()) {
                if (null != stringTrue) {
                    bIsTrue = stringTrue.trim().equalsIgnoreCase(s.trim());

                    if (bIsTrue) {
                        break;
                    }
                }
            }
        }
        return bIsTrue;
    }

    /**
     * isMappable
     *
     * @param o
     *
     * @return
     */
    @Override
    public boolean isMappable(Object o) {
        boolean bIsMappable;

        if (null == o) {
            bIsMappable = false;
        }
        else if (o instanceof Boolean) {
            bIsMappable = true;
        }
        else if (o instanceof Character) {
            bIsMappable = (this.isFalse((Character) o) || this.isTrue((Character) o));
        }
        else if (o instanceof Integer) {
            bIsMappable = (this.isFalse((Integer) o) || this.isTrue((Integer) o));
        }
        else if (o instanceof String) {
            bIsMappable = (this.isFalse((String) o) || this.isTrue((String) o));
        }
        else {
            bIsMappable = this.isMappable(o.toString());
        }
        return bIsMappable;
    }

    /**
     * map
     *
     * @param obj
     * @param defaultValue
     *
     * @return
     */
    @Override
    public Boolean mapObject(Object obj, Boolean defaultValue) {
        Boolean e;

        if (null == obj) {
            e = defaultValue;
        }
        else if (obj instanceof Boolean) {
            e = this.map((Boolean) obj, defaultValue);
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
     * @param s - string to map
     * @param bTrim - default flag for string handling
     * @param bEmptyIsNull - default flag for empty string handling
     *
     * @return
     */
    @Override
    public Boolean map(String s, boolean bTrim, boolean bEmptyIsNull) {
        return this.map(s, bTrim, bEmptyIsNull, this.getDefaultValue());
    }

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
    public Boolean map(String s, boolean bTrim, boolean bEmptyIsNull, Boolean defaultValue) {
        Boolean b = defaultValue;
        String preparedString = this.prepare(s, bTrim, bEmptyIsNull);

        if (this.isFalse(preparedString)) {
            b = Boolean.FALSE;
        }
        else if (this.isTrue(preparedString)) {
            b = Boolean.TRUE;
        }
        return b;
    }

    /**
     * map
     *
     * @param b - boolean to map
     */
    public Boolean map(Boolean b) {
        return this.map(b, this.getDefaultValue());
    }

    /**
     * map
     *
     * @param b - boolean to map
     * @param defaultValue - The default value
     *
     * @return
     */
    public Boolean map(Boolean b, Boolean defaultValue) {
        return (null != b
                        ? b
                        : defaultValue);
    }

    /**
     * map
     *
     * @param c - character to map
     */
    public Boolean map(Character c) {
        return this.map(c, this.getDefaultValue());
    }

    /**
     * map
     *
     * @param c - character to map
     * @param defaultValue - The default value
     *
     * @return
     */
    public Boolean map(Character c, Boolean defaultValue) {
        Boolean b = defaultValue;

        if (null != c) {
            if (this.isFalse(c)) {
                b = Boolean.FALSE;
            }
            else if (this.isTrue(c)) {
                b = Boolean.TRUE;
            }
        }
        return b;
    }

    /**
     * map
     *
     * @param i - integer to map
     *
     * @return
     */
    public Boolean map(Integer i) {
        return this.map(i, this.getDefaultValue());
    }

    /**
     * map
     *
     * @param i - integer to map
     * @param defaultValue - The default value
     *
     * @return
     */
    public Boolean map(Integer i, Boolean defaultValue) {
        Boolean b = defaultValue;

        if (null != i) {
            if (this.isFalse(i)) {
                b = Boolean.FALSE;
            }
            else if (this.isTrue(i)) {
                b = Boolean.TRUE;
            }
        }
        return b;
    }

    /**
     * isFalse
     *
     * @param o
     *
     * @return
     */
    public boolean isFalse(Object o) {
        boolean bIsFalse;

        if (null == o) {
            bIsFalse = false;
        }
        else if (o instanceof Boolean) {
            bIsFalse = (o == Boolean.FALSE);
        }
        else if (o instanceof Character) {
            bIsFalse = this.isFalse((Character) o);
        }
        else if (o instanceof Integer) {
            bIsFalse = this.isFalse((Integer) o);
        }
        else if (o instanceof String) {
            bIsFalse = this.isFalse((String) o);
        }
        else {
            bIsFalse = this.isFalse(o.toString());
        }
        return bIsFalse;
    }

    /**
     * isTrue
     *
     * @param o
     *
     * @return
     */
    public boolean isTrue(Object o) {
        boolean bIsTrue;

        if (null == o) {
            bIsTrue = false;
        }
        else if (o instanceof Boolean) {
            bIsTrue = (o == Boolean.TRUE);
        }
        else if (o instanceof Character) {
            bIsTrue = this.isTrue((Character) o);
        }
        else if (o instanceof Integer) {
            bIsTrue = this.isTrue((Integer) o);
        }
        else if (o instanceof String) {
            bIsTrue = this.isTrue((String) o);
        }
        else {
            bIsTrue = this.isTrue(o.toString());
        }
        return bIsTrue;
    }

}
