package com.example.CricketGameWithSpring.Entity;


import jakarta.persistence.Entity;
import jdk.jfr.DataAmount;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class MatchDetails
{
   private String team1Name;
   private String team2Name;
   private int overs;
   private List<Integer> team1PlayerId;
   private List<Integer>team2PlayerId;
}
