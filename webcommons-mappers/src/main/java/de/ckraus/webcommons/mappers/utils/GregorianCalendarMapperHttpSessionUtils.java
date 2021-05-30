package de.ckraus.webcommons.mappers.utils;

import de.ckraus.webcommons.mappers.utils.http.GregorianCalendarMapperScopeUtils;
import de.ckraus.webcommons.mappers.utils.http.HttpSessionUtils;

import javax.servlet.http.HttpSession;

/**
 *
 */
@SuppressWarnings({ "unused" })
public interface GregorianCalendarMapperHttpSessionUtils
        extends HttpSessionUtils, GregorianCalendarMapperScopeUtils<HttpSession> {

}
