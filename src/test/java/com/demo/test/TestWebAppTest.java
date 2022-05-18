package com.demo.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.demo.controllers.TestController;
import com.demo.model.Employee;

@SpringBootTest
//@AutoConfigureMockMvc
public class TestWebAppTest {

//	@Autowired
//	private WebApplicationContext webApplicationContext;
//
//	@Autowired
//	private MockMvc mockMvc;
//
//	@BeforeEach
//	public void setup() {
//		mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
//	}

//	@Autowired
	TestController controller;
	
	@BeforeEach
	private void setup() {
		controller = new TestController();
	}
			
	@Test
	void testEmployee() throws Exception {
//		mockMvc.perform(get("/employee")).andExpect(status().isOk())
//				.andExpect(content().contentType("application/json;charset=UTF-8"))
//				.andExpect(jsonPath("$.name").value("Pradnya")).andExpect(jsonPath("$.designation").value("manager"))
//				.andExpect(jsonPath("$.empId").value("1")).andExpect(jsonPath("$.salary").value(30000000));
		Employee e  = controller.firstPage();
		assertEquals(e.getEmpId(), "1");
		assertEquals(e.getName(), "Pradnya");
		assertEquals(e.getDesignation(), "manager");
		assertEquals(e.getSalary(), 30000000);
		
	}

}
