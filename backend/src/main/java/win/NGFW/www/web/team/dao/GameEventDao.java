package win.NGFW.www.web.team.dao;

import java.util.List;

import win.NGFW.www.web.team.entity.GameEvent;

public interface GameEventDao {
    public List<GameEvent> findByGameId(Integer gameId);
}
