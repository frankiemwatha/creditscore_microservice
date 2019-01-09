package mwatha.mfsdemo.customerkyc.creditscore_microservice.Model;

import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "creditscore", schema = "public")
public class creditScore {

        //values
        @ApiModelProperty(notes = "credit score")
        private String credit_score;
        @Id
        @ApiModelProperty(notes = "customer ID Number")
        private int id_number;

        public String getCredit_score()
        {
            return credit_score;
        }

        public void setCredit_score(String credit_score){
            this.credit_score = credit_score;
        }

        public int getId_number()
        {
            return id_number;
        }
        public void setId_number(int id_number){
            this.id_number = id_number;
        }
}
