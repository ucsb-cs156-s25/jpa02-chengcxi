package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)

    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void equals_returns_true_for_same_object() {
        assertEquals(true, team.equals(team));
    }

    @Test
    public void equals_returns_false_for_different_object() {
        Object other = "Invalid object";
        assertEquals(false, team.equals(other));
    }

    @Test
    public void equals_returns_false_for_different_name() {
        Team other = new Team("other-team");
        assertEquals(false, team.equals(other));
    }

    @Test
    public void equals_returns_false_for_different_members() {
        Team other = new Team("test-team");
        other.addMember("other-member");
        assertEquals(false, team.equals(other));
    }

    @Test
    public void hashCode_returns_same_value_for_same_object() {
        int result = team.hashCode();
        int expected = -1226298695;
        assertEquals(expected, result);
    }

}
