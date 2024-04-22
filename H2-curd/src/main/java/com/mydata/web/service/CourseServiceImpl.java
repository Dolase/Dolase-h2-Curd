package com.mydata.web.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.mydata.web.dto.CourseDto;
import com.mydata.web.entity.Course;
import com.mydata.web.exception.ResourceNotFoundException;
import com.mydata.web.mapper.CourseMapper;
import com.mydata.web.repository.CourseRepository;

@Service
public class CourseServiceImpl implements CourseService{

	CourseRepository cr;

	public CourseServiceImpl(CourseRepository cr) {
		super();
		this.cr = cr;
	}


	@Override
	public CourseDto createCourseData(CourseDto courseDto) {
		
		Course course=CourseMapper.mapToCourse(courseDto);
		Course saveCourse=cr.save(course);
				
		return CourseMapper.mapToCourseDto(saveCourse);
	}

	@Override
	public CourseDto updateCourseData(Long cid, CourseDto courseDto) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCourseData(Long cid) throws ResourceNotFoundException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CourseDto getAllCoursesById(Long cid) throws ResourceNotFoundException {
		
		Course course=cr.findById(cid)
				.orElseThrow(()->
				new ResourceNotFoundException("Course not found with given id:"+cid));
		

		return CourseMapper.mapToCourseDto(course);

	}

	@Override
	public List<CourseDto> getAllCourses() {
		List<Course> list=cr.findAll();
		
		return list.stream()
				.map((courses)-> CourseMapper.mapToCourseDto(courses))
			    .collect(Collectors.toList());
	}

}
