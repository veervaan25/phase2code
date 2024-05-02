package com.caching.caching.demo.using.caffeine.service;

import com.caching.caching.demo.using.caffeine.persistence.Relations;
import com.caching.caching.demo.using.caffeine.repository.RelationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RelationService {
    
    @Autowired
    private RelationRepo relationRepo;
    
    public void saveRelationCodes(List<Relations> codes){

        try {
            relationRepo.saveAll(codes);
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
}
