package win.NGFW.www.web.team.entity;

import java.time.LocalTime;


import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "game_events")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class GameEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "game_id")
    private Integer gameId;

    @Column(name = "event_time")
    private String eventTime;

    @Column(name = "quarter")
    private Integer quarter;

    @Column(name = "team")
    private String team;

    @Column(name = "player_number")
    private Integer playerNumber;

    @Column(name = "player_name")
    private String playerName;

    @Column(name = "event_type")
    private String eventType;

    @Column(name = "points")
    private Integer points;

    @Column(name = "description")
    private String description;
}
