package com.genesys.knowledgecenter.directory;

import com.genesys.knowledgecenter.response.KnowledgeBase;

import java.util.HashMap;
import java.util.Map;

//creating directory as DB is not available, its singleton - not covered all singleton scenarios
public class KnowledgeBaseDirectory {
    private KnowledgeBaseDirectory(){

    }
    public static KnowledgeBaseDirectory getInstance(){
        return new KnowledgeBaseDirectory();
    }
    Map<String, KnowledgeBase> baseDirectory = new HashMap<>();

    public Map<String, KnowledgeBase> getBaseDirectory() {
        return baseDirectory;
    }

    public void setBaseDirectory(Map<String, KnowledgeBase> baseDirectory) {
        this.baseDirectory = baseDirectory;
    }
}
