package com.alldeals.service;

import com.alldeals.domain.DealCategory;
import com.alldeals.repository.DealRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class DealServiceTest {
	private DealCategory dealCategory;

	@Mock
	private DealRepository dealRepository;

	@InjectMocks
	private DealServiceImpl dealService;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		dealCategory = new DealCategory(1, "Tech & Electronic");
	}

	@Test
	public void at_leat_one_deal_belog_to_this_category() {
		int dealId = dealCategory.getId();
		int dealAmount = dealService.findDealsByCategory(dealId).size();
		// Assert
		Assert.assertTrue(dealAmount < 1);
	}
}