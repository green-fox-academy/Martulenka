package com.gfa.backendapi.controllers;

import com.gfa.backendapi.models.DoUntil;
import com.gfa.backendapi.services.AppendService;
import com.gfa.backendapi.services.DoUntilService;
import com.gfa.backendapi.services.DoublingService;
import com.gfa.backendapi.services.GreeterService;
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

    @Autowired
    public WebController(DoublingService doublingService, GreeterService greeterService, AppendService appendService, DoUntilService doUntilService) {
        this.doublingService = doublingService;
        this.greeterService = greeterService;
        this.appendService = appendService;
        this.doUntilService = doUntilService;
    }

    @GetMapping(value = {"/doubling"})
    public ResponseEntity<?> getDoubling(@RequestParam(value = "input", required = false) Integer input) {
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
        if (name != null && title != null) {
            return new ResponseEntity<>(greeterService.addGreeter(name, title), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(greeterService.getError(name, title), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping(value = {"/appenda/{toAppend}"})
    public ResponseEntity<?> getAppend(@PathVariable(required = false) String toAppend) {
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
            doUntil.setResult(doUntilService.getFactor(doUntil.getUntil()));
            return new ResponseEntity<>(doUntil, HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(doUntilService.getError(), HttpStatus.BAD_REQUEST);
        }
    }
}
