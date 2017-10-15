package com.agharibi.springmvcmongodb.services;

import com.agharibi.springmvcmongodb.commands.UnitOfMeasureCommand;
import com.agharibi.springmvcmongodb.converters.UnitOfMeasureToUnitOfMeasureCommand;
import com.agharibi.springmvcmongodb.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

@Service
public class UnitOfMeasureServiceImpl implements UnitOfMeasureService {


    private final UnitOfMeasureRepository unitOfMeasureRepository;
    private final UnitOfMeasureToUnitOfMeasureCommand unitOfMeasureToUnitOfMeasureCommand;

    public UnitOfMeasureServiceImpl(UnitOfMeasureRepository unitOfMeasureRepository,
                                    UnitOfMeasureToUnitOfMeasureCommand unitOfMeasureToUnitOfMeasureCommand) {

        this.unitOfMeasureRepository = unitOfMeasureRepository;
        this.unitOfMeasureToUnitOfMeasureCommand = unitOfMeasureToUnitOfMeasureCommand;
    }

    @Override
    public Set<UnitOfMeasureCommand> listAllUoms() {

        Set<UnitOfMeasureCommand> unitOfMeasureCommands =
                StreamSupport.stream(unitOfMeasureRepository.findAll()
                        .spliterator(), false)
                        .map(unitOfMeasureToUnitOfMeasureCommand::convert)
                        .collect(Collectors.toSet());


        return unitOfMeasureCommands;
    }
}
