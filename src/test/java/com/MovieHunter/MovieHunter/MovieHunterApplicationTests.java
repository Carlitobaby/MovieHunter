package com.MovieHunter.MovieHunter;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MovieHunterApplicationTests {

	@Test
	public void contextLoads() {
	}
	
	//It's also important to have a main method with a .run command to get the spring
	//to work.  This I mentioned this earlier but the error I got when I ran your code
	//said you didn't have a main method, so it's important to add one.
	
	public static void main(String[] args) {
		SpringApplication.run(MovieHunterApplicationTests.class, args);
	
}
}

//now, after I ran that after adding the code and choosing to run the movie 
//application.test file it's giving me a runtime error, but the previous error 
//of not having a main method no longer pops up, so that's good. 




