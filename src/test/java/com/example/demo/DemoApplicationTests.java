package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
	public void stage1() {
		for(int i = 1;i<=100; i++){
			if(i%3==0&&i%5==0){
				System.out.println("FizzBuzz");
			} else{
				if(i%3==0){
					System.out.println("Fizz");
				} else if(i%5==0){
					System.out.println("Buzz");
				} else {
					System.out.println(i);
				}
			}
		}
	}

	@Test
	public void stage2() {
		for(int i = 1;i<=100; i++){
			String str = Integer.toString(i);
			if((i%3==0&&i%5==0)||str.contains("3")||str.contains("5")){
				System.out.println("FizzBuzz");
			} else{
				if(i%3==0||str.contains("3")){
					System.out.println("Fizz");
				} else if(i%5==0||str.contains("5")){
					System.out.println("Buzz");
				} else {
					System.out.println(i);
				}
			}
		}
	}



}
