package org.zerock.wego.mapper;

import java.util.List;
import java.util.Set;

import org.apache.ibatis.annotations.Select;
import org.zerock.wego.domain.MountainInfoViewVO;

//@Component
public interface MountainInfoMapper {

	@Select("SELECT * FROM san_info_v")
	public abstract List<MountainInfoViewVO> selectAll(); // 전체목록조회
	
	@Select("SELECT * FROM san_info_v WHERE ROWNUM <= 10")
	public abstract Set<MountainInfoViewVO> select10(); // 10개의 게시글 조회
	
	@Select("SELECT * FROM san_info_v WHERE san_party_id = #{sanPartyId}")
	public abstract MountainInfoViewVO select(Integer sanPartyId); // 상세조회
	
} // end interface
