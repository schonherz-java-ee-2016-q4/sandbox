package service.participants;

import data.dao.GenericDAO;
import data.dao.ParticipantDAO;
import data.dto.ParticipantDTO;
import service.vo.ParticipantVO;

public class ParticipantServiceImpl implements ParticipantService {

    private GenericDAO<ParticipantDTO> dao = new ParticipantDAO();

    @Override
    public void save(ParticipantVO participant) {

        dao.save(toDTO(participant));
    }

    private static ParticipantDTO toDTO(ParticipantVO vo) {
        ParticipantDTO participanDTO = new ParticipantDTO();
        participanDTO.setId(vo.getId());
        participanDTO.setName(vo.getName());
        participanDTO.setEmail(vo.getEmail());

        return participanDTO;

    }
}
