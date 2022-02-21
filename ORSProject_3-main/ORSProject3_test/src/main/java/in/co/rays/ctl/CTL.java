package in.co.rays.ctl;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.co.rays.dto.UserDTO;
import in.co.rays.model.ModelFactory;
import in.co.rays.model.UserModelInt;
import in.co.rays.model.UserModelHibImp;
/**
 * Servlet implementation class UserRegister
 */

@WebServlet(name = "CTL", urlPatterns = { "/ORSProject3_test/CTL" })
public class CTL extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public CTL() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		

		 String Fname= request.getParameter("firstName");
		 String lname= request.getParameter("lastName");
		 String pwd= request.getParameter("pwd");
		 String gmail= request.getParameter("login");
		 String mob= request.getParameter("Mobileno");
		 String op = request.getParameter("SignUp");
		 
		 UserDTO dto = new UserDTO();
		 dto.setFname(Fname);
		 dto.setLname(lname);
		 dto.setLogin(gmail);
		 dto.setMobileNo(mob);
		 dto.setPassword(pwd);
		 
		 UserModelInt userModel = ModelFactory.getInstance().getUserModel();
		 
		 try {
			long pk = userModel.add(dto);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 System.out.println("complete");
	}

}
