package com.mydata.web.service;

import java.util.List;

import com.mydata.web.dto.CourseDto;
import com.mydata.web.exception.ResourceNotFoundException;

public interface CourseService {

	public CourseDto createCourseData(CourseDto courseDto);
	public CourseDto updateCourseData(Long cid,CourseDto courseDto) throws ResourceNotFoundException;
	public void deleteCourseData(Long cid) throws ResourceNotFoundException;
	public CourseDto getAllCoursesById(Long cid) throws ResourceNotFoundException;
	public List<CourseDto> getAllCourses();
}
