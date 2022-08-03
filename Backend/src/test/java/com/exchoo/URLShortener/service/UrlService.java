package com.exchoo.URLShortener.service;

import com.exchoo.URLShortener.repository.UrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UrlService {

    @Autowired
    private UrlRepository urlRepository;



    public String getOriginlUrl(String id) {
        return urlRepository.findByshortUrL(id);
    }

    public String generateShortUrl(String url) {
        return "test";
    }
}
