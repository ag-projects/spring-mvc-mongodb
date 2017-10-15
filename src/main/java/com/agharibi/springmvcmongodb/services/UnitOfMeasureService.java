package com.agharibi.springmvcmongodb.services;

import com.agharibi.springmvcmongodb.commands.UnitOfMeasureCommand;

import java.util.Set;

public interface UnitOfMeasureService {

    Set<UnitOfMeasureCommand> listAllUoms();

}
