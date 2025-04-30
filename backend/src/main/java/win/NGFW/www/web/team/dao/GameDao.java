package win.NGFW.www.web.team.dao;

import java.util.List;

import win.NGFW.www.web.team.entity.Game;

public interface GameDao {
    public List<Game> selectAll();

    public Game selectById(int id);
}
