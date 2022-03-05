package com.gfa.backendapi.controllers;

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
            return new ResponseEntity<>(doublingService.getDoubling(input), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(doublingService.getError(), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping(value = {"/greeter"})
    public ResponseEntity<?> getGreeter(@RequestParam(value = "name", required = false) String name,
                                        @RequestParam(value = "title", required = false) String title) {
        if (name != null && title != null) {
            return new ResponseEntity<>(greeterService.getGreeter(name, title), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(greeterService.getError(name, title), HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping(value = {"/appenda/{appendable}"})
    public ResponseEntity<?> getAppend(@PathVariable(required = false) String appendable) {
        if (appendable != null) {
            return new ResponseEntity<>(appendService.addA(appendable), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping(value = {"/dountil/sum"})
    public ResponseEntity<?> getSum(@RequestParam(value = "input", required = false) Integer input) {
        if (input != null) {
                return new ResponseEntity<>(doUntilService.getResult(input, "sum"), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(doUntilService.getError(), HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping(value = {"/dountil/factor"})
    public ResponseEntity<?> getFactor(@RequestParam(value = "input", required = false) Integer input) {
        if (input != null) {
            return new ResponseEntity<>(doUntilService.getResult(input, "factor"), HttpStatus.OK);
        }
        else {
            return new ResponseEntity<>(doUntilService.getError(), HttpStatus.BAD_REQUEST);
        }
    }
}
