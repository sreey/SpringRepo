package com.sree.springboot.elasticsearch.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.collect.Lists;
import com.sree.springboot.domain.User;
import com.sree.springboot.elasticsearch.document.Article;
import com.sree.springboot.elasticsearch.service.ArticleService;

@RestController
public class ArticleController {

	@Autowired
	private ArticleService articleService;
	
	@GetMapping("/articles")
	public List<Article> getCustomers() {
		Iterable<Article> articles = articleService.findAll();
		return Lists.newArrayList(articles);
	}
	
	@PostMapping("/articles")
	public ResponseEntity<User> saveCustomers() {
		List<Article> articles = new ArrayList<>();
		articles.add(new Article(1L, "Title book one"));
		articles.add(new Article(2L, "Title book two"));
		articles.add(new Article(3L, "Title book three"));
		articleService.saveList(articles);
		return new ResponseEntity<>(HttpStatus.OK);
	}
	
}
