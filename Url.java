package com.project.url;

import java.time.LocalDateTime;

public class Url {

  private String longURL;
  private String shortURL;
  private LocalDateTime created;

  public Url () { }

  public Url (String longURL, String shortURL, LocalDateTime created) {
          this.longURL = longURL;
          this.shortURL = shortURL;
          this.created = created;
  }

  public String getLongURL() { return longURL; }
  public void setLongURL(String longURL) { this.longURL = longURL; }
  public String getShortURL() { return shortURL; }
  public void setShortURL(String shortURL) { this.shortURL = shortURL; }
  public LocalDateTime getCreated() { return created; }
  public void setCreated(LocalDateTime created) { this.created = created; }
}
