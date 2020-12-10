package com.github.apz.sample.repository

import org.junit.runner.RunWith
import org.mybatis.spring.boot.test.autoconfigure.MybatisTest
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.junit4.SpringRunner

import spock.lang.Specification

@RunWith(SpringRunner.class)
@MybatisTest
class ItemRepositoryTest extends Specification {
	@Autowired
	ItemRepository repository;

	def 検索() {
		when:
		def result = repository.findByid("1");

		then:
		result.size() == 2
	}
}
