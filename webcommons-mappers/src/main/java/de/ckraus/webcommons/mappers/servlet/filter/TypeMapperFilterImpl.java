package de.ckraus.webcommons.mappers.servlet.filter;

import de.ckraus.webcommons.mappers.servlet.DefaultTypeMapperServletRequestFacade;
import de.ckraus.webcommons.mappers.servlet.http.DefaultTypeMapperHttpServletRequestFacade;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@SuppressWarnings({ "javadoc", "unused", "WeakerAccess" })
public class TypeMapperFilterImpl implements Filter {

    /**
     * init
     *
     * @param filterConfig
     *
     * @throws ServletException
     */
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    /**
     * doFilter
     *
     * @param servletRequest
     * @param servletResponse
     * @param filterChain
     *
     * @throws IOException
     * @throws ServletException
     */
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {

        if (servletRequest instanceof HttpServletRequest) {
            filterChain.doFilter(new DefaultTypeMapperHttpServletRequestFacade((HttpServletRequest) servletRequest),
                    servletResponse);
        }
        else {
            filterChain.doFilter(new DefaultTypeMapperServletRequestFacade(servletRequest), servletResponse);
        }
    }

    /**
     * destroy
     */
    public void destroy() {

    }
}
