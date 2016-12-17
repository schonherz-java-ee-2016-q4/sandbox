package hu.schonherz.training.jdbcexample.web.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hu.schonherz.training.jdbcexample.service.participants.ParticipantService;
import hu.schonherz.training.jdbcexample.service.participants.ParticipantServiceImpl;
import hu.schonherz.training.jdbcexample.service.vo.ParticipantVO;

@WebServlet(
        name="newParticipantServlet",
        urlPatterns = "/new"
        )
public class NewParticipantServlet extends HttpServlet {
    private ParticipantService service = new ParticipantServiceImpl();
    
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        service.save(toVo(req));
    }
    private static ParticipantVO toVo(HttpServletRequest req){
        ParticipantVO participantVO = new ParticipantVO();
        participantVO.setName(req.getParameter("name"));
        participantVO.setEmail(req.getParameter("email"));
        
        return participantVO;
    }
    
}
