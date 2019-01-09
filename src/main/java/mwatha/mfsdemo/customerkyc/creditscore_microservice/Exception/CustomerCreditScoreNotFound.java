package mwatha.mfsdemo.customerkyc.creditscore_microservice.Exception;

public class CustomerCreditScoreNotFound extends RuntimeException {
    public CustomerCreditScoreNotFound(int id_number) {
        super("Could not find credit score customer with ID Number " + id_number);
    }

}
