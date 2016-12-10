package hu.schonherz.training.jdbcexample.data.main;

import hu.schonherz.training.jdbcexample.data.dao.GenericDAO;
import hu.schonherz.training.jdbcexample.data.dao.ParticipantDAO;
import hu.schonherz.training.jdbcexample.data.dto.ParticipantDTO;

public class Main {

    public static void main(String[] args) {

            GenericDAO<ParticipantDTO> participantDAO = new ParticipantDAO();
            System.out.println(participantDAO.findAll());
            
            ParticipantDTO dunny = new ParticipantDTO();
            dunny.setEmail("dummy@gmail.com");
            dunny.setName("Név józsi");
            
         //   System.out.println("the generated key is:" + participantDAO.save(dunny));
            System.out.println(participantDAO.findAll());
            System.out.println(participantDAO.findById(2));
           
    }

}
