package de.ckraus.commons.mapper;

import de.ckraus.commons.mapper.conf.ApplicationContextProvider;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Component("characterMapper")
@Getter
@Setter(AccessLevel.PROTECTED)
@SuppressWarnings({ "javadoc", "unused" })
public class CharacterMapperImpl extends TypeMapperBase<Character> implements CharacterMapper {

    private final boolean evaluateCodePoints;


    /**
     * Constructor
     */
    public CharacterMapperImpl() {
        this(null);
    }

    /**
     * Constructor
     */
    public CharacterMapperImpl(Character defaultValue) {
        super(Character.class, defaultValue);

        this.evaluateCodePoints = CharacterMapper.super.isEvaluateCodePoints();
    }

    /**
     * Constructor
     *
     * @param bIsEvaluateCodePoints
     */
    public CharacterMapperImpl(boolean bIsEvaluateCodePoints) {
        this(null, bIsEvaluateCodePoints);
    }

    /**
     * Constructor
     *
     * @param defaultValue
     * @param bIsEvaluateCodePoints
     */
    public CharacterMapperImpl(Character defaultValue, boolean bIsEvaluateCodePoints) {
        super(Character.class, defaultValue);

        this.evaluateCodePoints = bIsEvaluateCodePoints;
    }

    @Override
    public boolean isEvaluateCodePoints() {
        return this.evaluateCodePoints;
    }

    @Override
    public IntegerMapper getIntegerMapper() {
        TypeMapperFactoryImpl typeMapperFactory =
                ApplicationContextProvider.getApplicationContext().getBean(TypeMapperFactoryImpl.class);
        return typeMapperFactory.getIntegerMapper();
    }
}
