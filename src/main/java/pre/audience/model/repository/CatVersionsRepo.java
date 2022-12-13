package pre.audience.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import pre.audience.model.domain.CatVersions;

public interface CatVersionsRepo extends MongoRepository<CatVersions, Integer> {

}