package win.NGFW.www.web.team.dao.impl;

import java.util.List;

import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import win.NGFW.www.web.team.dao.GameEventDao;
import win.NGFW.www.web.team.entity.GameEvent;

@Repository
@Transactional
public class GameEventDaoImpl implements GameEventDao {
    @PersistenceContext
    private Session session;

    @Override
    public List<GameEvent> findByGameId(Integer gameId) {
        String hql = "FROM GameEvent WHERE gameId = :gameId";
        return session.createQuery(hql, GameEvent.class)
                .setParameter("gameId", gameId)
                .getResultList();
    }

}
