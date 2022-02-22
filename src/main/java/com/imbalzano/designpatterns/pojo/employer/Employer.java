package com.imbalzano.designpatterns.pojo.employer;

import com.imbalzano.designpatterns.ipojo.IEmployer;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
@Setter
@Getter
public class Employer implements IEmployer {

    private String invoice;
    private List<String> tasks;

    @Override
    public String getEmployer() {
        return "normal";
    }

    @Override
    public void invoicesPrint() {
        log.info("YOUR INVOICE: "+this.invoice);
    }

    public void iExist(){
        System.out.println(" ######## Employer instance generated with success!");
    }

    @Override
    public void Tasks() {
        log.info("--+ Tasks +--");
        for(String task:this.tasks)
            log.info(" ::"+task);
        log.info("--+ ++++ +--");
    }
}
