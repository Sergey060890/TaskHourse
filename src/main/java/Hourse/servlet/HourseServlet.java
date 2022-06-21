package Hourse.servlet;


import Hourse.entity.Hourse;
import Hourse.service.HourseService;
import Hourse.service.HourseServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/HourseServlet")
public class HourseServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HourseService hourseService = new HourseServiceImpl();
        List<Hourse> flowers = hourseService.findAll();
        req.setAttribute("hourses", flowers);
        getServletContext().getRequestDispatcher("/hourses.jsp").forward(req, resp);
    }

}