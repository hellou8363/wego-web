package org.zerock.wego.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.zerock.wego.domain.RecruitmentDTO;
import org.zerock.wego.domain.RecruitmentVO;
import org.zerock.wego.domain.RecruitmentViewVO;

//@Component
public interface RecruitmentMapper {

	@Select("SELECT * FROM san_party_v")
	public abstract List<RecruitmentViewVO> selectAll(); // 전체목록조회
	
	// XML Mapper방식으로 SQL처리
	public abstract RecruitmentVO select(Integer sanPartyId); // 상세조회
	public abstract Integer delete(Integer sanPartyId); // 게시물삭제
	public abstract Integer insert(RecruitmentDTO dto); // 신규게시물등록
	public abstract Integer update(RecruitmentDTO dto); // 기존게시물수정
	
	// 산이름으로 산ID 조회
	public abstract Integer sanNameSelect(String sanName);
	
} // end interface
