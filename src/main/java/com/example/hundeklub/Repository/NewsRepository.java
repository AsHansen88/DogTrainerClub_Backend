package com.example.hundeklub.Repository;

import com.example.hundeklub.Model.NewsModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository <NewsModel, String>  {
}
