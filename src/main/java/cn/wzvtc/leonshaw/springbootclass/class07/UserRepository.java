package cn.wzvtc.leonshaw.springbootclass.class07;

import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}