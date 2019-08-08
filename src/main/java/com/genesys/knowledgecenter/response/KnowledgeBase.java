package com.genesys.knowledgecenter.response;

import java.util.List;
import java.util.Map;

public class KnowledgeBase {
   private String knowledgeId;
   private String knowledgeDescription;
   private Map<String, List<Document>> categoriesWithDocs;

    public String getKnowledgeId() {
        return knowledgeId;
    }

    public void setKnowledgeId(String knowledgeId) {
        this.knowledgeId = knowledgeId;
    }

    public String getKnowledgeDescription() {
        return knowledgeDescription;
    }

    public void setKnowledgeDescription(String knowledgeDescription) {
        this.knowledgeDescription = knowledgeDescription;
    }

    public Map<String, List<Document>> getCategoriesWithDocs() {
        return categoriesWithDocs;
    }

    public void setCategoriesWithDocs(Map<String, List<Document>> categoriesWithDocs) {
        this.categoriesWithDocs = categoriesWithDocs;
    }
}
