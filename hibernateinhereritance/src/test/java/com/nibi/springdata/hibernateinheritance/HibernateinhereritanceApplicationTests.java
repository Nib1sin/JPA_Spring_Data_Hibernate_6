package com.nibi.springdata.hibernateinheritance;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.nibi.springdata.hibernateinheritance.entities.Check;
import com.nibi.springdata.hibernateinheritance.entities.CreditCard;
import com.nibi.springdata.hibernateinheritance.entities.repos.PaymentRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HibernateinhereritanceApplicationTests {

	@Autowired
	PaymentRepository repository;
	
	
	@Test
	public void contextLoads() {
	}

	
	
	//
	@Test
	public void createPayment() {
		
		CreditCard cc = new CreditCard();
		cc.setId(122);
		cc.setAmount(1000);
		cc.setCardnumber("123456789");
		repository.save(cc);
		
	}
	
	
	
	
	//
	@Test
	public void createCheckPayment() {
		
		Check ch = new Check();
		ch.setId(124);
		ch.setAmount(1000);
		ch.setChecknumber("123456789");	
		repository.save(ch);
		
	}
}
