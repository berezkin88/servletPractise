package servletPractise.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Alexander on 09/05/2017.
 */
public class HelloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        getResponse(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        getResponse(request, response);
    }

    private void getResponse(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter out = response.getWriter();

        String title = "Using " + request.getMethod() + " Method to Read Form Data";
        String docType = "<!doctype html public \" //w3c//dtd html 4.0 transitional//en\">\n";
        out.println(docType +
                                "<html>\n" +
                                "<head><title>" + title + "</head></title>" +
                                "<body bgcolor=\"#f0f0f0\">\n" +
                                "<h1 align=\"center\">" + title + "</h1>\n" +
                                "<ul>\n" +
                                " <li><b>First Name</b>: "
                                + request.getParameter("first_name") + "\n" +
                                " <li><b>Last Name</b>: "
                                + request.getParameter("last_name") + "\n" +
                                "</ul>\n" +
                                "</body></html>");
    }
}
