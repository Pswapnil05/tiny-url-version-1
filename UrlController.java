package com.project.url;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import java.util.List;
@RequestMapping("/rest/url")
@RestController
public class UrlController {
  @Autowired
  private UrlServices urlServices;

  @PostMapping
  public void create(@RequestBody String longUrl) {

    urlServices.createUrl(longUrl);
  }


  @GetMapping
  public List<Url> getUrl() { return urlServices.getAllUrl(); }

  @GetMapping("/{shortUrl}")
  public String getUrl(@PathVariable String shortUrl) {
    return urlServices.getLongUrl(shortUrl);
  }
}
