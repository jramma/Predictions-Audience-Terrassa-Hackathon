package pre.audience.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import pre.audience.model.domain.CatAudiences;

public interface CatAudRepo extends MongoRepository<CatAudiences, String> {

}