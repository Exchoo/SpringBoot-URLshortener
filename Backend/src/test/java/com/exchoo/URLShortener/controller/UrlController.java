package com.exchoo.URLShortener.controller;

import com.exchoo.URLShortener.modal.Url;
import com.exchoo.URLShortener.service.UrlService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("url/shortener")
public class UrlController {

    @Autowired
    private UrlService urlService;

    @GetMapping("/{id}")
    public String getOriginalUrl(@PathVariable String id){
        return urlService.getOriginlUrl(id);
    }

    @PostMapping
    public String generateShortUrl(@RequestBody String url){
        return "urlService.generateShortUrl(url)";

    }

    public function test()
    {

    }

}
