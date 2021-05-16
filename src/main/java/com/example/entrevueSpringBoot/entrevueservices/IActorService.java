package com.example.entrevueSpringBoot.entrevueservices;

import com.example.entrevueSpringBoot.entrevueentities.Actor;

public interface IActorService {
    public Actor addAnActor(Actor actor);
    public Actor displayAnActor(Long id);
}
