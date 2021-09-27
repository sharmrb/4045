package Assignment0.service;

import org.springframework.stereotype.Component;


import Assignment0.dto.Assignment0DTO;
@Component
public class Assignment0Stub implements IAssignment0service {
	
	 public Assignment0DTO fetchby(int id) {
		Assignment0DTO assignmentDTO=new Assignment0DTO();
		assignmentDTO.setName(43);
		assignmentDTO.setYear("Third");
		assignmentDTO.setMajor("IT");
		assignmentDTO.setDescription("Third year student in SOIT");
		return assignmentDTO;
	}
	
	@Override
	public void save(Assignment0DTO assignment0DTO) {

}}
