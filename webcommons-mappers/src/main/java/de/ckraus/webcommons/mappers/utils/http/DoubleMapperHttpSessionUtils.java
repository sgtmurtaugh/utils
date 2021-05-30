package de.ckraus.webcommons.mappers.utils.http;

import de.ckraus.webcommons.mappers.utils.DoubleMapperScopeUtils;

import javax.servlet.http.HttpSession;

/**
 *
 */
@SuppressWarnings({ "unused" })
public interface DoubleMapperHttpSessionUtils extends HttpSessionUtils, DoubleMapperScopeUtils<HttpSession> {

}
