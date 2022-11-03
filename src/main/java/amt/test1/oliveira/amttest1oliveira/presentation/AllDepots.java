package amt.test1.oliveira.amttest1oliveira.presentation;

import amt.test1.oliveira.amttest1oliveira.buisness.Depot;
import amt.test1.oliveira.amttest1oliveira.doa.DepotDAOLocal;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("")
public class AllDepots extends HttpServlet {

    @Inject
    DepotDAOLocal depotDAO;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        List<Depot> depots = depotDAO.getDepots();
        request.setAttribute("depots", depots);
        request.getRequestDispatcher("/WEB-INF/pages/allDepots.jsp").forward(request, response);
    }
}
