package ua.nure.kn156.zadorozhnaya.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.nure.kn156.zadorozhnaya.User;
import ua.nure.kn156.zadorozhnaya.db.DaoFactory;
import ua.nure.kn156.zadorozhnaya.db.DatabaseException;

public class AddServlet extends HttpServlet {

    protected void showPage(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/add.jsp").forward(req, resp);
    }

    protected void processUser(User user) throws DatabaseException {
        DaoFactory.getInstance().getUserDao().create(user);
    }
}