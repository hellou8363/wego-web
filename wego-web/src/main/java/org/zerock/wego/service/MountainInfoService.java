package org.zerock.wego.service;

import java.util.List;
import java.util.Set;

import org.zerock.wego.domain.MountainInfoViewVO;
import org.zerock.wego.exception.ServiceException;

public interface MountainInfoService {
	
	// 게시물 전체목록 조회(LIST)
	public abstract List<MountainInfoViewVO> getList() throws ServiceException;
	
	// 10개의 게시물 목록 조회(LIST) - 메인페이지용
	public abstract Set<MountainInfoViewVO> get10List() throws ServiceException;
	
	// 특정 게시물 상세조회(READ)
	public abstract MountainInfoViewVO get(Integer sanPartyId) throws ServiceException;
//	
//	// 특정 게시물 삭제(DELETE)
//	public abstract boolean remove(Integer sanPartyId) throws ServiceException;
//	
//	// 새로운 게시물 등록(CREATE)
//	public abstract boolean register(RecruitmentDTO dto) throws ServiceException;
//	
//	// 기존 게시물 수정(UPDATE)
//	public abstract boolean modify(RecruitmentDTO dto) throws ServiceException;
//	
//	// 산이름으로 산ID 조회(READ)
//	public abstract Integer sanNameSelect(String sanName) throws ServiceException;
	
	
} // end interface
