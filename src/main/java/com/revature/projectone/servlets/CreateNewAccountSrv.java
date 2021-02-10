package com.revature.projectone.servlets;

import com.revature.projectone.helpers.Database;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CreateNewAccountSrv extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userIdString = request.getParameter("userId");
        String amountString = request.getParameter("amount");

        int userId = Integer.parseInt(userIdString);
        double amount = Double.parseDouble(amountString);

        Database.createNewPendingAccount(userId, amount);

        request.getRequestDispatcher("/updateCustomer").forward(request, response);
    }
}