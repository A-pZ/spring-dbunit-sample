package com.github.apz.sample.mapper;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;

import com.github.apz.sample.mapper.ItemMapper;

@MybatisTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ItemMapperTest {
	@Autowired
	ItemMapper mapper;

	@Test
	void 検索() {
		var items = mapper.findById("1");

		assertTrue(!items.isEmpty());
		assertTrue(items.size() == 1);

	}
}
