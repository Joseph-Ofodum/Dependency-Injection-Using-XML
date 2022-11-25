package org.example;

import lombok.Data;

@Data
public class ParaLegal implements Staff{
    private String qualification;
    private Lawyer lawyer;

//    public ParaLegal(String qualification) {
//        this.qualification = qualification;
//    }

    public void defend(){
        System.out.println("paraLegal is helping");
    }
}
