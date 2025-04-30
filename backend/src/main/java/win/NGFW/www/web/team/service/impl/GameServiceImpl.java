package win.NGFW.www.web.team.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import win.NGFW.www.web.team.dao.GameDao;
import win.NGFW.www.web.team.dto.EventDto;
import win.NGFW.www.web.team.dto.EventExtendedPropsDto;
import win.NGFW.www.web.team.entity.Game;
import win.NGFW.www.web.team.service.GameService;

@Service
public class GameServiceImpl implements GameService{
    @Autowired
    private GameDao dao;

    @Override
    public List<Game> getGameList() {
        return dao.selectAll();
    }

    @Override
    public List<EventDto> getEventList() {
        List<Game> games = dao.selectAll();
        List<EventDto> events = new ArrayList<>();
        games.forEach(game -> {
            EventDto event = new EventDto(
                game.getGameNo(),
                game.getGameDate(),
                    new EventExtendedPropsDto(
                        game.getHomeTeam().getTeamName(),
                        game.getAwayTeam().getTeamName(),
                        game.getHomeTeamScore(),
                        game.getAwayTeamScore(),
                        game.getGameLocation()
                    )
                );
            events.add(event);
        });
        return events;
    }

    @Override
    public Game getGameById(int id) {
        return dao.selectById(id);
    }
}
