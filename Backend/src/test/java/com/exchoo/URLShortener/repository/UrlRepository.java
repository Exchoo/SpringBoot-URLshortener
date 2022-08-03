package com.exchoo.URLShortener.repository;

import com.exchoo.URLShortener.modal.Url;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UrlRepository extends JpaRepository<Url,Integer> {
    @Query(value = "select originalUrl from url where shortUrl =?1",nativeQuery = true)
    String findByshortUrL(String id);
}
