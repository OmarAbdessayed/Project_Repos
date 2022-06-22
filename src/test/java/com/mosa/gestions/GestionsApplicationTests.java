package com.mosa.gestions;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;

import com.mosa.gestions.entities.Reclamation;

import com.mosa.gestions.repos.RecRepository;
import com.mosa.gestions.service.RecService;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@SpringBootTest
class GestionsApplicationTests {

	@Autowired
	private RecRepository recRepository;
	private RecService recService;
	@Test
	public void testCreateRec() {
	Reclamation prod = new Reclamation("test","test","test","test","test","test","test",new Date());
	recRepository.save(prod);
	}
	@Test
	public void testFindRec()
	{
		Reclamation p = recRepository.findById(1L).get();

	System.out.println(p);
	}
	@Test
	public void testUpdateRec()
	{
		Reclamation p = recRepository.findById(1L).get();
	
	recRepository.save(p);
	}
	
	@Test
	public void testDeleteRec()
	{
		recRepository.deleteById(1L);;
	}
	@Test
	public void testListerTousRecs()
	{
	List<Reclamation> prods = recRepository.findAll();
	for (Reclamation p : prods)
	{
	System.out.println(p);
	}
	}
	@Test
	public void testFindByNomRec()
	{
	List<Reclamation> prods = recRepository.findByNomRec("iphone X");

	for (Reclamation p : prods)
	{
	System.out.println(p);
	}

	}
	@Test
	public void testFindByNomRecContains ()
	{
	List<Reclamation> prods=recRepository.findByNomRecContains("iphone X");

	for (Reclamation p : prods)
	{
	System.out.println(p);
	}
	}
	@Test
	public void testfindByOrderByNomRecAsc()
	{
	List<Reclamation> prods = recRepository.findByOrderByNomRecAsc();
	for (Reclamation p : prods)
	{
	System.out.println(p);
	}
	}
	
	}


