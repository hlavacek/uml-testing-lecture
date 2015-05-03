package com.accenture.ddc.sdj.service;

import static org.hamcrest.Matchers.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.accenture.ddc.sdj.App;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = App.class)
@WebAppConfiguration
public class BookServiceTest {

	@Autowired
	protected WebApplicationContext wac;
	private MockMvc mockMvc = null;

	@Before
	public void init() {
		this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
	}

	@Test
	public void shouldReturnSingleBook() throws Exception {
		String url = "/books/1";
		mockMvc
				.perform(get(url).contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				//.andDo(print())
				.andExpect(jsonPath("id", equalTo(1)))
				.andExpect(jsonPath("name", equalTo("Lord of the rings: The Fellowship of the Ring")));

	}
	
	@Test
	public void shouldReturnAllBooks() throws Exception {
		String url = "/books";
		mockMvc
				.perform(get(url).contentType(MediaType.APPLICATION_JSON))
				.andExpect(status().isOk())
				//.andDo(print())
				.andExpect(jsonPath("$", hasSize(10)));

	}
}
