package com.ssafit.yus.model.dao;

import java.util.List;

import com.ssafit.yus.model.dto.YoutubeComm;

public interface YoutubeCommDao {
	List<YoutubeComm> selectAll();
}