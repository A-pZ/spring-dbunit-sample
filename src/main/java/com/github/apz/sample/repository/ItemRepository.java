package com.github.apz.sample.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.github.apz.sample.mapper.ItemMapper;
import com.github.apz.sample.record.Item;

@Repository
public class ItemRepository {

	@Mapper
	ItemMapper mapper;

	public List<Item> findByid(String id) {
		return mapper.findById(id);
	}
}
