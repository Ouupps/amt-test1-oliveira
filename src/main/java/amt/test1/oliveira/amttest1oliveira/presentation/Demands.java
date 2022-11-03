package amt.test1.oliveira.amttest1oliveira.presentation;

import amt.test1.oliveira.amttest1oliveira.buisness.Depot;
import amt.test1.oliveira.amttest1oliveira.buisness.Product;
import amt.test1.oliveira.amttest1oliveira.doa.ProductDAOLocal;

import javax.ejb.Stateful;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet("/demands")
public class Demands extends HttpServlet {

    @Inject
    ProductDAOLocal productDAO;

    private String nameDepot;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String nameDepot = request.getParameter("nameDepot");
        String idDepotString = request.getParameter("id");
        int idDepot = Integer.parseInt(idDepotString);

        List<Product> products = productDAO.getProductsStock(idDepot);
        request.setAttribute("products", products);


        request.getRequestDispatcher("/WEB-INF/pages/demands.jsp").forward(request, response);
    }


    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String nameProduct = request.getParameter("nameProduct");
        String demandsString = request.getParameter("demands");
        int demand = Integer.parseInt(demandsString);
        List<String> errors = new ArrayList<>();
        if(demand < 0)
            errors.add("la demande ne peux être négative");

        request.setAttribute("errors", errors);
    }
}