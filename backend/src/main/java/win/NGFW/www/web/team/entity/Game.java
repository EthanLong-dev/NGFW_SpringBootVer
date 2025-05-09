package win.NGFW.www.web.team.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "game")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "game_id")
    private Integer id;
    
    @ManyToOne
    @JoinColumn(name = "team_idh")
    private Team homeTeam;
    
    @ManyToOne
    @JoinColumn(name = "team_ida")
    private Team awayTeam;
    
    @Column(name = "game_num")
    private int gameNo;
    
    @Column(name = "game_date")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm", timezone = "Asia/Taipei")
    private Date gameDate;
    
    @Column(name = "game_location")
    private String gameLocation;
    
    @Column(name = "game_homescore")
    private String homeTeamScore;
    
    @Column(name = "game_awayscore")
    private String awayTeamScore;
}
