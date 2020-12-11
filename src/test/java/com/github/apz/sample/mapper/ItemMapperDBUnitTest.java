package com.github.apz.sample.mapper;

import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.TransactionDbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseOperation;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import com.github.springtestdbunit.annotation.DbUnitConfiguration;

@MybatisTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class, DirtiesContextTestExecutionListener.class, TransactionDbUnitTestExecutionListener.class, DbUnitTestExecutionListener.class })
@DbUnitConfiguration(dataSetLoader = CSVDataSetLoader.class, databaseConnection = { "dbUnitDatabaseConnection" })
public class ItemMapperDBUnitTest {

	@Autowired
	ItemMapper mapper;

	@Test
	@DatabaseSetup(connection = "dbUnitDatabaseConnection",  value = "/", type = DatabaseOperation.CLEAN_INSERT)
    public void 検索() {
		var items = mapper.findById("6");
		assertTrue(!items.isEmpty());
		assertTrue(items.size() == 1);

	}

}
