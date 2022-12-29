package org.example.dto;

import java.util.List;

public class Question {

    private String f;
    private List<String> a;
    private List<String> v;

    public Question() {
    }

    public Question(String f, List<String> a, List<String> v) {
        this.f = f;
        this.a = a;
        this.v = v;
    }

    public String getF() {
        return f;
    }

    public void setF(String f) {
        this.f = f;
    }

    public List<String> getA() {
        return a;
    }

    public void setA(List<String> a) {
        this.a = a;
    }

    public List<String> getV() {
        return v;
    }

    public void setV(List<String> v) {
        this.v = v;
    }
}
