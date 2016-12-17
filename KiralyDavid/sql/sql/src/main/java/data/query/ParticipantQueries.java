package data.query;

public final class ParticipantQueries {
    
   
        private ParticipantQueries() {}
        
        public static final String QUERY_FIND_ALL
                = "SELECT * FROM promotion_tracker.participant";
        public static final String QUERY_INSERT = "INSERT INTO promotion_tracker.participant (name,email) VALUES (?,?)";
        public static final String QUERY_SELECT_BY_ID="SELECT * FROM promotion_tracker.participant WHERE id=?";
    }
  
