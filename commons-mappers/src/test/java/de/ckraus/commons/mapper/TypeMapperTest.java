package de.ckraus.commons.mapper;

import org.junit.jupiter.api.Test;

import java.util.Objects;
import java.util.function.Predicate;

import static de.ckraus.commons.mapper.TestHelper.*;
import static org.junit.jupiter.api.Assertions.*;

@SuppressWarnings( { "unchecked", "WeakerAccess" } )
class TypeMapperTest {

    private final static Object ANOTHER_DEFAULT_VALUE = Boolean.TRUE;

    // due to the fact, that all methods delegate to the map(String, boolean, boolean, E) method this dummy
    // implementation (see mapper lambda) all objects are mapped to the mappers given defaultValue!
    private final TypeMapper<Object> mapper = ( str, bTrim, bEmptyIsNull, defVal ) -> defVal;


    /**
     * test for {@link TypeMapper#getDefaultValue()}
     */
    @Test
    void getDefaultValue() {
        assertNull( mapper.getDefaultValue() );
    }

    /**
     * test for {@link TypeMapper#isTrimStrings()}
     */
    @Test
    void isTrimStrings() {
        assertTrue( mapper.isTrimStrings() );
    }

    /**
     * test for {@link TypeMapper#isEmptyStringNull()}
     */
    @Test
    void isEmptyStringNull() {
        assertTrue( mapper.isEmptyStringNull() );
    }

    /**
     * test for {@link TypeMapper#evalPredicate(Predicate, Object)}
     */
    @Test
    void evalPredicate() {
        // success checks
        assertTrue(
                mapper.evalPredicate( ( obj ) -> obj instanceof String, getParameters().get( PARAMS_KEY_STRING ) ) );
        assertTrue( mapper.evalPredicate( Objects::isNull, null ) );

        // fail checks
        assertFalse(
                mapper.evalPredicate( ( obj ) -> obj instanceof Integer, getParameters().get( PARAMS_KEY_STRING ) ) );
    }

    /**
     * test for {@link TypeMapper#isMappable(Object)}
     */
    @Test
    void isMappable() {
        // success checks
        // the default implementation of ITypeMapper#map(String, boolean, boolean, E) returns only the
        // defaultValue! therefore all #isMappable-tests will fail.

        // fail checks
        assertFalse( mapper.isMappable( null ) );
        assertFalse( mapper.isMappable( getParameters().get( PARAMS_KEY_OBJECT ) ) );
        assertFalse( mapper.isMappable( getParameters().get( PARAMS_KEY_STRING ) ) );
        assertFalse( mapper.isMappable( getParameters().get( PARAMS_KEY_STRING_BUILDER ) ) );
        assertFalse( mapper.isMappable( getParameters().get( PARAMS_KEY_LIST ) ) );
    }

// TODO Cleanup
//    /**
//     * test for {@link TypeMapper#mapObject(Object)}
//     */
//    @Test
//    void mapObject() {
//        assertEquals( mapper.getDefaultValue(), mapper.mapObject( getParameters().get( PARAMS_KEY_NO_KEY ) ) );
//        assertEquals( mapper.getDefaultValue(), mapper.mapObject( getParameters().get( PARAMS_KEY_NO_VALUE ) ) );
//
//        assertEquals( getParameters().get(PARAMS_KEY_BIG_DECIMAL), mapper.mapObject( getParameters().get( PARAMS_KEY_BIG_DECIMAL ) ) );
//        assertEquals( getParameters().get(PARAMS_KEY_BIG_DECIMAL_STRING), mapper.mapObject( getParameters().get( PARAMS_KEY_BIG_DECIMAL_STRING ) ) );
//        assertEquals( getParameters().get(PARAMS_KEY_BIG_INTEGER), mapper.mapObject( getParameters().get( PARAMS_KEY_BIG_INTEGER ) ) );
//        assertEquals( getParameters().get(PARAMS_KEY_BIG_INTEGER_STRING), mapper.mapObject( getParameters().get( PARAMS_KEY_BIG_INTEGER_STRING ) ) );
//        assertEquals( getParameters().get(PARAMS_KEY_BOOLEAN), mapper.mapObject( getParameters().get( PARAMS_KEY_BOOLEAN ) ) );
//        assertEquals( getParameters().get(PARAMS_KEY_BOOLEAN_STRING), mapper.mapObject( getParameters().get( PARAMS_KEY_BOOLEAN_STRING ) ) );
//        assertEquals( getParameters().get(PARAMS_KEY_BYTE), mapper.mapObject( getParameters().get( PARAMS_KEY_BYTE ) ) );
//        assertEquals( getParameters().get(PARAMS_KEY_BYTE_STRING), mapper.mapObject( getParameters().get( PARAMS_KEY_BYTE_STRING ) ) );
//        assertEquals( getParameters().get(PARAMS_KEY_CALENDAR), mapper.mapObject( getParameters().get( PARAMS_KEY_CALENDAR ) ) );
//        assertEquals( getParameters().get(PARAMS_KEY_CALENDAR_STRING), mapper.mapObject( getParameters().get( PARAMS_KEY_CALENDAR_STRING ) ) );
//        assertEquals( getParameters().get(PARAMS_KEY_CHARACTER), mapper.mapObject( getParameters().get( PARAMS_KEY_CHARACTER ) ) );
//        assertEquals( getParameters().get(PARAMS_KEY_DOUBLE), mapper.mapObject( getParameters().get( PARAMS_KEY_DOUBLE ) ) );
//        assertEquals( getParameters().get(PARAMS_KEY_DOUBLE_STRING), mapper.mapObject( getParameters().get( PARAMS_KEY_DOUBLE_STRING ) ) );
//        assertEquals( getParameters().get(PARAMS_KEY_FLOAT), mapper.mapObject( getParameters().get( PARAMS_KEY_FLOAT ) ) );
//        assertEquals( getParameters().get(PARAMS_KEY_FLOAT_STRING), mapper.mapObject( getParameters().get( PARAMS_KEY_FLOAT_STRING ) ) );
//        assertEquals( getParameters().get(PARAMS_KEY_INTEGER), mapper.mapObject( getParameters().get( PARAMS_KEY_INTEGER ) ) );
//        assertEquals( getParameters().get(PARAMS_KEY_INTEGER_STRING), mapper.mapObject( getParameters().get( PARAMS_KEY_INTEGER_STRING ) ) );
//        assertEquals( getParameters().get(PARAMS_KEY_LIST), mapper.mapObject( getParameters().get( PARAMS_KEY_LIST ) ) );
//        assertEquals( getParameters().get(PARAMS_KEY_LOCALDATE), mapper.mapObject( getParameters().get( PARAMS_KEY_LOCALDATE ) ) );
//        assertEquals( getParameters().get(PARAMS_KEY_LOCALDATE_STRING), mapper.mapObject( getParameters().get( PARAMS_KEY_LOCALDATE_STRING ) ) );
//        assertEquals( getParameters().get(PARAMS_KEY_LOCALDATETIME), mapper.mapObject( getParameters().get( PARAMS_KEY_LOCALDATETIME ) ) );
//        assertEquals( getParameters().get(PARAMS_KEY_LOCALDATETIME_STRING), mapper.mapObject( getParameters().get( PARAMS_KEY_LOCALDATETIME_STRING ) ) );
//        assertEquals( getParameters().get(PARAMS_KEY_LOCALTIME), mapper.mapObject( getParameters().get( PARAMS_KEY_LOCALTIME ) ) );
//        assertEquals( getParameters().get(PARAMS_KEY_LOCALTIME_STRING), mapper.mapObject( getParameters().get( PARAMS_KEY_LOCALTIME_STRING ) ) );
//        assertEquals( getParameters().get(PARAMS_KEY_LONG), mapper.mapObject( getParameters().get( PARAMS_KEY_LONG ) ) );
//        assertEquals( getParameters().get(PARAMS_KEY_LONG_STRING), mapper.mapObject( getParameters().get( PARAMS_KEY_LONG_STRING ) ) );
//        assertEquals( getParameters().get(PARAMS_KEY_OBJECT), mapper.mapObject( getParameters().get( PARAMS_KEY_OBJECT ) ) );
//        assertEquals( getParameters().get(PARAMS_KEY_SHORT), mapper.mapObject( getParameters().get( PARAMS_KEY_SHORT ) ) );
//        assertEquals( getParameters().get(PARAMS_KEY_SHORT_STRING), mapper.mapObject( getParameters().get( PARAMS_KEY_SHORT_STRING ) ) );
//        assertEquals( getParameters().get(PARAMS_KEY_STRING), mapper.mapObject( getParameters().get( PARAMS_KEY_STRING ) ) );
//        assertEquals( getParameters().get(PARAMS_KEY_STRING__EMPTY), mapper.mapObject( getParameters().get( PARAMS_KEY_STRING__EMPTY ) ) );
//        assertEquals( getParameters().get(PARAMS_KEY_STRING__UNTRIMMED), mapper.mapObject( getParameters().get( PARAMS_KEY_STRING__UNTRIMMED ) ) );
//        assertEquals( getParameters().get(PARAMS_KEY_STRING__UNTRIMMED_EMPTY), mapper.mapObject( getParameters().get( PARAMS_KEY_STRING__UNTRIMMED_EMPTY ) ) );
//        assertEquals( getParameters().get(PARAMS_KEY_STRING_BUILDER), mapper.mapObject( getParameters().get( PARAMS_KEY_STRING_BUILDER ) ) );
//    }

// TODO Cleanup
//    /**
//     * test for {@link TypeMapper#mapObject(Object, Object)}
//     */
//    @Test
//    void mapObject2() {
//        assertEquals( ANOTHER_DEFAULT_VALUE,
//                mapper.mapObject( getParameters().get( PARAMS_KEY_NO_KEY ), ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( ANOTHER_DEFAULT_VALUE,
//                mapper.mapObject( getParameters().get( PARAMS_KEY_NO_VALUE ), ANOTHER_DEFAULT_VALUE ) );
//
//        assertEquals( getParameters().get(PARAMS_KEY_BIG_DECIMAL),
//                mapper.mapObject( getParameters().get( PARAMS_KEY_BIG_DECIMAL ), ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( getParameters().get(PARAMS_KEY_BIG_DECIMAL_STRING),
//                mapper.mapObject( getParameters().get( PARAMS_KEY_BIG_DECIMAL_STRING ), ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( getParameters().get(PARAMS_KEY_BIG_INTEGER),
//                mapper.mapObject( getParameters().get( PARAMS_KEY_BIG_INTEGER ), ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( getParameters().get(PARAMS_KEY_BIG_INTEGER_STRING),
//                mapper.mapObject( getParameters().get( PARAMS_KEY_BIG_INTEGER_STRING ), ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( getParameters().get(PARAMS_KEY_BOOLEAN),
//                mapper.mapObject( getParameters().get( PARAMS_KEY_BOOLEAN ), ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( getParameters().get(PARAMS_KEY_BOOLEAN_STRING),
//                mapper.mapObject( getParameters().get( PARAMS_KEY_BOOLEAN_STRING ), ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( getParameters().get(PARAMS_KEY_BYTE),
//                mapper.mapObject( getParameters().get( PARAMS_KEY_BYTE ), ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( getParameters().get(PARAMS_KEY_BYTE_STRING),
//                mapper.mapObject( getParameters().get( PARAMS_KEY_BYTE_STRING ), ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( getParameters().get(PARAMS_KEY_CALENDAR),
//                mapper.mapObject( getParameters().get( PARAMS_KEY_CALENDAR ), ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( getParameters().get(PARAMS_KEY_CALENDAR_STRING),
//                mapper.mapObject( getParameters().get( PARAMS_KEY_CALENDAR_STRING ), ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( getParameters().get(PARAMS_KEY_CHARACTER),
//                mapper.mapObject( getParameters().get( PARAMS_KEY_CHARACTER ), ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( getParameters().get(PARAMS_KEY_DOUBLE),
//                mapper.mapObject( getParameters().get( PARAMS_KEY_DOUBLE ), ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( getParameters().get(PARAMS_KEY_DOUBLE_STRING),
//                mapper.mapObject( getParameters().get( PARAMS_KEY_DOUBLE_STRING ), ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( getParameters().get(PARAMS_KEY_FLOAT),
//                mapper.mapObject( getParameters().get( PARAMS_KEY_FLOAT ), ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( getParameters().get(PARAMS_KEY_FLOAT_STRING),
//                mapper.mapObject( getParameters().get( PARAMS_KEY_FLOAT_STRING ), ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( getParameters().get(PARAMS_KEY_INTEGER),
//                mapper.mapObject( getParameters().get( PARAMS_KEY_INTEGER ), ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( getParameters().get(PARAMS_KEY_INTEGER_STRING),
//                mapper.mapObject( getParameters().get( PARAMS_KEY_INTEGER_STRING ), ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( getParameters().get(PARAMS_KEY_LIST),
//                mapper.mapObject( getParameters().get( PARAMS_KEY_LIST ), ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( getParameters().get(PARAMS_KEY_LOCALDATE),
//                mapper.mapObject( getParameters().get( PARAMS_KEY_LOCALDATE ), ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( getParameters().get(PARAMS_KEY_LOCALDATE_STRING),
//                mapper.mapObject( getParameters().get( PARAMS_KEY_LOCALDATE_STRING ), ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( getParameters().get(PARAMS_KEY_LOCALDATETIME),
//                mapper.mapObject( getParameters().get( PARAMS_KEY_LOCALDATETIME ), ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( getParameters().get(PARAMS_KEY_LOCALDATETIME_STRING),
//                mapper.mapObject( getParameters().get( PARAMS_KEY_LOCALDATETIME_STRING ), ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( getParameters().get(PARAMS_KEY_LOCALTIME),
//                mapper.mapObject( getParameters().get( PARAMS_KEY_LOCALTIME ), ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( getParameters().get(PARAMS_KEY_LOCALTIME_STRING),
//                mapper.mapObject( getParameters().get( PARAMS_KEY_LOCALTIME_STRING ), ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( getParameters().get(PARAMS_KEY_LONG),
//                mapper.mapObject( getParameters().get( PARAMS_KEY_LONG ), ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( getParameters().get(PARAMS_KEY_LONG_STRING),
//                mapper.mapObject( getParameters().get( PARAMS_KEY_LONG_STRING ), ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( getParameters().get(PARAMS_KEY_OBJECT),
//                mapper.mapObject( getParameters().get( PARAMS_KEY_OBJECT ), ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( getParameters().get(PARAMS_KEY_SHORT),
//                mapper.mapObject( getParameters().get( PARAMS_KEY_SHORT ), ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( getParameters().get(PARAMS_KEY_SHORT_STRING),
//                mapper.mapObject( getParameters().get( PARAMS_KEY_SHORT_STRING ), ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( getParameters().get(PARAMS_KEY_STRING),
//                mapper.mapObject( getParameters().get( PARAMS_KEY_STRING ), ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( getParameters().get(PARAMS_KEY_STRING__EMPTY),
//                mapper.mapObject( getParameters().get( PARAMS_KEY_STRING__EMPTY ), ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( getParameters().get(PARAMS_KEY_STRING__UNTRIMMED),
//                mapper.mapObject( getParameters().get( PARAMS_KEY_STRING__UNTRIMMED ), ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( getParameters().get(PARAMS_KEY_STRING__UNTRIMMED_EMPTY),
//                mapper.mapObject( getParameters().get( PARAMS_KEY_STRING__UNTRIMMED_EMPTY ), ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( getParameters().get(PARAMS_KEY_STRING_BUILDER),
//                mapper.mapObject( getParameters().get( PARAMS_KEY_STRING_BUILDER ), ANOTHER_DEFAULT_VALUE ) );
//    }

// TODO Cleanup
//    /**
//     * test for {@link TypeMapper#map(Map, String)}
//     */
//    @Test
//    void map() {
//        assertEquals( mapper.getDefaultValue(), mapper.map( getParameters(), PARAMS_KEY_NO_KEY ) );
//        assertEquals( mapper.getDefaultValue(), mapper.map( getParameters(), PARAMS_KEY_NO_VALUE ) );
//
//        assertEquals( mapper.getDefaultValue(), mapper.map( getParameters(), PARAMS_KEY_BIG_DECIMAL ) );
//        assertEquals( mapper.getDefaultValue(), mapper.map( getParameters(), PARAMS_KEY_BIG_DECIMAL_STRING ) );
//        assertEquals( mapper.getDefaultValue(), mapper.map( getParameters(), PARAMS_KEY_BIG_INTEGER ) );
//        assertEquals( mapper.getDefaultValue(), mapper.map( getParameters(), PARAMS_KEY_BIG_INTEGER_STRING ) );
//        assertEquals( mapper.getDefaultValue(), mapper.map( getParameters(), PARAMS_KEY_BOOLEAN ) );
//        assertEquals( mapper.getDefaultValue(), mapper.map( getParameters(), PARAMS_KEY_BOOLEAN_STRING ) );
//        assertEquals( mapper.getDefaultValue(), mapper.map( getParameters(), PARAMS_KEY_BYTE ) );
//        assertEquals( mapper.getDefaultValue(), mapper.map( getParameters(), PARAMS_KEY_BYTE_STRING ) );
//        assertEquals( mapper.getDefaultValue(), mapper.map( getParameters(), PARAMS_KEY_CALENDAR ) );
//        assertEquals( mapper.getDefaultValue(), mapper.map( getParameters(), PARAMS_KEY_CALENDAR_STRING ) );
//        assertEquals( mapper.getDefaultValue(), mapper.map( getParameters(), PARAMS_KEY_CHARACTER ) );
//        assertEquals( mapper.getDefaultValue(), mapper.map( getParameters(), PARAMS_KEY_DOUBLE ) );
//        assertEquals( mapper.getDefaultValue(), mapper.map( getParameters(), PARAMS_KEY_DOUBLE_STRING ) );
//        assertEquals( mapper.getDefaultValue(), mapper.map( getParameters(), PARAMS_KEY_FLOAT ) );
//        assertEquals( mapper.getDefaultValue(), mapper.map( getParameters(), PARAMS_KEY_FLOAT_STRING ) );
//        assertEquals( mapper.getDefaultValue(), mapper.map( getParameters(), PARAMS_KEY_INTEGER ) );
//        assertEquals( mapper.getDefaultValue(), mapper.map( getParameters(), PARAMS_KEY_INTEGER_STRING ) );
//        assertEquals( mapper.getDefaultValue(), mapper.map( getParameters(), PARAMS_KEY_LIST ) );
//        assertEquals( mapper.getDefaultValue(), mapper.map( getParameters(), PARAMS_KEY_LOCALDATE ) );
//        assertEquals( mapper.getDefaultValue(), mapper.map( getParameters(), PARAMS_KEY_LOCALDATE_STRING ) );
//        assertEquals( mapper.getDefaultValue(), mapper.map( getParameters(), PARAMS_KEY_LOCALDATETIME ) );
//        assertEquals( mapper.getDefaultValue(), mapper.map( getParameters(), PARAMS_KEY_LOCALDATETIME_STRING ) );
//        assertEquals( mapper.getDefaultValue(), mapper.map( getParameters(), PARAMS_KEY_LOCALTIME ) );
//        assertEquals( mapper.getDefaultValue(), mapper.map( getParameters(), PARAMS_KEY_LOCALTIME_STRING ) );
//        assertEquals( mapper.getDefaultValue(), mapper.map( getParameters(), PARAMS_KEY_LONG ) );
//        assertEquals( mapper.getDefaultValue(), mapper.map( getParameters(), PARAMS_KEY_LONG_STRING ) );
//        assertEquals( mapper.getDefaultValue(), mapper.map( getParameters(), PARAMS_KEY_OBJECT ) );
//        assertEquals( mapper.getDefaultValue(), mapper.map( getParameters(), PARAMS_KEY_SHORT ) );
//        assertEquals( mapper.getDefaultValue(), mapper.map( getParameters(), PARAMS_KEY_SHORT_STRING ) );
//        assertEquals( mapper.getDefaultValue(), mapper.map( getParameters(), PARAMS_KEY_STRING ) );
//        assertEquals( mapper.getDefaultValue(), mapper.map( getParameters(), PARAMS_KEY_STRING__EMPTY ) );
//        assertEquals( mapper.getDefaultValue(), mapper.map( getParameters(), PARAMS_KEY_STRING__UNTRIMMED ) );
//        assertEquals( mapper.getDefaultValue(), mapper.map( getParameters(), PARAMS_KEY_STRING__UNTRIMMED_EMPTY ) );
//        assertEquals( mapper.getDefaultValue(), mapper.map( getParameters(), PARAMS_KEY_STRING_BUILDER ) );
//    }

// TODO Cleanup
//    /**
//     * test for {@link TypeMapper#map(Map, String, Object)}
//     */
//    @Test
//    void map1() {
//        // check default value
//        assertEquals( ANOTHER_DEFAULT_VALUE, mapper.map( getParameters(), PARAMS_KEY_NO_KEY, ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( ANOTHER_DEFAULT_VALUE,
//                mapper.map( getParameters(), PARAMS_KEY_NO_VALUE, ANOTHER_DEFAULT_VALUE ) );
//
//        assertEquals( ANOTHER_DEFAULT_VALUE,
//                mapper.map( getParameters(), PARAMS_KEY_BIG_DECIMAL, ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( ANOTHER_DEFAULT_VALUE,
//                mapper.map( getParameters(), PARAMS_KEY_BIG_DECIMAL_STRING, ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( ANOTHER_DEFAULT_VALUE,
//                mapper.map( getParameters(), PARAMS_KEY_BIG_INTEGER, ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( ANOTHER_DEFAULT_VALUE,
//                mapper.map( getParameters(), PARAMS_KEY_BIG_INTEGER_STRING, ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( ANOTHER_DEFAULT_VALUE,
//                mapper.map( getParameters(), PARAMS_KEY_BOOLEAN, ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( ANOTHER_DEFAULT_VALUE,
//                mapper.map( getParameters(), PARAMS_KEY_BOOLEAN_STRING, ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( ANOTHER_DEFAULT_VALUE, mapper.map( getParameters(), PARAMS_KEY_BYTE, ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( ANOTHER_DEFAULT_VALUE,
//                mapper.map( getParameters(), PARAMS_KEY_BYTE_STRING, ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( ANOTHER_DEFAULT_VALUE,
//                mapper.map( getParameters(), PARAMS_KEY_CALENDAR, ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( ANOTHER_DEFAULT_VALUE,
//                mapper.map( getParameters(), PARAMS_KEY_CALENDAR_STRING, ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( ANOTHER_DEFAULT_VALUE,
//                mapper.map( getParameters(), PARAMS_KEY_CHARACTER, ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( ANOTHER_DEFAULT_VALUE, mapper.map( getParameters(), PARAMS_KEY_DOUBLE, ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( ANOTHER_DEFAULT_VALUE,
//                mapper.map( getParameters(), PARAMS_KEY_DOUBLE_STRING, ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( ANOTHER_DEFAULT_VALUE, mapper.map( getParameters(), PARAMS_KEY_FLOAT, ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( ANOTHER_DEFAULT_VALUE,
//                mapper.map( getParameters(), PARAMS_KEY_FLOAT_STRING, ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( ANOTHER_DEFAULT_VALUE,
//                mapper.map( getParameters(), PARAMS_KEY_INTEGER, ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( ANOTHER_DEFAULT_VALUE,
//                mapper.map( getParameters(), PARAMS_KEY_INTEGER_STRING, ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( ANOTHER_DEFAULT_VALUE, mapper.map( getParameters(), PARAMS_KEY_LIST, ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( ANOTHER_DEFAULT_VALUE,
//                mapper.map( getParameters(), PARAMS_KEY_LOCALDATE, ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( ANOTHER_DEFAULT_VALUE,
//                mapper.map( getParameters(), PARAMS_KEY_LOCALDATE_STRING, ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( ANOTHER_DEFAULT_VALUE,
//                mapper.map( getParameters(), PARAMS_KEY_LOCALDATETIME, ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( ANOTHER_DEFAULT_VALUE,
//                mapper.map( getParameters(), PARAMS_KEY_LOCALDATETIME_STRING, ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( ANOTHER_DEFAULT_VALUE,
//                mapper.map( getParameters(), PARAMS_KEY_LOCALTIME, ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( ANOTHER_DEFAULT_VALUE,
//                mapper.map( getParameters(), PARAMS_KEY_LOCALTIME_STRING, ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( ANOTHER_DEFAULT_VALUE, mapper.map( getParameters(), PARAMS_KEY_LONG, ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( ANOTHER_DEFAULT_VALUE,
//                mapper.map( getParameters(), PARAMS_KEY_LONG_STRING, ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( ANOTHER_DEFAULT_VALUE, mapper.map( getParameters(), PARAMS_KEY_OBJECT, ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( ANOTHER_DEFAULT_VALUE, mapper.map( getParameters(), PARAMS_KEY_SHORT, ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( ANOTHER_DEFAULT_VALUE,
//                mapper.map( getParameters(), PARAMS_KEY_SHORT_STRING, ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( ANOTHER_DEFAULT_VALUE, mapper.map( getParameters(), PARAMS_KEY_STRING, ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( ANOTHER_DEFAULT_VALUE,
//                mapper.map( getParameters(), PARAMS_KEY_STRING__EMPTY, ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( ANOTHER_DEFAULT_VALUE,
//                mapper.map( getParameters(), PARAMS_KEY_STRING__UNTRIMMED, ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( ANOTHER_DEFAULT_VALUE,
//                mapper.map( getParameters(), PARAMS_KEY_STRING__UNTRIMMED_EMPTY, ANOTHER_DEFAULT_VALUE ) );
//        assertEquals( ANOTHER_DEFAULT_VALUE,
//                mapper.map( getParameters(), PARAMS_KEY_STRING_BUILDER, ANOTHER_DEFAULT_VALUE ) );
//    }

    /**
     * test for {@link TypeMapper#map(Object)}
     */
    @Test
    void map2() {

        assertEquals( mapper.getDefaultValue(), mapper.map( getParameters().get( PARAMS_KEY_NO_KEY ) ) );
        assertEquals( mapper.getDefaultValue(), mapper.map( getParameters().get( PARAMS_KEY_NO_VALUE ) ) );

        assertEquals( getParameters().get( PARAMS_KEY_BIG_DECIMAL ), mapper.map( getParameters().get( PARAMS_KEY_BIG_DECIMAL ) ) );
        assertEquals( getParameters().get( PARAMS_KEY_BIG_DECIMAL_STRING ), mapper.map( getParameters().get( PARAMS_KEY_BIG_DECIMAL_STRING ) ) );
        assertEquals( getParameters().get( PARAMS_KEY_BIG_INTEGER ), mapper.map( getParameters().get( PARAMS_KEY_BIG_INTEGER ) ) );
        assertEquals( getParameters().get( PARAMS_KEY_BIG_INTEGER_STRING ), mapper.map( getParameters().get( PARAMS_KEY_BIG_INTEGER_STRING ) ) );
        assertEquals( getParameters().get( PARAMS_KEY_BOOLEAN ), mapper.map( getParameters().get( PARAMS_KEY_BOOLEAN ) ) );
        assertEquals( getParameters().get( PARAMS_KEY_BOOLEAN_STRING ), mapper.map( getParameters().get( PARAMS_KEY_BOOLEAN_STRING ) ) );
        assertEquals( getParameters().get( PARAMS_KEY_BYTE ), mapper.map( getParameters().get( PARAMS_KEY_BYTE ) ) );
        assertEquals( getParameters().get( PARAMS_KEY_BYTE_STRING ), mapper.map( getParameters().get( PARAMS_KEY_BYTE_STRING ) ) );
        assertEquals( getParameters().get( PARAMS_KEY_CALENDAR ), mapper.map( getParameters().get( PARAMS_KEY_CALENDAR ) ) );
        assertEquals( getParameters().get( PARAMS_KEY_CALENDAR_STRING ), mapper.map( getParameters().get( PARAMS_KEY_CALENDAR_STRING ) ) );
        assertEquals( getParameters().get( PARAMS_KEY_CHARACTER ), mapper.map( getParameters().get( PARAMS_KEY_CHARACTER ) ) );
        assertEquals( getParameters().get( PARAMS_KEY_DOUBLE ), mapper.map( getParameters().get( PARAMS_KEY_DOUBLE ) ) );
        assertEquals( getParameters().get( PARAMS_KEY_DOUBLE_STRING ), mapper.map( getParameters().get( PARAMS_KEY_DOUBLE_STRING ) ) );
        assertEquals( getParameters().get( PARAMS_KEY_FLOAT ), mapper.map( getParameters().get( PARAMS_KEY_FLOAT ) ) );
        assertEquals( getParameters().get( PARAMS_KEY_FLOAT_STRING ), mapper.map( getParameters().get( PARAMS_KEY_FLOAT_STRING ) ) );
        assertEquals( getParameters().get( PARAMS_KEY_INTEGER ), mapper.map( getParameters().get( PARAMS_KEY_INTEGER ) ) );
        assertEquals( getParameters().get( PARAMS_KEY_INTEGER_STRING ), mapper.map( getParameters().get( PARAMS_KEY_INTEGER_STRING ) ) );
        assertEquals( getParameters().get( PARAMS_KEY_LIST ), mapper.map( getParameters().get( PARAMS_KEY_LIST ) ) );
        assertEquals( getParameters().get( PARAMS_KEY_LOCALDATE ), mapper.map( getParameters().get( PARAMS_KEY_LOCALDATE ) ) );
        assertEquals( getParameters().get( PARAMS_KEY_LOCALDATE_STRING ), mapper.map( getParameters().get( PARAMS_KEY_LOCALDATE_STRING ) ) );
        assertEquals( getParameters().get( PARAMS_KEY_LOCALDATETIME ), mapper.map( getParameters().get( PARAMS_KEY_LOCALDATETIME ) ) );
        assertEquals( getParameters().get( PARAMS_KEY_LOCALDATETIME_STRING ), mapper.map( getParameters().get( PARAMS_KEY_LOCALDATETIME_STRING ) ) );
        assertEquals( getParameters().get( PARAMS_KEY_LOCALTIME ), mapper.map( getParameters().get( PARAMS_KEY_LOCALTIME ) ) );
        assertEquals( getParameters().get( PARAMS_KEY_LOCALTIME_STRING ), mapper.map( getParameters().get( PARAMS_KEY_LOCALTIME_STRING ) ) );
        assertEquals( getParameters().get( PARAMS_KEY_LONG ), mapper.map( getParameters().get( PARAMS_KEY_LONG ) ) );
        assertEquals( getParameters().get( PARAMS_KEY_LONG_STRING ), mapper.map( getParameters().get( PARAMS_KEY_LONG_STRING ) ) );
        assertEquals( getParameters().get( PARAMS_KEY_OBJECT ), mapper.map( getParameters().get( PARAMS_KEY_OBJECT ) ) );
        assertEquals( getParameters().get( PARAMS_KEY_SHORT ), mapper.map( getParameters().get( PARAMS_KEY_SHORT ) ) );
        assertEquals( getParameters().get( PARAMS_KEY_SHORT_STRING ), mapper.map( getParameters().get( PARAMS_KEY_SHORT_STRING ) ) );
        assertEquals( getParameters().get( PARAMS_KEY_STRING ), mapper.map( getParameters().get( PARAMS_KEY_STRING ) ) );
        assertEquals( getParameters().get( PARAMS_KEY_STRING__EMPTY ), mapper.map( getParameters().get( PARAMS_KEY_STRING__EMPTY ) ) );
        assertEquals( getParameters().get( PARAMS_KEY_STRING__UNTRIMMED ), mapper.map( getParameters().get( PARAMS_KEY_STRING__UNTRIMMED ) ) );
        assertEquals( getParameters().get( PARAMS_KEY_STRING__UNTRIMMED_EMPTY ),
                mapper.map( getParameters().get( PARAMS_KEY_STRING__UNTRIMMED_EMPTY ) ) );
        assertEquals( getParameters().get( PARAMS_KEY_STRING_BUILDER ), mapper.map( getParameters().get( PARAMS_KEY_STRING_BUILDER ) ) );
    }

    /**
     * test for {@link TypeMapper#map(Object, Object)}
     */
    @Test
    void map3() {
        assertEquals( ANOTHER_DEFAULT_VALUE,
                mapper.map( getParameters().get( PARAMS_KEY_NO_KEY ), ANOTHER_DEFAULT_VALUE ) );
        assertEquals( ANOTHER_DEFAULT_VALUE,
                mapper.map( getParameters().get( PARAMS_KEY_NO_VALUE ), ANOTHER_DEFAULT_VALUE ) );

        assertEquals( getParameters().get( PARAMS_KEY_BIG_DECIMAL ),
                mapper.map( getParameters().get( PARAMS_KEY_BIG_DECIMAL ), ANOTHER_DEFAULT_VALUE ) );
        assertEquals( getParameters().get( PARAMS_KEY_BIG_DECIMAL_STRING ),
                mapper.map( getParameters().get( PARAMS_KEY_BIG_DECIMAL_STRING ), ANOTHER_DEFAULT_VALUE ) );
        assertEquals( getParameters().get( PARAMS_KEY_BIG_INTEGER ),
                mapper.map( getParameters().get( PARAMS_KEY_BIG_INTEGER ), ANOTHER_DEFAULT_VALUE ) );
        assertEquals( getParameters().get( PARAMS_KEY_BIG_INTEGER_STRING ),
                mapper.map( getParameters().get( PARAMS_KEY_BIG_INTEGER_STRING ), ANOTHER_DEFAULT_VALUE ) );
        assertEquals( getParameters().get( PARAMS_KEY_BOOLEAN ),
                mapper.map( getParameters().get( PARAMS_KEY_BOOLEAN ), ANOTHER_DEFAULT_VALUE ) );
        assertEquals( getParameters().get( PARAMS_KEY_BOOLEAN_STRING ),
                mapper.map( getParameters().get( PARAMS_KEY_BOOLEAN_STRING ), ANOTHER_DEFAULT_VALUE ) );
        assertEquals( getParameters().get( PARAMS_KEY_BYTE ),
                mapper.map( getParameters().get( PARAMS_KEY_BYTE ), ANOTHER_DEFAULT_VALUE ) );
        assertEquals( getParameters().get( PARAMS_KEY_BYTE_STRING ),
                mapper.map( getParameters().get( PARAMS_KEY_BYTE_STRING ), ANOTHER_DEFAULT_VALUE ) );
        assertEquals( getParameters().get( PARAMS_KEY_CALENDAR ),
                mapper.map( getParameters().get( PARAMS_KEY_CALENDAR ), ANOTHER_DEFAULT_VALUE ) );
        assertEquals( getParameters().get( PARAMS_KEY_CALENDAR_STRING ),
                mapper.map( getParameters().get( PARAMS_KEY_CALENDAR_STRING ), ANOTHER_DEFAULT_VALUE ) );
        assertEquals( getParameters().get( PARAMS_KEY_CHARACTER ),
                mapper.map( getParameters().get( PARAMS_KEY_CHARACTER ), ANOTHER_DEFAULT_VALUE ) );
        assertEquals( getParameters().get( PARAMS_KEY_DOUBLE ),
                mapper.map( getParameters().get( PARAMS_KEY_DOUBLE ), ANOTHER_DEFAULT_VALUE ) );
        assertEquals( getParameters().get( PARAMS_KEY_DOUBLE_STRING ),
                mapper.map( getParameters().get( PARAMS_KEY_DOUBLE_STRING ), ANOTHER_DEFAULT_VALUE ) );
        assertEquals( getParameters().get( PARAMS_KEY_FLOAT ),
                mapper.map( getParameters().get( PARAMS_KEY_FLOAT ), ANOTHER_DEFAULT_VALUE ) );
        assertEquals( getParameters().get( PARAMS_KEY_FLOAT_STRING ),
                mapper.map( getParameters().get( PARAMS_KEY_FLOAT_STRING ), ANOTHER_DEFAULT_VALUE ) );
        assertEquals( getParameters().get( PARAMS_KEY_INTEGER ),
                mapper.map( getParameters().get( PARAMS_KEY_INTEGER ), ANOTHER_DEFAULT_VALUE ) );
        assertEquals( getParameters().get( PARAMS_KEY_INTEGER_STRING ),
                mapper.map( getParameters().get( PARAMS_KEY_INTEGER_STRING ), ANOTHER_DEFAULT_VALUE ) );
        assertEquals( getParameters().get( PARAMS_KEY_LIST ),
                mapper.map( getParameters().get( PARAMS_KEY_LIST ), ANOTHER_DEFAULT_VALUE ) );
        assertEquals( getParameters().get( PARAMS_KEY_LOCALDATE ),
                mapper.map( getParameters().get( PARAMS_KEY_LOCALDATE ), ANOTHER_DEFAULT_VALUE ) );
        assertEquals( getParameters().get( PARAMS_KEY_LOCALDATE_STRING ),
                mapper.map( getParameters().get( PARAMS_KEY_LOCALDATE_STRING ), ANOTHER_DEFAULT_VALUE ) );
        assertEquals( getParameters().get( PARAMS_KEY_LOCALDATETIME ),
                mapper.map( getParameters().get( PARAMS_KEY_LOCALDATETIME ), ANOTHER_DEFAULT_VALUE ) );
        assertEquals( getParameters().get( PARAMS_KEY_LOCALDATETIME_STRING ),
                mapper.map( getParameters().get( PARAMS_KEY_LOCALDATETIME_STRING ), ANOTHER_DEFAULT_VALUE ) );
        assertEquals( getParameters().get( PARAMS_KEY_LOCALTIME ),
                mapper.map( getParameters().get( PARAMS_KEY_LOCALTIME ), ANOTHER_DEFAULT_VALUE ) );
        assertEquals( getParameters().get( PARAMS_KEY_LOCALTIME_STRING ),
                mapper.map( getParameters().get( PARAMS_KEY_LOCALTIME_STRING ), ANOTHER_DEFAULT_VALUE ) );
        assertEquals( getParameters().get( PARAMS_KEY_LONG ),
                mapper.map( getParameters().get( PARAMS_KEY_LONG ), ANOTHER_DEFAULT_VALUE ) );
        assertEquals( getParameters().get( PARAMS_KEY_LONG_STRING ),
                mapper.map( getParameters().get( PARAMS_KEY_LONG_STRING ), ANOTHER_DEFAULT_VALUE ) );
        assertEquals( getParameters().get( PARAMS_KEY_OBJECT ),
                mapper.map( getParameters().get( PARAMS_KEY_OBJECT ), ANOTHER_DEFAULT_VALUE ) );
        assertEquals( getParameters().get( PARAMS_KEY_SHORT ),
                mapper.map( getParameters().get( PARAMS_KEY_SHORT ), ANOTHER_DEFAULT_VALUE ) );
        assertEquals( getParameters().get( PARAMS_KEY_SHORT_STRING ),
                mapper.map( getParameters().get( PARAMS_KEY_SHORT_STRING ), ANOTHER_DEFAULT_VALUE ) );
        assertEquals( getParameters().get( PARAMS_KEY_STRING ),
                mapper.map( getParameters().get( PARAMS_KEY_STRING ), ANOTHER_DEFAULT_VALUE ) );
        assertEquals( getParameters().get( PARAMS_KEY_STRING__EMPTY ),
                mapper.map( getParameters().get( PARAMS_KEY_STRING__EMPTY ), ANOTHER_DEFAULT_VALUE ) );
        assertEquals( getParameters().get( PARAMS_KEY_STRING__UNTRIMMED ),
                mapper.map( getParameters().get( PARAMS_KEY_STRING__UNTRIMMED ), ANOTHER_DEFAULT_VALUE ) );
        assertEquals( getParameters().get( PARAMS_KEY_STRING__UNTRIMMED_EMPTY ),
                mapper.map( getParameters().get( PARAMS_KEY_STRING__UNTRIMMED_EMPTY ), ANOTHER_DEFAULT_VALUE ) );
        assertEquals( getParameters().get( PARAMS_KEY_STRING_BUILDER ),
                mapper.map( getParameters().get( PARAMS_KEY_STRING_BUILDER ), ANOTHER_DEFAULT_VALUE ) );
    }

    /**
     * test for {@link TypeMapper#map(String)}
     */
    @Test
    void map4() {
        assertEquals( getParameters().get( PARAMS_KEY_STRING ), mapper.map( getParameters().get( PARAMS_KEY_STRING ) ) );
        assertEquals( getParameters().get( PARAMS_KEY_STRING__EMPTY ), mapper.map( getParameters().get( PARAMS_KEY_STRING__EMPTY ) ) );
        assertEquals( getParameters().get( PARAMS_KEY_STRING__UNTRIMMED ), mapper.map( getParameters().get( PARAMS_KEY_STRING__UNTRIMMED ) ) );
        assertEquals( getParameters().get( PARAMS_KEY_STRING__UNTRIMMED_EMPTY ),
                mapper.map( getParameters().get( PARAMS_KEY_STRING__UNTRIMMED_EMPTY ) ) );
    }

    /**
     * test for {@link TypeMapper#map(String, Object)}
     */
    @Test
    void map5() {
        assertEquals( getParameters().get( PARAMS_KEY_STRING ),
                mapper.map( getParameters().get( PARAMS_KEY_STRING ), ANOTHER_DEFAULT_VALUE ) );
        assertEquals( getParameters().get( PARAMS_KEY_STRING__EMPTY ),
                mapper.map( getParameters().get( PARAMS_KEY_STRING__EMPTY ), ANOTHER_DEFAULT_VALUE ) );
        assertEquals( getParameters().get( PARAMS_KEY_STRING__UNTRIMMED ),
                mapper.map( getParameters().get( PARAMS_KEY_STRING__UNTRIMMED ), ANOTHER_DEFAULT_VALUE ) );
        assertEquals( getParameters().get( PARAMS_KEY_STRING__UNTRIMMED_EMPTY ),
                mapper.map( getParameters().get( PARAMS_KEY_STRING__UNTRIMMED_EMPTY ), ANOTHER_DEFAULT_VALUE ) );
    }

    /**
     * test for {@link TypeMapper#map(String, boolean, boolean)}
     */
    @Test
    void map6() {
        assertEquals( mapper.getDefaultValue(),
                mapper.map( ( String ) getParameters().get( PARAMS_KEY_STRING ), false, false ) );
        assertEquals( mapper.getDefaultValue(),
                mapper.map( ( String ) getParameters().get( PARAMS_KEY_STRING ), false, true ) );
        assertEquals( mapper.getDefaultValue(),
                mapper.map( ( String ) getParameters().get( PARAMS_KEY_STRING ), true, false ) );
        assertEquals( mapper.getDefaultValue(),
                mapper.map( ( String ) getParameters().get( PARAMS_KEY_STRING ), true, true ) );

        assertEquals( mapper.getDefaultValue(),
                mapper.map( ( String ) getParameters().get( PARAMS_KEY_STRING__EMPTY ), false, false ) );
        assertEquals( mapper.getDefaultValue(),
                mapper.map( ( String ) getParameters().get( PARAMS_KEY_STRING__EMPTY ), false, true ) );
        assertEquals( mapper.getDefaultValue(),
                mapper.map( ( String ) getParameters().get( PARAMS_KEY_STRING__EMPTY ), true, false ) );
        assertEquals( mapper.getDefaultValue(),
                mapper.map( ( String ) getParameters().get( PARAMS_KEY_STRING__EMPTY ), true, true ) );

        assertEquals( mapper.getDefaultValue(),
                mapper.map( ( String ) getParameters().get( PARAMS_KEY_STRING__UNTRIMMED ), false, false ) );
        assertEquals( mapper.getDefaultValue(),
                mapper.map( ( String ) getParameters().get( PARAMS_KEY_STRING__UNTRIMMED ), false, true ) );
        assertEquals( mapper.getDefaultValue(),
                mapper.map( ( String ) getParameters().get( PARAMS_KEY_STRING__UNTRIMMED ), true, false ) );
        assertEquals( mapper.getDefaultValue(),
                mapper.map( ( String ) getParameters().get( PARAMS_KEY_STRING__UNTRIMMED ), true, true ) );

        assertEquals( mapper.getDefaultValue(),
                mapper.map( ( String ) getParameters().get( PARAMS_KEY_STRING__UNTRIMMED_EMPTY ), false, false ) );
        assertEquals( mapper.getDefaultValue(),
                mapper.map( ( String ) getParameters().get( PARAMS_KEY_STRING__UNTRIMMED_EMPTY ), false, true ) );
        assertEquals( mapper.getDefaultValue(),
                mapper.map( ( String ) getParameters().get( PARAMS_KEY_STRING__UNTRIMMED_EMPTY ), true, false ) );
        assertEquals( mapper.getDefaultValue(),
                mapper.map( ( String ) getParameters().get( PARAMS_KEY_STRING__UNTRIMMED_EMPTY ), true, true ) );
    }

    /**
     * test for {@link TypeMapper#map(String, boolean, boolean, Object)}
     */
    @Test
    void map7() {
        assertEquals( ANOTHER_DEFAULT_VALUE,
                mapper.map( ( String ) getParameters().get( PARAMS_KEY_STRING ), false, false,
                        ANOTHER_DEFAULT_VALUE ) );
        assertEquals( ANOTHER_DEFAULT_VALUE,
                mapper.map( ( String ) getParameters().get( PARAMS_KEY_STRING ), false, true,
                        ANOTHER_DEFAULT_VALUE ) );
        assertEquals( ANOTHER_DEFAULT_VALUE,
                mapper.map( ( String ) getParameters().get( PARAMS_KEY_STRING ), true, false,
                        ANOTHER_DEFAULT_VALUE ) );
        assertEquals( ANOTHER_DEFAULT_VALUE,
                mapper.map( ( String ) getParameters().get( PARAMS_KEY_STRING ), true, true, ANOTHER_DEFAULT_VALUE ) );

        assertEquals( ANOTHER_DEFAULT_VALUE,
                mapper.map( ( String ) getParameters().get( PARAMS_KEY_STRING__EMPTY ), false, false,
                        ANOTHER_DEFAULT_VALUE ) );
        assertEquals( ANOTHER_DEFAULT_VALUE,
                mapper.map( ( String ) getParameters().get( PARAMS_KEY_STRING__EMPTY ), false, true,
                        ANOTHER_DEFAULT_VALUE ) );
        assertEquals( ANOTHER_DEFAULT_VALUE,
                mapper.map( ( String ) getParameters().get( PARAMS_KEY_STRING__EMPTY ), true, false,
                        ANOTHER_DEFAULT_VALUE ) );
        assertEquals( ANOTHER_DEFAULT_VALUE,
                mapper.map( ( String ) getParameters().get( PARAMS_KEY_STRING__EMPTY ), true, true,
                        ANOTHER_DEFAULT_VALUE ) );

        assertEquals( ANOTHER_DEFAULT_VALUE,
                mapper.map( ( String ) getParameters().get( PARAMS_KEY_STRING__UNTRIMMED ), false, false,
                        ANOTHER_DEFAULT_VALUE ) );
        assertEquals( ANOTHER_DEFAULT_VALUE,
                mapper.map( ( String ) getParameters().get( PARAMS_KEY_STRING__UNTRIMMED ), false, true,
                        ANOTHER_DEFAULT_VALUE ) );
        assertEquals( ANOTHER_DEFAULT_VALUE,
                mapper.map( ( String ) getParameters().get( PARAMS_KEY_STRING__UNTRIMMED ), true, false,
                        ANOTHER_DEFAULT_VALUE ) );
        assertEquals( ANOTHER_DEFAULT_VALUE,
                mapper.map( ( String ) getParameters().get( PARAMS_KEY_STRING__UNTRIMMED ), true, true,
                        ANOTHER_DEFAULT_VALUE ) );

        assertEquals( ANOTHER_DEFAULT_VALUE,
                mapper.map( ( String ) getParameters().get( PARAMS_KEY_STRING__UNTRIMMED_EMPTY ), false, false,
                        ANOTHER_DEFAULT_VALUE ) );
        assertEquals( ANOTHER_DEFAULT_VALUE,
                mapper.map( ( String ) getParameters().get( PARAMS_KEY_STRING__UNTRIMMED_EMPTY ), false, true,
                        ANOTHER_DEFAULT_VALUE ) );
        assertEquals( ANOTHER_DEFAULT_VALUE,
                mapper.map( ( String ) getParameters().get( PARAMS_KEY_STRING__UNTRIMMED_EMPTY ), true, false,
                        ANOTHER_DEFAULT_VALUE ) );
        assertEquals( ANOTHER_DEFAULT_VALUE,
                mapper.map( ( String ) getParameters().get( PARAMS_KEY_STRING__UNTRIMMED_EMPTY ), true, true,
                        ANOTHER_DEFAULT_VALUE ) );
    }

    @Test
    void prepare() {
        assertNull( null,
                mapper.prepare( ( String ) getParameters().get( PARAMS_KEY_NO_VALUE ), false, false ) );
        assertNull( null,
                mapper.prepare( ( String ) getParameters().get( PARAMS_KEY_NO_VALUE ), false, true ) );
        assertNull( null,
                mapper.prepare( ( String ) getParameters().get( PARAMS_KEY_NO_VALUE ), true, false ) );
        assertNull( null,
                mapper.prepare( ( String ) getParameters().get( PARAMS_KEY_NO_VALUE ), true, true ) );

        assertEquals( getParameters().get( PARAMS_KEY_STRING ),
                mapper.prepare( ( String ) getParameters().get( PARAMS_KEY_STRING ), false, false ) );
        assertEquals( getParameters().get( PARAMS_KEY_STRING ),
                mapper.prepare( ( String ) getParameters().get( PARAMS_KEY_STRING ), false, true ) );
        assertEquals( getParameters().get( PARAMS_KEY_STRING ),
                mapper.prepare( ( String ) getParameters().get( PARAMS_KEY_STRING ), true, false ) );
        assertEquals( getParameters().get( PARAMS_KEY_STRING ),
                mapper.prepare( ( String ) getParameters().get( PARAMS_KEY_STRING ), true, true ) );

        assertEquals( "", mapper.prepare( ( String ) getParameters().get( PARAMS_KEY_STRING__EMPTY ), false,
                false ) );
        assertNull( null,
                mapper.prepare( ( String ) getParameters().get( PARAMS_KEY_STRING__EMPTY ), false, true ) );
        assertEquals( "",
                mapper.prepare( ( String ) getParameters().get( PARAMS_KEY_STRING__EMPTY ), true, false ) );
        assertNull( null,
                mapper.prepare( ( String ) getParameters().get( PARAMS_KEY_STRING__EMPTY ), true, true ) );

        assertEquals( getParameters().get( PARAMS_KEY_STRING__UNTRIMMED ),
                mapper.prepare( ( String ) getParameters().get( PARAMS_KEY_STRING__UNTRIMMED ), false,
                        false ) );
        assertEquals( getParameters().get( PARAMS_KEY_STRING__UNTRIMMED ),
                mapper.prepare( ( String ) getParameters().get( PARAMS_KEY_STRING__UNTRIMMED ), false,
                        true ) );
        assertEquals( ( ( String ) getParameters().get( PARAMS_KEY_STRING__UNTRIMMED ) ).trim(),
                mapper.prepare( ( String ) getParameters().get( PARAMS_KEY_STRING__UNTRIMMED ), true,
                        false ) );
        assertEquals( ( ( String ) getParameters().get( PARAMS_KEY_STRING__UNTRIMMED ) ).trim(),
                mapper.prepare( ( String ) getParameters().get( PARAMS_KEY_STRING__UNTRIMMED ), true,
                        true ) );

        assertEquals( getParameters().get( PARAMS_KEY_STRING__UNTRIMMED_EMPTY ),
                mapper.prepare( ( String ) getParameters().get( PARAMS_KEY_STRING__UNTRIMMED_EMPTY ), false,
                        false ) );
        assertEquals( getParameters().get( PARAMS_KEY_STRING__UNTRIMMED_EMPTY ),
                mapper.prepare( ( String ) getParameters().get( PARAMS_KEY_STRING__UNTRIMMED_EMPTY ), false,
                        true ) );
        assertEquals( "",
                mapper.prepare( ( String ) getParameters().get( PARAMS_KEY_STRING__UNTRIMMED_EMPTY ), true,
                        false ) );
        assertNull( null,
                mapper.prepare( ( String ) getParameters().get( PARAMS_KEY_STRING__UNTRIMMED_EMPTY ), true,
                        true ) );

    }

}
