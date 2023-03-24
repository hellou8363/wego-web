package org.zerock.wego.service;

import java.util.List;

import org.zerock.wego.domain.ReviewDTO;
import org.zerock.wego.domain.ReviewVO;
import org.zerock.wego.domain.ReviewViewVO;
import org.zerock.wego.exception.ServiceException;

public interface ReviewService {
	
//	// 게시물 전체목록 조회(LIST)
	public abstract List<ReviewViewVO> getList() throws ServiceException;
	
	// 특정 게시물 상세조회(READ)
	public abstract ReviewVO get(Integer sanReviewId) throws ServiceException;
	
	// 특정 게시물 삭제(DELETE)
	public abstract boolean remove(Integer sanReviewId) throws ServiceException;
	
	// 새로운 게시물 등록(CREATE)
	public abstract boolean register(ReviewDTO dto) throws ServiceException;
	
	// 기존 게시물 수정(UPDATE)
	public abstract boolean modify(ReviewDTO dto) throws ServiceException;
	
	// 산이름으로 산ID 조회(READ)
	public abstract Integer sanNameSelect(String sanName) throws ServiceException;
	
	
} // end interface
