package controller;

import model.Customer;
import service.CustomerService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by jihun on 2017. 1. 9..
 */
@WebServlet(name = "DoLogin", urlPatterns = "/doLogin")
public class DoLogin extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String customerId = request.getParameter("customerId");

        // Perform business logic. Return a bean as a result.

        CustomerService service = new CustomerService();
        Customer customer = service.findCustomer(customerId);
        request.setAttribute("customer", customer);

        String page = null;

        if(customer == null)
            page = "/view/error.jsp";
        else
            page = "/view/success.jsp";

        RequestDispatcher dispatcher = request.getRequestDispatcher(page);
        dispatcher.forward(request, response);
    }
}
