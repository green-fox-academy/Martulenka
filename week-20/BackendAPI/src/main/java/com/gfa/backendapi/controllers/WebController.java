package com.gfa.backendapi.controllers;

import com.gfa.backendapi.models.*;
import com.gfa.backendapi.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class WebController {

    private DoublingService doublingService;
    private GreeterService greeterService;
    private AppendService appendService;
    private DoUntilService doUntilService;
    private ArrayHandlerService arrayHandlerService;
    private LogService logService;
    private SithService sithService;

    @Autowired
    public WebController(DoublingService doublingService, GreeterService greeterService, AppendService appendService, DoUntilService doUntilService, ArrayHandlerService arrayHandlerService, LogService logService, SithService sithService) {
        this.doublingService = doublingService;
        this.greeterService = greeterService;
        this.appendService = appendService;
        this.doUntilService = doUntilService;
        this.arrayHandlerService = arrayHandlerService;
        this.logService = logService;
        this.sithService = sithService;
    }

    @GetMapping(value = {"/doubling"})
    public ResponseEntity<?> getDoubling(@RequestParam(value = "input", required = false) Integer input) {
        logService.save(new Log("/doubling","input=" + input));

        if (input != null) {
            return new ResponseEntity<>(doublingService.addDoubling(input), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(doublingService.getError(), HttpStatus.OK);
        }
    }

    @GetMapping(value = {"/greeter"})
    public ResponseEntity<?> getGreeter(@RequestParam(value = "name", required = false) String name,
                                        @RequestParam(value = "title", required = false) String title) {
        logService.save(new Log("/greeter","name=" + name + ", title=" + title));

        if (name != null && title != null) {
            return new ResponseEntity<>(greeterService.addGreeter(name, title), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(greeterService.getError(name, title), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping(value = {"/appenda/{toAppend}"})
    public ResponseEntity<?> getAppend(@PathVariable(required = false) String toAppend) {
        logService.save(new Log("/appenda","appenda=" + toAppend));

        if (toAppend != null) {
            return new ResponseEntity<>(appendService.addA(toAppend), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping(value = {"/dountil/sum"})
    public ResponseEntity<?> postSum(@RequestBody DoUntil doUntil) {

        if (doUntil != null) {
            logService.save(new Log("/dountil/sum","until=" + doUntil.getUntil()));
            doUntil.setResult(doUntilService.getSumUntil(doUntil.getUntil()));
            return new ResponseEntity<>(doUntil, HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(doUntilService.getError(), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(value = {"/dountil/factor"})
    public ResponseEntity<?> postFactor(@RequestBody DoUntil doUntil) {
        if (doUntil != null) {
            logService.save(new Log("/dountil/factor","until=" + doUntil.getUntil()));
            doUntil.setResult(doUntilService.getFactor(doUntil.getUntil()));
            return new ResponseEntity<>(doUntil, HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(doUntilService.getError(), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(value = {"/arrays"})
    public ResponseEntity<?> postArrays(@RequestBody ArrayHandler arrayHandler) {
        if (arrayHandler.getWhat() != null && arrayHandler.getNumbers() != null) {
            logService.save(new Log("/arrays","what=" + arrayHandler.getWhat() + ", number=" + arrayHandler.getNumbers()));
            if(arrayHandler.getWhat().contains("double")){

                return new ResponseEntity<>(arrayHandlerService.getResultList(arrayHandler), HttpStatus.OK);
            }else {
                return new ResponseEntity<>(arrayHandlerService.getResultInteger(arrayHandler), HttpStatus.OK);
            }

        }
        else {
            return new ResponseEntity<>(arrayHandlerService.getError(arrayHandler.getWhat(), arrayHandler.getNumbers()), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping(value = {"/log"})
    public ResponseEntity<?> getLog(){
        if (logService.getAllLogs().isEmpty() || logService.getAllLogs() == null) {
            return new ResponseEntity<>(new ErrorMessage("There are no entries in the database"),HttpStatus.NOT_FOUND);
        }else{
            return new ResponseEntity<>(new LogSet(logService.getAllLogs(),logService.getCount()), HttpStatus.OK);
        }

    }

    @PostMapping(value = {"/sith"})
    public ResponseEntity<?> postSith(@RequestBody Sith sith) {


        if (sith.getText() != null) {

            logService.save(new Log("/sith","text=" + sith.getText()));

            sith.setSith_text(sithService.reverserOfSith(sith.getText()));

            return new ResponseEntity<>(sith, HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(new ErrorMessage("Feed me some text you have to, padawan young you are. Hmmm."), HttpStatus.BAD_REQUEST);
        }
    }

}
