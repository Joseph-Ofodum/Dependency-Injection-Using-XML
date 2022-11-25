package org.example;


import lombok.Data;
//right here i commented out the constructor in both xml and this place because i am using setters DI
//once we uncomment the constructor in both classes then we will be using the constructor Injection.
@Data
public class Lawyer implements Staff{
    private String qualification;
    private ParaLegal paraLegal;

    //note that when you set a constructor it mst reflect on your xml file else it will throw an error.

//    public Lawyer(String qualification) {
//        this.qualification = qualification;
//    }

    public void defend(){
        System.out.println("i am your defender");
    }

    public void setParalegal(ParaLegal paralegal) {
    }
}


