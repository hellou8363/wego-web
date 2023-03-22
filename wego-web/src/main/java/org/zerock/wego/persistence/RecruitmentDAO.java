//package org.zerock.wego.persistence;
//
//import java.util.List;
//
//import org.apache.ibatis.session.SqlSession;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Repository;
//import org.zerock.wego.domain.RecruitmentDTO;
//
//
//@Repository
//public class RecruitmentDAO {
//	
//	@Autowired
//	SqlSession session;
//	
//	String namespace = "org.zerock.wego.persistence.RecruitmentDAO.";
//	
//	List<RecruitmentDTO> selectAll() throws Exception {
//		return session.selectList(namespace+"selectAll");
//	} // select
//	
//	RecruitmentDTO select(int sanPartyId) throws Exception {
//		return session.selectOne(namespace+"select", sanPartyId);
//	} // select
//	
//
//
//} // end class
