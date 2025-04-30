package win.NGFW.www.web.team.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import win.NGFW.www.web.team.dao.TeamDao;
import win.NGFW.www.web.team.entity.Team;
import win.NGFW.www.web.team.service.TeamService;

@Service
public class TeamServiceImpl implements TeamService {
    @Autowired
    private TeamDao dao;

    @Override
    public List<Team> getList() {
        return dao.selectAll();
    }

}
