package com.revature.projectone.servlets;

import com.revature.projectone.helpers.Database;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

public class CancelTransferSrv extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String[] transfers = request.getParameterValues("transfer");

        for(String transfer : transfers)
        {
            Database.cancelTransfer(Integer.parseInt(transfer));
        }

        request.getRequestDispatcher("/updateCustomer").forward(request, response);
    }
}
