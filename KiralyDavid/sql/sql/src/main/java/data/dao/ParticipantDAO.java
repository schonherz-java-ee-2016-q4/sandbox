package data.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import data.datasource.DataSourceManager;
import data.dto.ParticipantDTO;
import data.query.ParticipantQueries;

public class ParticipantDAO implements GenericDAO<ParticipantDTO> {

    public Collection<ParticipantDTO> findAll() {

        List<ParticipantDTO> participants = new ArrayList<>();

        try (Connection conn = DataSourceManager.getDataSource().getConnection()) {
            Statement statement = conn.createStatement();
            ResultSet rs = statement.executeQuery(ParticipantQueries.QUERY_FIND_ALL);

            while (rs.next()) {
                ParticipantDTO participantDTO = new ParticipantDTO();
                participantDTO.setId(rs.getInt("id"));
                participantDTO.setName(rs.getString("name"));
                participantDTO.setEmail(rs.getString("email"));
                participants.add(participantDTO);
            }
        } catch (SQLException e) {
            System.err.println("Error while communicating with database!");
            e.printStackTrace();
        }
        return participants;
    }

    public ParticipantDTO findById(int id) {
        
       
        try (Connection conn = DataSourceManager.getDataSource().getConnection()) {
            PreparedStatement statement = conn.prepareStatement(ParticipantQueries.QUERY_SELECT_BY_ID);
            statement.setInt(1,id);
            ResultSet rs = statement.executeQuery();
            
            

            while (rs.next()) {
               
               return toDTO(rs);
            }
        } catch (SQLException e) {
            System.err.println("Error while communicating with database!");
            e.printStackTrace();
        }
       return null;
    }

    public int save(ParticipantDTO dto) {

        try (Connection conn = DataSourceManager.getDataSource().getConnection()) {
            PreparedStatement statement = conn.prepareStatement(ParticipantQueries.QUERY_INSERT, Statement.RETURN_GENERATED_KEYS);
            statement.setString(1, dto.getName());
            statement.setString(2, dto.getEmail());
            statement.executeUpdate();
            
            ResultSet rs =statement.getGeneratedKeys();
            if(rs.next())
            {
                return rs.getInt("id");
                
            }

        } catch (SQLException e) {
            System.err.println("Error while communicating with database!");
            e.printStackTrace();
        }
        return 0;
    }
    
    public static ParticipantDTO toDTO(ResultSet rs) throws SQLException{
        ParticipantDTO participantDTO = new ParticipantDTO();
        participantDTO.setId(rs.getInt("id"));
        participantDTO.setName(rs.getString("name"));
        participantDTO.setEmail(rs.getString("email"));
       
        return participantDTO;
        
    }
}

