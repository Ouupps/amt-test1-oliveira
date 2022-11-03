//package amt.test1.oliveira.amttest1oliveira.presentation;
//
//import amt.test1.oliveira.amttest1oliveira.doa.UserDAOLocal;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//import javax.inject.Inject;
//import javax.servlet.ServletException;
//import javax.servlet.http.*;
//import javax.servlet.annotation.*;
//
//@WebServlet("")
//public class Test extends HttpServlet {
//    private String message;
//
//    @Inject
//    UserDAOLocal userDAO;
//
//    public void init() {
//        message = "Hello World!";
//    }
//
//    @Override
//    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        List<User> users = userDAO.getUsers();
//        //String path = request.getContextPath();
//        request.setAttribute("users", users);
//        request.getRequestDispatcher("/index.jsp").forward(request, response);
//    }
//    @Override
//    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
//        String fName = request.getParameter("fname");
//        String lName = request.getParameter("lname");
//        User newUser = new User();
//        newUser.setFirstname(fName);
//        newUser.setLastname(lName);
//        userDAO.insert(newUser);
//        request.setAttribute("nameUser", lName + " " + fName );
//
//        List<String> errors = new ArrayList<>();
//        request.setAttribute("errors", errors);
//        request.getRequestDispatcher("/index.jsp").forward(request, response);
//    }
//
//    public void destroy() {
//    }
//}