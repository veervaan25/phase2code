package com.caching.caching.demo.using.caffeine.service;

import com.caching.caching.demo.using.caffeine.persistence.Relations;
import com.caching.caching.demo.using.caffeine.repository.RelationRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
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

    @Cacheable(value = "codesCache",key = "#root.method.name")
    public List<Relations> fetchCodes() {
        int count =1;
        log.info("Calling repo count {}", count);
        count++;
        return relationRepo.findAll();
    }
}
