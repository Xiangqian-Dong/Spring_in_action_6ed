package com.example.tacocloud;

import static org.hamcrest.Matchers.containsString;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest
class TacocloudApplicationTests {
	@Autowired
	private MockMvc mockMvc;
	@Test
	public void homeTest() throws Exception {
		mockMvc.perform(get("/")).andExpect(status().isOk())
		.andExpect(view().name("home")).andExpect(content().string(containsString("Welcome to...")));
	}

}
