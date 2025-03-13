package com.itschool.springbootdeveloper.service;

import com.itschool.springbootdeveloper.domain.Article;
import com.itschool.springbootdeveloper.network.request.ArticleRequest;
import com.itschool.springbootdeveloper.network.response.ArticleResponse;
import com.itschool.springbootdeveloper.repository.BlogRepository;
import com.itschool.springbootdeveloper.service.base.CrudService;
import lombok.RequiredArgsConstructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class BlogService extends CrudService<ArticleRequest, ArticleResponse, Article> {
    public BlogService(JpaRepository<Article, Long> baseRepository) {
        super(baseRepository);
    }

    @Override
    protected Article convertBaseEntityFromRequest(ArticleRequest requestEntity) {
        return requestEntity.toEntity();
    }

    @Override
    protected ArticleResponse response(Article entity) {
        return new ArticleResponse(entity);
    }

}
