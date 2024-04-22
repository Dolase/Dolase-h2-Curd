package com.mydata.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mydata.web.dto.CourseDto;
import com.mydata.web.exception.ResourceNotFoundException;
import com.mydata.web.service.CourseService;

@RestController
@RequestMapping("api/courses")
public class CourseController {

	CourseService cs;

	public CourseController(CourseService cs) {
		super();
		this.cs = cs;
	}
	
	@PostMapping
	public ResponseEntity<CourseDto> createCourseRecord(@RequestBody CourseDto courseDto){
		
		CourseDto cDto=cs.createCourseData(courseDto);
		return new ResponseEntity<>(cDto,HttpStatus.CREATED);
		
	}
	
	@GetMapping("{cid}")
	public ResponseEntity<CourseDto> getCourseRecordById(@PathVariable Long cid) throws ResourceNotFoundException{
		
		CourseDto cDto=cs.getAllCoursesById(cid);
		return ResponseEntity.ok(cDto);
		
	}
}
