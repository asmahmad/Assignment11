package com.codercampus.Assignment11;

import org.junit.jupiter.api.Test;

import com.codercampus.Assignment11.domain.Transaction;
import com.codercampus.Assignment11.repository.TransactionRepository;

class Assignment11ApplicationTests {
	
	@Test
	void should_get_transaction_findbyId ()  {
		
		TransactionRepository tr = new TransactionRepository();
		Transaction trans = new Transaction();
		trans = tr.findById((long) 8);
		System.out.println(trans);
	}
}
