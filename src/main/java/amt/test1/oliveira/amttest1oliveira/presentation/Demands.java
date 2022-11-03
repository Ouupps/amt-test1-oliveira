package amt.test1.oliveira.amttest1oliveira.presentation;

import amt.test1.oliveira.amttest1oliveira.buisness.Depot;
import amt.test1.oliveira.amttest1oliveira.buisness.Product;
import amt.test1.oliveira.amttest1oliveira.doa.ProductDAOLocal;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet("/demands")
public class Demands extends HttpServlet {

    @Inject
    ProductDAOLocal productDAO;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List<Product> products = productDAO.getProducts();
        request.setAttribute("products", products);
        request.getRequestDispatcher("/WEB-INF/pages/demands.jsp").forward(request, response);
    }
}