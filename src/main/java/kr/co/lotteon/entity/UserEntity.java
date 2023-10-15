package kr.co.lotteon.entity;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.Map;

import org.hibernate.annotations.CreationTimestamp;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.oauth2.core.user.OAuth2User;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@Entity
@Table(name = "User")
public class UserEntity {

	@Id
	private String uid;
	private String pass;
	private String name;
	private int age;
	private String hp;
	private String role;
	@CreationTimestamp
	private LocalDateTime regDate;


	
	
}
