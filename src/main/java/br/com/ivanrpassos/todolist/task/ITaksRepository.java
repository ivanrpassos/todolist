package br.com.ivanrpassos.todolist.task;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ITaksRepository extends JpaRepository<TaskModel, UUID> {
}
