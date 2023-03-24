package org.zerock.wego.mapper;

import java.util.Objects;
import java.util.concurrent.TimeUnit;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.zerock.wego.domain.RecruitmentDTO;
import org.zerock.wego.domain.RecruitmentVO;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;


@Log4j2
@NoArgsConstructor

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/**/root-*.xml")

@TestInstance(Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class RecruitmentMapperTests {
	
	@Setter(onMethod_= {@Autowired})
	private RecruitmentMapper mapper;
	
	
	@BeforeAll()
	void beforeAll() {
		log.trace("beforeAll() invoked.");
		
		Objects.requireNonNull(this.mapper);
		
		log.info("this.mapper: {}", this.mapper);
		log.info("type: {}", this.mapper.getClass().getName());
	} // beforeAll
	
	
//	@Disabled
	@Test
	@Order(1)
	@DisplayName("testSelectAll")
	@Timeout(value=1, unit = TimeUnit.SECONDS)
	void testSelectAll() { // selectAll() TEST
		log.trace("testSelectAll() invoked.");
		
//		List<RecruitmentVO> list = this.mapper.selectAll();
//		assertNotNull(list);
//		
//		list.forEach(log::info);
	} // testSelectAll
	
	
//	@Disabled
	@Test
	@Order(2)
	@DisplayName("testSelect")
	@Timeout(value=1, unit = TimeUnit.SECONDS)
	void testSelect() { 
		log.trace("testSelect() invoked.");
		
//		Integer sanPartyId = 13;
//		RecruitmentVO vo = this.mapper.select(sanPartyId);
//		
//		assertNotNull(vo);
//		log.info("vo: {}", vo);
	} // testSelect
	
	
//	@Disabled
	@Test
	@Order(3)
	@DisplayName("testDelete")
	@Timeout(value=1, unit = TimeUnit.SECONDS)
	void testDelete() { 
		log.trace("testDelete() invoked.");
		
//		Integer sanPartyId = 13;
//		Integer result = this.mapper.delete(sanPartyId);
//		
//		assertNotNull(result);
//		log.info("result: {}", result);
	} // testDelete

	
//	@Disabled
	@Test
	@Order(4)
	@DisplayName("testInsert")
	@Timeout(value=1, unit = TimeUnit.SECONDS)
	void testInsert() { 
		log.trace("testInsert() invoked.");
		
		RecruitmentDTO dto = new RecruitmentDTO();
		dto.setSanInfoId(100);
		dto.setUserId(130);
		dto.setTitle("TITEL_NEW_TEST");
		dto.setContents("CONTENT_NEW_TEST");
		dto.setPartyYmd("23-03-22");
		dto.setPartyTime("12:22");
		dto.setPartyMax(23);
		
		int affectedLines = this.mapper.update(dto);
		
		log.info("affectedLines: {}", affectedLines);

	} // testInsert
	
	
//	@Disabled
	@Test
	@Order(5)
	@DisplayName("testUpdate")
	@Timeout(value=1, unit = TimeUnit.SECONDS)
	void testUpdate() { 
		log.trace("testUpdate() invoked.");
		
		// TEST 1 : 직접 값 넣기
//		RecruitmentDTO dto = new RecruitmentDTO();
//		dto.setSanPartyId(13);
//		dto.setTitle("TITEL_UPDATE_13");
//		dto.setContents("CONTENT_UPDATE_13");
//		dto.setModifiedDt(current_date);
		
		// TEST 2 : DTO 사용
//		RecruitmentVO vo = this.mapper.select(13);
//		RecruitmentDTO dto = new RecruitmentDTO();
//		dto.setSanPartyId(vo.getSanPartyId());
//		dto.setTitle(vo.getTitle());
//		dto.setContents("CONTENT_NEW");
//		
//		int affectedLines = this.mapper.update(dto);
//		
//		log.info("affectedLines: {}", affectedLines);

	} // testUpdate
} // end class
