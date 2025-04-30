package win.NGFW.www.web.team.dao;

import java.util.List;

import win.NGFW.www.web.team.entity.Team;

public interface TeamDao {
    public List<Team> selectAll();
}
