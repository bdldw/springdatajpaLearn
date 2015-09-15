package com.oneapm.springjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BaseDao implements CommandLineRunner {
	@Autowired
	private CityRepository ci;
	
	public static void main(String[] args) {
		SpringApplication.run(BaseDao.class);
		// AbstractApplicationContext context = new
		// ClassPathXmlApplicationContext("spring-config.xml");
		// CityRepository repository = context.getBean(CityRepository.class);
		// RegionRepository bean = context.getBean(RegionRepository.class);
		//
		// City findOne = repository.findOne(2);
		// City newCity = new City();
		// newCity.setCityName("天津");
		//
		// newCity.setRegionId(bean.findOne(2));
		// repository.save(newCity);
		// bean.findOne(999);
		// System.out.println(findOne.getCityName());
		// context.close();
	}

	public void run(String... arg0) throws Exception {
		City findOne = ci.findOne(2);
		System.out.println("==============>"+findOne.getCityName());
	}

}
