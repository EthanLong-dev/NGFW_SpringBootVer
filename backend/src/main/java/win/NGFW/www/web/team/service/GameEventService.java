package win.NGFW.www.web.team.service;

import java.util.List;

import win.NGFW.www.web.team.entity.GameEvent;

public interface GameEventService {

    public List<GameEvent> getGameEventListByGameId(Integer gameId);
}
