package pre.audience.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import pre.audience.model.domain.NationAudiences;

public interface NationAudRepo extends MongoRepository<NationAudiences, Integer> {

}