package com.example.entrevueSpringBoot.entrevueservicesimpl;

import com.example.entrevueSpringBoot.entrevueentities.Actor;
import com.example.entrevueSpringBoot.entrevuerepositories.ActorRepository;
import com.example.entrevueSpringBoot.entrevueservices.IActorService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ActorServiceImpl implements IActorService {

    private ActorRepository actorRepository;

    public ActorServiceImpl(ActorRepository actorRepository) {
        this.actorRepository = actorRepository;
    }

    @Override
    @Transactional
    public Actor addAnActor(Actor actor) {
        return actorRepository.save(actor);
    }

    @Override
    @Transactional
    public Actor displayAnActor(Long id) {
        Optional<Actor> actor = actorRepository.findById(id);
         if (actor.isEmpty())  {
             throw new RuntimeException("No actor presents with id: "+id);
         }

         return actor.get();
    }
}
