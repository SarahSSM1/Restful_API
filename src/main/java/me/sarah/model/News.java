package me.sarah.model;

import jakarta.persistence.Entity;

@Entity(name = "tb_news")
public class News extends BaseItem{
//foi usado uma classe abstrata para evitar duplicar codigo 
// nas classes news.jav e em feature.java
}
