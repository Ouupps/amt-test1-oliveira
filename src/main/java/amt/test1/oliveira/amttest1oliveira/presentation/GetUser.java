//package amt.test1.oliveira.amttest1oliveira.presentation;
//
//import amt.test1.oliveira.amttest1oliveira.doa.UserDAOLocal;
//
//import javax.inject.Inject;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.List;
//
//@WebServlet("/users")
//public class GetUser extends HttpServlet {
//
//    @Inject
//    UserDAOLocal userDAO;
//
//    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//
//        List<User> users = userDAO.getUsers();
//        String path = request.getContextPath();
//        request.setAttribute("users", users);
//        //response.sendRedirect(path + "/");
////        RequestDispatcher dispatcher = servletContext().getRequestDispatcher(path + "/");
////        dispatcher.forward(request, response);
//        //request.getRequestDispatcher("/index.jsp").forward(request, response);
//    }
//}
