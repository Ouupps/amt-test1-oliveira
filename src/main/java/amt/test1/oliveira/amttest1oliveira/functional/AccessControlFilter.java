package amt.test1.oliveira.amttest1oliveira.functional;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(filterName = "AccessControlFilter", urlPatterns = "/*")
public class AccessControlFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        if (servletRequest instanceof HttpServletRequest && servletResponse instanceof HttpServletResponse) {
            HttpServletRequest req = (HttpServletRequest) servletRequest;
            HttpServletResponse res = (HttpServletResponse) servletResponse;

            String path = req.getServletPath();
            System.out.println(path);
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            throw new IllegalArgumentException("Could not cast servlet request and/or response objects");
        }
    }
}
