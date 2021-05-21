package de.ckraus.webcommons.mapper.servlet.filter;

import de.ckraus.webcommons.mapper.servlet.http.TypeMapperHttpServletRequestFacade;
import de.ckraus.webcommons.mapper.servlet.TypeMapperServletRequestFacade;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@SuppressWarnings({ "javadoc", "unused", "WeakerAccess" })
public class TypeMapperFilterImpl implements Filter {

    /**
     * init
     * @param filterConfig
     * @throws ServletException
     */
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    /**
     * doFilter
     * @param servletRequest
     * @param servletResponse
     * @param filterChain
     * @throws IOException
     * @throws ServletException
     */
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse,
                         FilterChain filterChain) throws IOException, ServletException {

        if ( servletRequest instanceof HttpServletRequest) {
            filterChain.doFilter(
                    new TypeMapperHttpServletRequestFacade( (HttpServletRequest) servletRequest ),
                    servletResponse
            );
        }
        else {
            filterChain.doFilter(
                    new TypeMapperServletRequestFacade( servletRequest ),
                    servletResponse
            );
        }
    }

    /**
     * destroy
     */
    public void destroy() {

    }
}
