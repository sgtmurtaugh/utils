package de.ckraus.webcommons.mappers.servlet.http;

import de.ckraus.commons.mapper.utils.TypeMapperUtils;
import de.ckraus.webcommons.mappers.types.BooleanScopeMapper;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;

import javax.servlet.http.HttpSession;

/**
 *
 */
public interface BooleanMapperHttpSession extends HttpSession, BooleanScopeMapper {

}
