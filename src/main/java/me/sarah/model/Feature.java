package me.sarah.model;

import jakarta.persistence.Entity;

@Entity(name = "tb_feature")
public class Feature extends BaseItem {
//foi usado uma classe abstrata BaseItem para evitar duplicar codigo 
// nas classes news.jav e em feature.java
}
