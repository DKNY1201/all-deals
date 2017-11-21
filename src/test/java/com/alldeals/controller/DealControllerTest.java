package com.alldeals.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import java.math.BigDecimal;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import com.alldeals.config.WebApplicationContextConfig;
import com.alldeals.domain.Deal;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = WebApplicationContextConfig.class)
@WebAppConfiguration
public class DealControllerTest {
	@Autowired
	private WebApplicationContext wac;
	private MockMvc mockMvc;

	@Before
	public void setup() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	}

	@Test
	public void testGetProducts() throws Exception {
		this.mockMvc.perform(get("/deals/categories/1")).andExpect(model().attributeExists("deals"));
	}

	@Test
	public void testGetProductById() throws Exception {
		// Arrange
		Deal deal = new Deal(new Long(1), "Dell XPS 13.3 Touch-QHD");
		// Act & Assert
		this.mockMvc.perform(get("/deals/detail/1")).andExpect(model().attributeExists("deal"))
				.andExpect(model().attribute("deal", deal));
	}
}
