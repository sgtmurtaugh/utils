package de.ckraus.commons.mapper;

import org.junit.jupiter.api.Test;

class NumericTypeMapperBaseTest {

    TypeMapper<Number> mapper = new NumericTypeMapperBase<>() {
        @Override
        public Number toType(Number number) {
            return null;
        }
    };

    @Test
    void map() {
    }

}
