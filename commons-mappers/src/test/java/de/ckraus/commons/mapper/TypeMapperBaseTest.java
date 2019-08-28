package de.ckraus.commons.mapper;

import org.junit.jupiter.api.Test;

class TypeMapperBaseTest {

    TypeMapper mapper = new TypeMapperBase() {
        @Override
        public Object map( String s, boolean bTrim, boolean bEmptyIsNull, Object defaultValue ) {
            return defaultValue;
        }
    };


    @Test
    void map() {
    }

    @Test
    void prepareStringToParse() {
    }

    @Test
    void getDefaultValue() {
    }

    @Test
    void isEmptyStringNull() {
    }

    @Test
    void isTrimStrings() {
    }

}