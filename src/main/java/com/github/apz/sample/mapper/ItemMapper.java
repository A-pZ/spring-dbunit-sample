package com.github.apz.sample.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.github.apz.sample.record.Item;

@Mapper
public interface ItemMapper {
	public List<Item> findById(@Param("id") String id);
}
