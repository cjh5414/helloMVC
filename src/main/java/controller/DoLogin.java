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
import java.util.ArrayList;
import java.util.List;

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

        // We can iterate over lists using forEach in JSTL

        List<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer("id006", "Kim", "Kim@hansung.ac.kr"));
        customers.add(new Customer("id007", "Lee", "Lee@hansung.ac.kr"));
        customers.add(new Customer("id008", "Park", "Park@hansung.ac.kr"));
        request.setAttribute("customerList", customers);

        String page;

        if(customer == null)
            page = "/view/error.jsp";
        else
            page = "/view/success.jsp";

        RequestDispatcher dispatcher = request.getRequestDispatcher(page);
        dispatcher.forward(request, response);
    }
}
