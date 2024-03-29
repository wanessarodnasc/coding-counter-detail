package com.counter.detail.repository;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.counter.detail.model.CounterDetail;

/**
* 
* @author Wanessa Nascimento
*
*/
@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
public class CounterDetailRepositoryTest {

	@Autowired
	private CounterDetailRepository repository;

	@Test
	public void saveUser() throws Exception {
		repository.save(new CounterDetail());
	}
	
	@Test
    public void findAll() {
        repository.save(new CounterDetail());
        assertNotNull(repository.findAll());
    }
	
	@Test
	public void testFindAllById() {
		CounterDetail user = repository.save(new CounterDetail());
		Optional<CounterDetail> userReturned = repository.findById(user.getId());
		assertEquals(true, userReturned.isPresent());
	}
	
	@Test
	public void testGetOne() {
		CounterDetail user = repository.save(new CounterDetail());
		assertEquals(user.getId(), repository.getOne(user.getId()).getId());
	}
}
