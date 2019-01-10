package ro.sapientia2015.story.model;

import org.junit.Test;

import static junit.framework.Assert.*;

public class SprintNewTest {

	@Test
	public void testTitle(){
		Sprint sprint = Sprint.getBuilder("Hello").build();
		assertNotNull(sprint.getTitle());
	}
	
}
