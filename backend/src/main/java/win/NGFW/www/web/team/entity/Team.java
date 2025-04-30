package win.NGFW.www.web.team.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "team")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Team {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "team_id")
    private Integer id;
    
    @Column(name = "team_name", nullable = false)
    private String teamName;
    
    @Column(name = "team_logo")
    private String teamLogo;
    
    @Column(name = "team_link")
    private String teamLink;
    
    @Column(name = "team_court")
    private String teamCourt;
    
    @Column(name = "description")
    private String description;
}
