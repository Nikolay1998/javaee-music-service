package com.service.music;

import javax.ejb.Singleton;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

@Singleton
public class TrackBean {
    @PersistenceContext(unitName = "myunit")
    private EntityManager em;

    public Collection<Track> findAll(){
        return em.createQuery("SELECT t FROM Track t", Track.class).getResultList();
    }
}
