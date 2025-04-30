package win.NGFW.www.web.team.service;

import java.util.List;

import win.NGFW.www.web.team.dto.EventDto;
import win.NGFW.www.web.team.entity.Game;

public interface GameService {
    public List<Game> getGameList();

    public List<EventDto> getEventList();

    public Game getGameById(int id);
}
