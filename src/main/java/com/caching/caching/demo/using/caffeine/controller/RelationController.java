package com.caching.caching.demo.using.caffeine.controller;

import com.caching.caching.demo.using.caffeine.dto.RelationDto;
import com.caching.caching.demo.using.caffeine.persistence.Relations;
import com.caching.caching.demo.using.caffeine.service.RelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("relations")
@RestController
public class RelationController {


    @Autowired
    private RelationService relationService;

    @PostMapping("/saveCode")
    public ResponseEntity<String> saveRelationShipCodes(@RequestBody RelationDto relations) {

        List<Relations> relationsList = new ArrayList<>();
        relations.getRelationCodes().forEach(code -> {
            Relations relations1 = new Relations();
            relations1.setRelation_code(code);
            relationsList.add(relations1);
        });
        relationService.saveRelationCodes(relationsList);
        return new ResponseEntity<>("Success", HttpStatus.CREATED);

    }


    @GetMapping("/fetchCodes")
    public ResponseEntity<List<Relations>> fetchCodes(){
        final List<Relations> relationsList = relationService.fetchCodes();
        return new ResponseEntity<>(relationsList,HttpStatus.OK);
    }
}
