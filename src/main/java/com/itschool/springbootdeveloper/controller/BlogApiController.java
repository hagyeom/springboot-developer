package com.itschool.springbootdeveloper.controller;

import com.itschool.springbootdeveloper.controller.base.CrudController;
import com.itschool.springbootdeveloper.domain.Article;
import com.itschool.springbootdeveloper.network.request.ArticleRequest;
import com.itschool.springbootdeveloper.network.response.ArticleResponse;
import com.itschool.springbootdeveloper.service.BlogService;
import com.itschool.springbootdeveloper.service.base.CrudService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // HTTP Response Body에 객체 데이터를 JSON 형식으로 반환하는 컨트롤러
@RequestMapping("/api/articles")
public class BlogApiController extends CrudController<ArticleRequest, ArticleResponse, Article> {
    @Autowired
    public BlogApiController(CrudService<ArticleRequest, ArticleResponse, Article> baseService) { // BlogService
        super(baseService);
    }
}
