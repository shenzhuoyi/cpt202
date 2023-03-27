package com.cpt202.team.models;

public class Team {
    private String name;
    private int membercount;
    

    public Team() {
    }

    public Team(String name, int membercount) {
        this.name = name;
        this.membercount = membercount;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getMembercount() {
        return membercount;
    }
    public void setMembercount(int membercount) {
        this.membercount = membercount;
    }

    
}
