package main;

import data.dao.GenericDAO;
import data.dao.ParticipantDAO;
import data.dto.ParticipantDTO;

public class Main {

    public static void main(String[] args) {
        GenericDAO<ParticipantDTO> participantDAO =new ParticipantDAO();
       
        
        
       ParticipantDTO dummy = new ParticipantDTO();
        dummy.setEmail("wat@wat.hu");
        dummy.setName("Nev Józsi");
        
        participantDAO.save(dummy);
      
      
        
     System.out.println(participantDAO.findAll());
        System.out.println(participantDAO.findById(6));

    }

}
