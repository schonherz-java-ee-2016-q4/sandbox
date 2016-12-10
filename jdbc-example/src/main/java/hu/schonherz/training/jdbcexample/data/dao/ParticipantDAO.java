package hu.schonherz.training.jdbcexample.data.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import hu.schonherz.training.jdbcexample.data.datasource.DataSourceManager;
import hu.schonherz.training.jdbcexample.data.dto.ParticipantDTO;
import hu.schonherz.training.jdbcexample.data.queries.ParticipantQueries;

public class ParticipantDAO implements GenericDAO<ParticipantDTO>{

    public Collection<ParticipantDTO> findAll() {
        List<ParticipantDTO> participants = new ArrayList<>();
        try (Connection conn= DataSourceManager.getDataSource().getConnection()){
          Statement statement = conn.createStatement();
          ResultSet rs = statement.executeQuery(ParticipantQueries.QUERY_FIND_ALL);
          
          
          while(rs.next()){
             
              
              participants.add(toDTO(rs));
              
          }
      }catch(SQLException e){
          System.err.println("Error while communicating with the database!");
          e.printStackTrace();
      }
        
        return participants;
    }

    public ParticipantDTO findById(int id) {

        try(Connection conn = DataSourceManager.getDataSource().getConnection()){
            PreparedStatement statement = conn.prepareStatement(ParticipantQueries.QUERY_FIND_BY_ID);
            statement.setInt(1, id);
            ResultSet rs = statement.executeQuery();
            ParticipantDTO participantDTO = new ParticipantDTO();
            
            if(rs.next()){
              return toDTO(rs);  
              
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
        
    }

    public int save(ParticipantDTO dto) {
           
           try(Connection conn = DataSourceManager.getDataSource().getConnection()){
               PreparedStatement prepStatement = conn.prepareStatement(ParticipantQueries.QUERY_INSERT ,Statement.RETURN_GENERATED_KEYS);
               prepStatement.setString(1, dto.getName());
               prepStatement.setString(2, dto.getEmail());
               prepStatement.executeUpdate();
               
               ResultSet rs = prepStatement.getGeneratedKeys();
               if(rs.next()){
                   return rs.getInt("id");
               }
               } catch (SQLException e) {
                e.printStackTrace();
            }
              
           return 0;
           
        
    }

  private static ParticipantDTO toDTO(ResultSet rs) throws SQLException{
      ParticipantDTO participantDTO = new ParticipantDTO();
      participantDTO.setId(rs.getInt("id"));
      
      participantDTO.setName(rs.getString("name"));
      
      participantDTO.setEmail(rs.getString("email"));
      
      return participantDTO;
  }

}
