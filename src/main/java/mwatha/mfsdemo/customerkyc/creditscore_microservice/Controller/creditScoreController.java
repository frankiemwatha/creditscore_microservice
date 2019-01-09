package mwatha.mfsdemo.customerkyc.creditscore_microservice.Controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import mwatha.mfsdemo.customerkyc.creditscore_microservice.Exception.CustomerCreditScoreNotFound;
import mwatha.mfsdemo.customerkyc.creditscore_microservice.Model.creditScore;
import mwatha.mfsdemo.customerkyc.creditscore_microservice.Repository.creditScoreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
@Api(value="customer credit score", description="customer credit score")
public class creditScoreController {
    @Autowired
    private creditScoreRepository creditScoreRepository;
    // Single item
    @ApiOperation(value = "View customer loan status either active or inactive")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved customer loan status"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    )
    @RequestMapping(value ="/{id_number}", method= RequestMethod.GET,produces = "application/json")
    creditScore creditScore(@PathVariable int id_number) {
        return creditScoreRepository.findById(id_number)
                .orElseThrow(() -> new CustomerCreditScoreNotFound(id_number));
    }
}
