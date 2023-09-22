package com.practice.petStore.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pet {
    private int id;
    private Category category;
    private String name;
     List<String> photoUrls;  //= new ArrayList<String>();
     List<Tag> tags;    // Map<Integer, String> tags;  //= new TreeMap<Integer, String>();
    private String status;
    
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public class Category {
        private int id;
        private String name;
    }
    
    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public class Tag {
         int id;
         String name;
    }
    

}


