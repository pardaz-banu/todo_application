package com.example.todoapplication.Repository;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import model.Todo;

@Repository
@SpringBootApplication
public interface todoAppRepository extends JpaRepository<Todo, String> {
	

}
