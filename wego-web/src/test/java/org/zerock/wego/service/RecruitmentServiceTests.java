package org.zerock.wego.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.Date;
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
import org.zerock.wego.exception.ServiceException;

import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.log4j.Log4j2;

@Log4j2
@NoArgsConstructor

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/**/root-*.xml")

@TestInstance(Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class RecruitmentServiceTests {
	
	@Setter(onMethod_= {@Autowired}) // 생성자, 메소드, 매개변수, 필드 => 지금은 Setter 메소드 사용
	private RecruitmentService service;

	
	@BeforeAll
	void beforeAll() {
		log.trace("beforeAll() invoked.");
		
		assertNotNull(this.service);
		log.info("this.service: {}", this.service);
	} // beforeAll
	
	
//	@Disabled
	@Test
	@Order(1)
	@DisplayName("testGetList")
	@Timeout(value=2, unit = TimeUnit.SECONDS)
	void testGetList() throws ServiceException{
		log.trace("testGetList() invoked.");
		
//		List<RecruitmentVO> list = this.service.getList();
//		
//		assert list != null;
//		list.forEach(log::info);
	} // testGetList
	
	
//	@Disabled
	@Test
	@Order(2)
	@DisplayName("testGet")
	@Timeout(value=2, unit = TimeUnit.SECONDS)
	void testGet() throws ServiceException{
		log.trace("testGet() invoked.");
		
//		int sanPartyId = 44;
//		RecruitmentVO vo = this.service.get(sanPartyId);
//		
//		if(vo != null) {
//			log.info("vo: {}", vo);
//		} else {
//			throw new ServiceException("RecruitmentVO is NULL");
//		} // if-else
	} // testGet
	
//	@Disabled
	@Test
	@Order(3)
	@DisplayName("testRemove")
	@Timeout(value=2, unit = TimeUnit.SECONDS)
	void testRemove() throws ServiceException{
		log.trace("testRemove() invoked.");
		
//		int sanPartyId = 44;
//		boolean success = this.service.remove(sanPartyId);
//		log.info("success: {}", success);
	} // testRemove
	
//	@Disabled
	@Test
	@Order(4)
	@DisplayName("testRegister")
	@Timeout(value=2, unit = TimeUnit.SECONDS)
	void testRegister() throws ServiceException{
		log.trace("testRegister() invoked.");
		
//		RecruitmentDTO dto = new RecruitmentDTO();
//		dto.setSanInfoId(100);
//		dto.setUserId(130);
//		dto.setTitle("NEW_TITLE");
//		dto.setContents("NEW_CONTENTS");
//		dto.setPartyYmd("23-03-22");
//		dto.setPartyTime("14:26");
//		dto.setPartyMax(7);
//		
//		boolean success = this.service.register(dto);
//		log.info("success: {}", success);
	} // testRegister
	
//	@Disabled
	@Test
	@Order(5)
	@DisplayName("testModify")
	@Timeout(value=2, unit = TimeUnit.SECONDS)
	void testModify() throws ServiceException{
		log.trace("testModify() invoked.");
		
//		RecruitmentVO vo = this.service.get(1005);
//		
//		RecruitmentDTO dto = new RecruitmentDTO();
//		dto.setSanInfoId(100);
//		dto.setTitle("NEW_TITLE");
//		dto.setContents("NEW_CONTENTS");
//		dto.setPartyYmd("23-03-22");
//		dto.setPartyTime("14:36");
//		dto.setPartyMax(12);
//
//		
//		boolean success = this.service.modify(dto);
//		log.info("success: {}", success);
	} // testRegister
	

} // end class
