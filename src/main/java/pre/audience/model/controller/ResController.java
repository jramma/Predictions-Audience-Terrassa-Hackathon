package pre.audience.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pre.audience.model.domain.*;
import pre.audience.model.service.AudienceService;

@RestController
public class ResController {
	@Autowired
	AudienceService audienceService;
	
	@GetMapping("/getCatAudience")
	public List<CatAudiences> getCatAudience(){
		return audienceService.getCatAud();
	}
}
