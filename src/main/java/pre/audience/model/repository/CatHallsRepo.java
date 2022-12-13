package pre.audience.model.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import pre.audience.model.domain.CatHalls;

public interface CatHallsRepo extends MongoRepository<CatHalls, String> {

}