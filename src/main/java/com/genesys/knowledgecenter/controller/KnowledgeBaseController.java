package com.genesys.knowledgecenter.controller;

import com.genesys.knowledgecenter.response.KnowledgeBase;
import com.genesys.knowledgecenter.service.KnowledgeBaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;
import java.util.Set;

@RestController
@RequestMapping(value = "/knowledgeBase")
public class KnowledgeBaseController {

    @Autowired
    KnowledgeBaseService knowledgeBaseService;

    @RequestMapping(value="/create", method= RequestMethod.POST)
    String createKnowledgeBase(@RequestBody KnowledgeBase knowledgeBase){
       String result = knowledgeBaseService.createKnowledgeBase(knowledgeBase);
       return result;
    }

    /*@RequestMapping(value="/getKnowledgeBaseWithCategories", method=RequestMethod.GET)
    Map<String, Set<String>> getKnowledgeBase(){

    }*/
}
