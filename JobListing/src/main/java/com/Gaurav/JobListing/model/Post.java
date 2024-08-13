package com.Gaurav.JobListing.model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Arrays;

@Document(collection = "jobpost")
public class Post {

    private String desc;
    private String exp;
    private String profilr;
    private String techs[];



    public Post() {
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getExp() {
        return exp;
    }

    public void setExp(String exp) {
        this.exp = exp;
    }

    public String getProfilr() {
        return profilr;
    }

    public void setProfilr(String profilr) {
        this.profilr = profilr;
    }

    public String[] getTechs() {
        return techs;
    }

    public void setTechs(String[] techs) {
        this.techs = techs;
    }

    @Override
    public String toString() {
        return "Post{" +
                "desc='" + desc + '\'' +
                ", exp='" + exp + '\'' +
                ", profilr='" + profilr + '\'' +
                ", techs=" + Arrays.toString(techs) +
                '}';
    }
}
