package de.ckraus.webcommons.mappers.utils.http;

import de.ckraus.webcommons.mappers.utils.LocalDateTimeMapperScopeUtils;

import javax.servlet.http.HttpSession;

/**
 *
 */
@SuppressWarnings({ "unused" })
public interface LocalDateTimeMapperHttpSessionUtils
        extends HttpSessionUtils, LocalDateTimeMapperScopeUtils<HttpSession> {

}
