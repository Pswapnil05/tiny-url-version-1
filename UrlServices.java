package com.project.url;

import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class UrlServices {

  private List<Url> URL = new ArrayList<Url>();
  Url url = null;

  public void createUrl(String longUrl) {
    String shortUrl = Long.toString(Math.abs(longUrl.hashCode()));
    System.out.println("short url generated: "+shortUrl);
    URL.add(new Url(longUrl, shortUrl, LocalDateTime.now()));
    return ;
  }

  public String getLongUrl(String shortUrl) {
    return URL.stream().filter(url1 -> url1.getShortURL().equals(shortUrl)).findFirst().get().getLongURL();
  }


  public List<Url> getAllUrl() { return URL; }

}
