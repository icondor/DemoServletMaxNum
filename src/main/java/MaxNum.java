import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

/**
 * Created by icondor on 18/06/16.
 */

@WebServlet("/max")
public class MaxNum extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");


        String sNr1=req.getParameter("nr1");
        String sNr2=req.getParameter("nr2");
        int nr1=Integer.parseInt(sNr1);
        int nr2=Integer.parseInt(sNr2);
        int max;
        if(nr1>nr2)
            max=nr1;
        else
            max=nr2;


        PrintWriter out =resp.getWriter();

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Result</title>");
        out.println("</head>");

        out.println("<body>");

        out.println("Maximum is:"+max);

        out.println("</body");
        out.println("</html>");
        out.close();
    }
}
