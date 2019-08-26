package de.ckraus.webcommons.http.mapper;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;

public class Test extends HttpServletRequestWrapper {
    public Test(HttpServletRequest httpServletRequest) {
        super( httpServletRequest );
    }
}
