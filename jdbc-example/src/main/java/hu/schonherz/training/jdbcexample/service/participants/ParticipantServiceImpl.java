package hu.schonherz.training.jdbcexample.service.participants;

import hu.schonherz.training.jdbcexample.data.dao.GenericDAO;
import hu.schonherz.training.jdbcexample.data.dao.ParticipantDAO;
import hu.schonherz.training.jdbcexample.data.dto.ParticipantDTO;
import hu.schonherz.training.jdbcexample.service.vo.ParticipantVO;

public class ParticipantServiceImpl implements ParticipantService {

    private GenericDAO<ParticipantDTO> dao = new ParticipantDAO();
    
    
    @Override
    public void save(ParticipantVO participant) {
        dao.save(toDto(participant));
    }

    private static ParticipantDTO toDto(ParticipantVO vo){
        ParticipantDTO participantDTO = new ParticipantDTO();
        
        participantDTO.setId(vo.getId());
        participantDTO.setName(vo.getName());
        participantDTO.setEmail(vo.getEmail());
        return participantDTO;
    }
}
