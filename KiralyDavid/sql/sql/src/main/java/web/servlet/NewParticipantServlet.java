package web.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.participants.ParticipantService;
import service.participants.ParticipantServiceImpl;
import service.vo.ParticipantVO;

@WebServlet(
        name="newParticipantServlet",
        urlPatterns="/new"
        )

public class NewParticipantServlet extends HttpServlet {

    private ParticipantService service = new ParticipantServiceImpl();
    
    private static final long serialVersionUID = -902451804280189999L;
 
    @Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    
   service.save(toVo(req));
}
 private static ParticipantVO toVo(HttpServletRequest req){
     ParticipantVO participantVO =new ParticipantVO();
     
     participantVO.setName(req.getParameter("name"));
     participantVO.setEmail(req.getParameter("email"));
     
     return participantVO;
     
     
 }
}
