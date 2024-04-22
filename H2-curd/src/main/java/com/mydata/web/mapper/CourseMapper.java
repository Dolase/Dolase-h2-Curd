package com.mydata.web.mapper;

import com.mydata.web.dto.CourseDto;
import com.mydata.web.entity.Course;

public class CourseMapper {

	public static CourseDto mapToCourseDto(Course course) {
		return new CourseDto(course.getCid(),course.getCname(),course.getDuration(),course.getFees());
		
	}
	
	public static Course mapToCourse(CourseDto courseDto) {
		return new Course(courseDto.getCid(),courseDto.getCname(),courseDto.getDuration(),courseDto.getFees());
	}
}
