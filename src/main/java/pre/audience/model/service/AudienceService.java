package pre.audience.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pre.audience.model.domain.CatAudiences;
import pre.audience.model.repository.CatAudRepo;
import pre.audience.model.repository.CatHallsRepo;
import pre.audience.model.repository.CatVersionsRepo;
import pre.audience.model.repository.NationAudRepo;

@Service
public class AudienceService {
	
	@Autowired
	private CatAudRepo catAudRepo;
	@Autowired
	private CatHallsRepo catHallsRepo;
	@Autowired
	private CatVersionsRepo catVersionsRepo;
	@Autowired
	private NationAudRepo nationAudRepo;
	
	public List<CatAudiences> getCatAud(){

	return catAudRepo.findAll();
	}
	
	
	
}
