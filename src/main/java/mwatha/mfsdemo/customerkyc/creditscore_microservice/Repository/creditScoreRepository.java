package mwatha.mfsdemo.customerkyc.creditscore_microservice.Repository;

import mwatha.mfsdemo.customerkyc.creditscore_microservice.Model.creditScore;
import org.springframework.data.repository.CrudRepository;
import org.springframework.web.bind.annotation.RestController;

@RestController
public interface creditScoreRepository extends CrudRepository <creditScore,Integer>{

}
