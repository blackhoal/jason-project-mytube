package com.jason.myonlytube.persistence;

import com.jason.myonlytube.model.BoardEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BoardRepository extends JpaRepository<BoardEntity, String> {

    List<BoardEntity>findByUserId(String userId);
}
