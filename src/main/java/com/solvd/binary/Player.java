package com.solvd.binary;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class Player {
    @JsonProperty
    private long id;
    @JsonProperty
    private String name;
    @JsonProperty
    private String lastname;
    @JsonProperty
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM/dd/yyyy")
    private Date birthday;
    @JsonProperty
    private int shirtNumber;
    @JsonProperty("totalBanns")
    private int banns;
    @JsonProperty("totalGoals")
    private int goals;
    @JsonProperty
    private long footballTeamId;

    public Player(long id, String name, String lastname, Date birthday, int shirtNumber, int banns, int goals, long footballTeamId) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.birthday = birthday;
        this.shirtNumber = shirtNumber;
        this.banns = banns;
        this.goals = goals;
        this.footballTeamId = footballTeamId;
    }

    public Player() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public int getShirtNumber() {
        return shirtNumber;
    }

    public void setShirtNumber(int shirtNumber) {
        this.shirtNumber = shirtNumber;
    }

    public int getBanns() {
        return banns;
    }

    public void setBanns(int banns) {
        this.banns = banns;
    }

    public int getGoals() {
        return goals;
    }

    public void setGoals(int goals) {
        this.goals = goals;
    }

    public long getFootballTeamId() {
        return footballTeamId;
    }

    public void setFootballTeamId(long footballTeamId) {
        this.footballTeamId = footballTeamId;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", birthday=" + birthday +
                ", shirtNumber=" + shirtNumber +
                ", banns=" + banns +
                ", goals=" + goals +
                ", footballTeam=" + footballTeamId +
                '}';
    }
}
