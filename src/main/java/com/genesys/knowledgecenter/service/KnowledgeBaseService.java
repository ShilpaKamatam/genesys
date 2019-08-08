package com.genesys.knowledgecenter.service;

import com.genesys.knowledgecenter.directory.KnowledgeBaseDirectory;
import com.genesys.knowledgecenter.response.KnowledgeBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public class KnowledgeBaseService {

       KnowledgeBaseDirectory directory = KnowledgeBaseDirectory.getInstance();

    public String createKnowledgeBase(KnowledgeBase knowledgeBase){
        if(knowledgeBase != null){
          String validationNote = validateKnowledgeBase(knowledgeBase);
          if(validationNote!= null){
              return validationNote;
          }
          //persist knowledgeBase
           if(!saveKnowledgeBase(knowledgeBase)){
               return "failure";
           }
       }
       return "success";
    }

    private boolean saveKnowledgeBase(KnowledgeBase knowledgeBase){
        try {
            directory.getBaseDirectory().put(knowledgeBase.getKnowledgeId(), knowledgeBase);
        }catch(Exception e){
            return false;
        }
        return true;
    }
    private String validateKnowledgeBase(KnowledgeBase knowledgeBase){
       String validationNote = null;
       //validation
        if(knowledgeBase != null){
            if(knowledgeBase.getKnowledgeId() == null || knowledgeBase.getKnowledgeId().isEmpty()){
                validationNote = "knowledgeId is required";
            }// add other validations
        }
       return validationNote;
    }

    public Map<String,String> getKnowledgeBaseWithCategories(){
        directory.getBaseDirectory();
}
}
