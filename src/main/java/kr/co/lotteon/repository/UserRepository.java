package kr.co.lotteon.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import kr.co.lotteon.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, String> {

	
}
