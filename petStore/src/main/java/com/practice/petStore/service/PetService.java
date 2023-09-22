package com.practice.petStore.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.practice.petStore.model.Pet;


@Service
public class PetService {
    

    //Petのリストを定義
    private List<Pet> AllPets = new ArrayList<> (Arrays.asList(
            new Pet(1,
                    new Pet().new Category(1, "dog"),
                    "taro",
                    new ArrayList<String> (Arrays.asList("url1", "url2")), 
                    new ArrayList<>(Arrays.asList(
                            new Pet().new Tag(1, "dog"),
                            new Pet().new Tag(2, "白"))),
                    "available"), 
            new Pet(2,
                    new Pet().new Category(1, "dog"),
                    "taro",
                    new ArrayList<String> (Arrays.asList("url3", "url4")), 
                    new ArrayList<>(Arrays.asList(
                            new Pet().new Tag(1, "dog"),
                            new Pet().new Tag(2, "黒"))),
                    "pending"), 
            new Pet(3,
                    new Pet().new Category(2, "cat"),
                    "tama",
                    new ArrayList<String> (Arrays.asList("url5", "url6", "url7")),
                    new ArrayList<>(Arrays.asList(
                            new Pet().new Tag(1, "cat"),
                            new Pet().new Tag(2, "灰色")))
                    ,"sold")));
    
    
    //すべてのPetを取得
    public List<Pet> getAllPets(){
        return AllPets;
    }
            
    //新しくPetを追加
    public void addPets(Pet pet) {
        AllPets.add(pet);
    }
   
    
    
   

}