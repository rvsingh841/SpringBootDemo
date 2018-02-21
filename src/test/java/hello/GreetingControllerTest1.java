package hello;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class GreetingControllerTest1 {

	@Autowired
	private MockMvc mockMvc;
	@Test
	public void test() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testHome() throws Exception{
		
		mockMvc.perform(get("/api/home"))
        .andExpect(status().isOk());
        /*.andExpect(content().contentType(TestUtil.APPLICATION_JSON_UTF8))
        .andExpect(jsonPath("$", hasSize(2)))
        .andExpect(jsonPath("$[0].id", is(1)))
        .andExpect(jsonPath("$[0].description", is("Lorem ipsum")))
        .andExpect(jsonPath("$[0].title", is("Foo")))
        .andExpect(jsonPath("$[1].id", is(2)))
        .andExpect(jsonPath("$[1].description", is("Lorem ipsum")))
        .andExpect(jsonPath("$[1].title", is("Bar")));*/
	}

}
