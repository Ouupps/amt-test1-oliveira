package amt.test1.oliveira.amttest1oliveira.presentation;

import amt.test1.oliveira.amttest1oliveira.buisness.Demand;
import amt.test1.oliveira.amttest1oliveira.doa.DemandDAOLocal;
import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/other")
public class Other extends HttpServlet {


    @Inject
    DemandDAOLocal demandDAO;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String nameDepot = request.getParameter("depotName");
        String idDepotString = request.getParameter("id");
        int idDepot = Integer.parseInt(idDepotString);

        List<Demand> demands = demandDAO.getDemand(1,1);

        request.setAttribute("demands", demands);

        request.setAttribute("depotName", nameDepot);
        request.getRequestDispatcher("/WEB-INF/pages/other.jsp").forward(request, response);
    }
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        request.getRequestDispatcher("/WEB-INF/pages/other.jsp").forward(request, response);
    }

}
