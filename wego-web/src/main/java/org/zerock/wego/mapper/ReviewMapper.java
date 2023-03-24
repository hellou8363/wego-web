package org.zerock.wego.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Select;
import org.zerock.wego.domain.ReviewDTO;
import org.zerock.wego.domain.ReviewVO;
import org.zerock.wego.domain.ReviewViewVO;

//@Component
public interface ReviewMapper { 

	@Select("SELECT * FROM san_review_v")
	public abstract List<ReviewViewVO> selectAll(); // 전체목록조회
	
	// XML Mapper방식으로 SQL처리
	public abstract ReviewVO select(Integer sanReviewId); // 상세조회
	public abstract Integer delete(Integer sanReviewId); // 게시물삭제
	public abstract Integer insert(ReviewDTO dto); // 신규게시물등록
	public abstract Integer update(ReviewDTO dto); // 기존게시물수정
	
	// 산이름으로 산ID 조회
	public abstract Integer sanNameSelect(String sanName);
	
} // end interface
