/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServletsCalculator;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 733357 jan
 *
 */
public class ArithmeticCalculatorServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        // this will have the servlet call upon a jsp to be aloaded by the client's browser
        request.setAttribute("results", "---");
        getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
    
    }
    
    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String inputType = request.getParameter("calculate");
        String num1 = request.getParameter("first");
        String num2 = request.getParameter("second");
        int firstNum;
        int secondNum;
        request.setAttribute ("first", num1);
        request.setAttribute ("second", num2);
        try
        {
            firstNum = Integer.parseInt(num1);
            secondNum = Integer.parseInt(num2);
            switch (inputType)
            {
                
                case "+":
                    request.setAttribute("results", firstNum + secondNum);
                    break;
                case "-":
                    request.setAttribute("results", firstNum - secondNum);
                    break;
                case "*":
                    request.setAttribute("results", firstNum * secondNum);
                    break;
                case "%":
                    request.setAttribute("results", firstNum % secondNum);
                    break;
                    
            }
        }
        
        catch(NumberFormatException nfe)
        {
            request.setAttribute("results", "not valid");
        }
                         
            getServletContext().getRequestDispatcher("/WEB-INF/arithmeticCalculator.jsp").forward(request, response);
            
        }
    }

